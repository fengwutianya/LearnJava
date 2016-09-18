package concurrency;

/**
 * Created by xuan on 2016/9/18 0018.
 */
class Sleeper extends Thread {
    private int duration;
    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() +
                                " was interrupted. " +
                                "isInterrupted(): " +
                                isInterrupted());
        }
        System.out.println(getName() + " has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }
    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + " join completed");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper
                sleepy = new Sleeper("sleepy", 1500),
                grumpy = new Sleeper("grumpy", 1500);
        Joiner
                dopey = new Joiner("dopey", sleepy),
                doc   = new Joiner("Doc", grumpy);
        //�̱߳���һ���̴߳��ʱ�����ñ�־λ��isInterrupted()Ϊtrue
        //Ȼ��catch���쳣��ʱ���ֱ���Ϊfalse
        //join�ȵ���join���߳̽�����ʱ���ִ��
        grumpy.interrupt();
    }
}

/* output:
grumpy was interrupted. isInterrupted(): false
grumpy has awakened
Doc join completed
sleepy has awakened
dopey join completed
 */
