package concurrency;

/**
 * Created by xuan on 2016/9/19 0019.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public void cancel() {
        canceled = true;}
    public boolean isCanceled() {return canceled;}

    public abstract int next();
}
