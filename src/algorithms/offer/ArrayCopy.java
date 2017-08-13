package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class ArrayCopy {
    public void reOrderArray(int [] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) result[index++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) result[index++] = array[i];
        }
        System.arraycopy(result, 0, array, 0, array.length);
    }
}
