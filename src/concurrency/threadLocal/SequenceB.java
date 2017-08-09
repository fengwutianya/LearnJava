package concurrency.threadLocal;

/**
 * Created by xuan on 2017/8/10 0010.
 */
public class SequenceB implements Sequence {
    private static ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) {
        new ClientThread(new SequenceB()).start();
        new ClientThread(new SequenceB()).start();
        new ClientThread(new SequenceB()).start();
    }
}
