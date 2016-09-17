package concurrency;

/**
 * Ϊʲô��Runnable�ӿڣ�������һ��Լ������
 * Լ����Thread���캯������һ��ʵ����Runnable�ӿ�
 * ��������ã�����һ����run()������Ϊһ���߳�����
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
