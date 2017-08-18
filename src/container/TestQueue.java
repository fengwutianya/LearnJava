package container;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by xuan on 2017/8/11 0011.
 */
public class TestQueue {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();

    public void testQueue() {
        queue1.add(1);
        queue1.add(2);
        int i = queue1.poll();
        int j = queue1.poll();
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        new TestQueue().testQueue();
    }
}
