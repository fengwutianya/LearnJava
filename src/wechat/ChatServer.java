package wechat;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatServer {
    private static List<Client> clients = new LinkedList<Client>();


    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        while (true) {
            try {
                ss = new ServerSocket(8888);
                s = ss.accept();
                Client c = new ChatServer().new Client(s);
                new Thread(c).start();
                clients.add(c);

            } catch (IOException e) {
                System.out.println("cannot bind to port 8888");
                System.exit(-1);
            } finally {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class Client implements Runnable {
        private Socket s;
        private DataInputStream dis = null;
        private DataOutputStream dos = null;
        private boolean bConnected = false;

        public Client(Socket s) {
            this.s = s;
            try {
                dis = new DataInputStream(s.getInputStream());
                dos = new DataOutputStream(s.getOutputStream());
                bConnected = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void send(String str) {
            try {
                dos.writeUTF(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                while (bConnected) {
                    String str = dis.readUTF();
                    System.out.println(this+" "+str);
                    for (int i = 0; i < clients.size(); i++) {
                        Client c = clients.get(i);
                        c.send(str);
                    }

                }
            } catch (IOException e) {
                System.out.println(this+" Client closed!");
            } finally {
                try {
                    if (dis != null) dis.close();
                    if (dos != null) dos.close();
                    if (s != null) s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

