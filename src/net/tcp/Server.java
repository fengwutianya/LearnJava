package net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xuan on 2017/8/31 0031.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1555);
        while (true) {
            try {
                Socket socket = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = "";
                String temp;
                while ((temp = in.readLine()) != null) {
                    message += temp;
                }
                PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                out.write(message);
                out.flush();
                socket.shutdownOutput();
                in.close();
                out.close();
                socket.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
