package container;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by xuan on 2017/8/11 0011.
 */
public class TestDeque {
    private Deque<Integer> deque1 = new ArrayDeque<>();
    private Deque<Integer> deque2 = new LinkedList<>();

    public void test() {
        deque1.addFirst(1);
        deque1.addLast(2);
        int i = deque1.removeFirst();
        int j = deque1.removeLast();
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        new TestDeque().test();
    }
}
