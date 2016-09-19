package concurrency;

/**
 * Created by xuan on 2016/9/19 0019.
 */
public abstract class INT {
    private volatile boolean cancled = false;

    public void cancle() {cancled = true;}
    public boolean isCancled() {return cancled;}

    public abstract int next();
}
