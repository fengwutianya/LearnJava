package net.MultiThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xuan on 2017/9/1 0001.
 */
public class MultiThreadServer {
    public static void main(String[] args) throws IOException {
        ExecutorService excetuor = Executors.newFixedThreadPool(2);
        ServerSocket server = new ServerSocket(9999);
        while (true) {
            Socket socket = server.accept();
            excetuor.submit(new Task(socket));
        }
    }
}
