package concurrency;

/**
 * Created by xuan on 2016/9/19 0019.
 */
public class EvenGenerator extends INT {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator(), 10);
    }
}
