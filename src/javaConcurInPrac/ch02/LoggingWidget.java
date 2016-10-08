package javaConcurInPrac.ch02;

/**
 * 重入：获取锁的操作的粒度是线程，
 * 线程调用父类synchronized方法，如果不是重入，
 * 那么会产生死锁
 * Created by xuan on 2016/10/8 0008.
 */
public class LoggingWidget extends Widget{
    @Override
    public synchronized void doSomething() {
        System.out.println(toString() + ": calling doSomething");
        super.doSomething();
    }
}


class Widget {
    public synchronized void doSomething() {

    }
}
