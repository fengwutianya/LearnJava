package algorithms.offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by xuan on 8/18/17.
 */
public class PriorityQueueUsage {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k > input.length || k == 0) return new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(input[i]);
            } else {
                int num = priorityQueue.peek();
                if (num > input[i]) {
                    priorityQueue.poll();
                    priorityQueue.add(input[i]);
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            result.add(priorityQueue.poll());
        }
        return result;
    }
}
