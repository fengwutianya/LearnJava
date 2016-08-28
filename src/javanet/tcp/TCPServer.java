package javanet.tcp;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
/**
 * Created by xuan on 2016/7/3 0003.
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        while (true) {
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }
    }
}
