package container;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * Created by xuan on 8/29/17.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2 - t1;
            }
        });
        queue.add(10);
        queue.add(9);
        queue.add(5);

        while (queue.size() > 1) {
            int max = queue.remove();
            int parent = max / 2;
            if (queue.contains(parent))
                continue;
            queue.add(parent);
        }
        System.out.println(queue.remove());
    }
}
