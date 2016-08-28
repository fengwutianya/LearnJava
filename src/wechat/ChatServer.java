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
    ServerSocket ss = null;
    boolean started = true;

    public static void main(String[] args) {
        new ChatServer().start();
    }

    public void start() {
        try {
            ss = new ServerSocket(8888);
            started = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while (started) {
                Socket s = ss.accept();
                Client c = new Client(s);
                new Thread(c).start();
                clients.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
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
                        if (c.equals(this)) continue;
                        c.send(str);
                        System.out.println(" a String sent." + str);
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

