package wechat;

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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
