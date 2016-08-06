package wechat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatServer {
    public static void main(String[] args) {
        boolean started = false;
        try {
            ServerSocket ss = new ServerSocket(8888);
            started = true;
            while (started) {
                boolean connected = false;
                Socket s = ss.accept();
                System.out.println("A client connected.");
                connected = true;
                DataInputStream dis = new DataInputStream(s.getInputStream());
                while (connected) {
                    String s1 = dis.readUTF();
                    System.out.println(s1);
                }
                dis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
