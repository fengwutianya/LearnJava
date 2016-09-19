package concurrency;

/**
 * Created by xuan on 2016/9/19 0019.
 */
public class SynchronizedEvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
