package concurrency;

/**
 * 为了说明Runnable并没有并发能力，run()也只是一个普通的方法
 * Created by xuan on 2016/9/16 0016.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
