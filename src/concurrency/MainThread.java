package concurrency;

/**
 * Ϊ��˵��Runnable��û�в���������run()Ҳֻ��һ����ͨ�ķ���
 * Created by xuan on 2016/9/16 0016.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
