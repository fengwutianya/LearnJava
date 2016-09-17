package concurrency;

/**
 * 为什么有Runnable接口，不过是一种约定罢了
 * 约定了Thread构造函数接受一个实现了Runnable接口
 * 的类的引用，其中一定有run()方法作为一个线程任务
 * Created by xuan on 2016/9/16 0016.
 */
public class LiftOff implements Runnable{
    protected int countDown = 10;       //
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + ").";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
