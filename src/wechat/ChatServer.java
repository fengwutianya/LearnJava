package wechat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
/**
 * Created by xuan on 2016/8/6 0006.
 */
public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket s = ss.accept();
                System.out.println("A client connected.");
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String s1 = dis.readUTF();
                System.out.println(s1);
                dis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
