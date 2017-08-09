package concurrency.threadLocal;

/**
 * Created by xuan on 2017/8/10 0010.
 */
public class SequenceA implements Sequence {
    private static int number = 0;
    @Override
    public int getNumber() {
        return ++number;
    }

    public static void main(String[] args) {
        new ClientThread(new SequenceA()).start();
        new ClientThread(new SequenceA()).start();
        new ClientThread(new SequenceA()).start();
//        Sequence sequence = new SequenceA();
//        new ClientThread(sequence).start();
//        new ClientThread(sequence).start();
//        new ClientThread(sequence).start();
    }
}
