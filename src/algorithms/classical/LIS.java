package algorithms.classical;

/**
 * 这类题主要是要考虑包含当前结点的值，和包含前面节点的值的关系
 * Created by xuan on 2017/8/11 0011.
 */
public class LIS {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null) return 0;
        int len = nums.length;
        if (len < 2) return len;
        int[] lis = new int[len];
        lis[0] = 1;
        int maxLen = 1;
        for (int i = 1; i < len; i++) {
            int max = 1;
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    max = Math.max(1+lis[j], max);
                }
            }
            lis[i] = max;
            maxLen = Math.max(maxLen, max);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18, 1000};
        System.out.println(lengthOfLIS(arr));
    }
}
