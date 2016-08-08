package wechat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatServer {

    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        while (true) {
            try {
                ss = new ServerSocket(8888);
                s = ss.accept();
                new Thread(new Client(s)).start();
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
}

class Client implements Runnable {
    private Socket s;
    private DataInputStream dis = null;
    private boolean bConnected = false;

    public Client(Socket s) {
        this.s = s;
        try {
            dis = new DataInputStream(s.getInputStream());
            bConnected = true;
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
            }
        } catch (IOException e) {
            System.out.println(this+" Client closed!");
        } finally {
            try {
                if (dis != null) dis.close();
                if (s != null) s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
