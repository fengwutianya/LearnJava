package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by xuan on 2016/9/17 0017.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
//            System.out.println(i);
        }
        exec.shutdown();
//        exec.execute(new LiftOff()); wrong cannot do that after shutdown
    }
}
