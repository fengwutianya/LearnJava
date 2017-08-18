package container;

import java.util.Stack;

/**
 * Created by xuan on 2017/8/11 0011.
 */
public class TestStack {
    private Stack<Integer> stack = new Stack<>();

    public void test() {
        stack.push(1);
        stack.push(2);
        int i = stack.pop();
        int j = stack.pop();
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        new TestStack().test();
    }
}
