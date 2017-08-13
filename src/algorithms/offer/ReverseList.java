package algorithms.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class ReverseList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        reverse(listNode, list);
        return list;
    }

    private void reverse(ListNode listNode, ArrayList<Integer> list) {
        if (listNode == null) return;
        reverse(listNode.next, list);
        list.add(listNode.val);
    }
}
