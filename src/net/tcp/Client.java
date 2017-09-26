package net.tcp;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by xuan on 2017/8/31 0031.
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("localhost", 1555));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        out.write("Hello");
        Thread.sleep(3000);
        out.write(" world!");
        out.flush();
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = "";
        String temp = null;
        while ((temp = br.readLine()) != null) {
            message += temp;
        }
        System.out.println(message);
        br.close();
        out.close();
        socket.close();
    }
}
