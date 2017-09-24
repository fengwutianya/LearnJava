package concurrency.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xuan on 2017/9/24.
 */
public class ScheduledExecutorTest {
    public ScheduledExecutorService scheduledExecutor =
            Executors.newScheduledThreadPool(1);

    public void lanuchTime() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("run time exception");
//                System.out.println("hello world");
            }
        };
        scheduledExecutor.scheduleWithFixedDelay(task, 1000*5, 1000*10, TimeUnit.MILLISECONDS);
    }

    public void addOneTask() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("welcome to china");
            }
        };
        scheduledExecutor.scheduleWithFixedDelay(task, 1000*1, 1000, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorTest test = new ScheduledExecutorTest();
        test.lanuchTime();
        Thread.sleep(5000);
        test.addOneTask();
    }
}
