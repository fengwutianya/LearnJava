package javanet.tcp;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
/**
 * Created by xuan on 2016/7/3 0003.
 */
public class TestServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            while (true) {
                Socket s = ss.accept();
                OutputStream outputStream = s.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("Hello, " + s.getInetAddress() +
                " port#" + s.getPort() + " byebye!");
                dataOutputStream.close();
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("server running error: " + e);
        }
    }
}
