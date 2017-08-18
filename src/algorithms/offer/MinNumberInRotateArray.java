package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0) return 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) return array[i+1];
        }
        return 0;
    }
}
