package algorithms.offer;

import java.util.Stack;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class PushPop {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int i = 0, j = 0;
        Stack<Integer> stack = new Stack<>();
        for (; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty()) {
                if (popA[j] == stack.peek()) {
                    j++;
                    stack.pop();
                } else break;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
