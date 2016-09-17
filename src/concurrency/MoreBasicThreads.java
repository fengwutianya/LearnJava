package concurrency;

/**
 * Created by xuan on 2016/9/16 0016.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            /*
            这里并没有保存Thread对象，但是垃圾回收器在
            run()执行完之前并不会回收他们，因为每个Thread对象
            都注册了他自己。
             */
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting to LiftOff");
    }
}
