package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xuan on 2016/9/19 0019.
 */
public class EvenChecker implements Runnable {
    private intGenerator generator;
    private final int id;

    public EvenChecker(intGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCancled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " is not even");
                generator.cancle();
            }
        }
    }

    public static void test(intGenerator gp, int count) {
        ExecutorService exec =
                Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i));
        }
        exec.shutdown();
    }

    public static void test(intGenerator gp) {
        test(gp, 10);
    }
}
