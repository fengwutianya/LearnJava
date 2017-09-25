package net.MultiThread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * Created by xuan on 2017/9/1 0001.
 */
public class StupidClient {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Client().start();
        }
    }
}
class Client extends Thread {
    public void run() {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("localhost", 9999));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.write("hello, I am ");
//            TimeUnit.MILLISECONDS.sleep(20000);
            out.write(Thread.currentThread().getName());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
