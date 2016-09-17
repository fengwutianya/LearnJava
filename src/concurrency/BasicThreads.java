package concurrency;

/**
 * Created by xuan on 2016/9/16 0016.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting to LiftOff");
    }
}
