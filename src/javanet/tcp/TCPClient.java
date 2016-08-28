package javanet.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
/**
 * Created by xuan on 2016/7/3 0003.
 */
public class TCPClient {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("127.0.0.1", 6666);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello server");
        dos.flush();
        dos.close();
        s.close();
    }
}