package concurrency;

/**
 * Created by xuan on 2016/9/16 0016.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            /*
            ���ﲢû�б���Thread���󣬵���������������
            run()ִ����֮ǰ������������ǣ���Ϊÿ��Thread����
            ��ע�������Լ���
             */
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting to LiftOff");
    }
}
