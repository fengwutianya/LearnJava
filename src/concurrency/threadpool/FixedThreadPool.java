package concurrency.threadpool;

import concurrency.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xuan on 2016/9/17 0017.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 7; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
