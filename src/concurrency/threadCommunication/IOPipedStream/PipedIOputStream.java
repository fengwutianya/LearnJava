package concurrency.threadCommunication.IOPipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by xuan on 2017/8/30 0030.
 */
public class PipedIOputStream {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            pis.connect(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Producer(pos).start();
        new Consumer(pis).start();
        new Consumer(pis).start();
    }
}

class Producer extends Thread {
    private PipedOutputStream out;
    private int productID = 0;
    public Producer(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Producer: " + Thread.currentThread().getName() +
                        " produced " + productID);
                    this.out.write(productID++);
                }
                Thread.sleep(5000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private PipedInputStream in;

    public Consumer(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            int productID;
            while (true) {
                productID = this.in.read();
                System.out.println("Consumer: " + Thread.currentThread().getName() +
                    " consumed product: " + productID);
                Thread.sleep(500);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
