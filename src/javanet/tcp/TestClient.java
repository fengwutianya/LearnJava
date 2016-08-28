package javanet.tcp;

import java.net.*;
import java.io.*;
/**
 * Created by xuan on 2016/7/3 0003.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8888);
            DataInputStream dataInputStream = new DataInputStream(s.getInputStream());
            System.out.println(dataInputStream.readUTF());
            dataInputStream.close();
            s.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("failed to connect the server: " + exception);
        }
    }
}
