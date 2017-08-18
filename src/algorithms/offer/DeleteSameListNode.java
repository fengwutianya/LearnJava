package algorithms.offer;

/**
 * Created by xuan on 8/18/17.
 */
public class DeleteSameListNode {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode result = pHead;
        while (pHead.next != null) {
            if (pHead.val == pHead.next.val) {
                pHead.next = pHead.next.next;
            } else {
                pHead = pHead.next;
            }
        }
        return result;
    }
}
