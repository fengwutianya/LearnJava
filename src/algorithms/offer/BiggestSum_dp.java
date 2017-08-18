package algorithms.offer;

/**
 * Created by xuan on 8/18/17.
 */
public class BiggestSum_dp {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] sum = new int[array.length];
        sum[0] = array[0];
        int max = sum[0];
        for (int i = 1; i < array.length; i++) {
            if (sum[i-1] <= 0) sum[i] = array[i];
            else sum[i] = sum[i-1] + array[i];
            max = Math.max(max, sum[i]);
        }
        return max;
    }
}
