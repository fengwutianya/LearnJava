package algorithms.offer;

/**
 * Created by xuan on 2017/8/14 0014.
 */
public class RandomListClone {
    public RandomListNode Clone(RandomListNode pHead) {
        copyList(pHead);
        adjustList(pHead);
        RandomListNode result = deleteUnusefulNode(pHead);
        return result;
//        return pHead;
    }

    private RandomListNode deleteUnusefulNode(RandomListNode pHead) {
        RandomListNode result = pHead.next;
        while (result.next != null) {
            result.next = result.next.next;
            result = result.next;
        }
        return pHead.next;
    }

    private void adjustList(RandomListNode pHead) {
        while (pHead != null) {
            RandomListNode q = pHead.next;
            if (pHead.random != null)
                q.random = pHead.random.next;
            pHead = q.next;
        }
    }

    private void copyList(RandomListNode pHead) {
        while (pHead != null) {
            RandomListNode node = new RandomListNode(pHead.label);
            node.next = pHead.next;
            pHead.next = node;
            pHead = node.next;
        }
    }

    public static void main(String[] args) {
        RandomListNode pHead = new RandomListNode(1);
        pHead.next = new RandomListNode(2);
        pHead.next.random = pHead;
        RandomListNode node = new RandomListClone().Clone(pHead);
        while (node != null) {
            System.out.println(node.label);
            if (node.random != null)
                System.out.println(node.random.label);
            node = node.next;
        }
    }
}
