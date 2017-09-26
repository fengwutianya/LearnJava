package concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xuan on 2017/8/29 0029.
 */
public class AtomicIntegerTest implements Runnable {
    private AtomicInteger integer = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(integer.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AtomicIntegerTest atomicIntegerTest = new AtomicIntegerTest();
        new Thread(atomicIntegerTest).start();
        new Thread(atomicIntegerTest).start();
        new Thread(atomicIntegerTest).start();
        new Thread(atomicIntegerTest).start();
        new Thread(atomicIntegerTest).start();
    }
}
