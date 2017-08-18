package algorithms.offer;

import java.util.Arrays;

/**
 * Created by xuan on 8/18/17.
 */
public class MoreThanHalfNumber {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        int num = array[array.length/2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                count++;
        }
        if (count > array.length / 2) return num;
        return 0;
    }
}
