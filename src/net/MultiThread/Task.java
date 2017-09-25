package net.MultiThread;

import java.io.*;
import java.net.Socket;

/**
 * Created by xuan on 2017/9/1 0001.
 */
public class Task implements Runnable {
    private Socket socket = null;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        if (this.socket == null) return;
        StringBuilder sb = new StringBuilder("");
        String temp = null;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while ((temp = in.readLine()) != null) {
                sb.append(temp);
            }
            Thread.sleep(1000);
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            closeStream(in);
            closeSocket(socket);
        }
    }

    private void closeSocket(Socket socket) {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeStream(Reader in) {
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
