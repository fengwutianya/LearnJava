package concurrency.atomic;

/**
 * Created by xuan on 2017/8/29 0029.
 */
public class IntegerMultiThreadTest implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        IntegerMultiThreadTest count = new IntegerMultiThreadTest();
        new Thread(count).start();
        new Thread(count).start();
        new Thread(count).start();
        new Thread(count).start();
        new Thread(count).start();
        /**
         * something wrong
         * output
         4999961
         4999962
         4999963
         */
    }
}
