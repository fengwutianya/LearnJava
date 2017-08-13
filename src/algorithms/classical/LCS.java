package algorithms.classical;

/**动态规划 最长公共子串 最优子结构，重叠子性质，备忘录方法
 * Created by xuan on 2017/8/11 0011.
 */
public class LCS {
    public static int comString(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return 0;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 == 0 && len2 == 0) return 0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        //界限 多加一行一列 用0填充
        int[][] lcs = new int[len1+1][len2+1];
        for (int i = 0; i <= len1; i++) {
            lcs[i][0] = 0;
        }
        for (int i = 0; i <= len2; i++) {
            lcs[0][i] = 0;
        }
        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                //注意设置边界了，那么取原值的时候 序号减一
                if (chars1[i-1] == chars2[j-1]) lcs[i][j] = 1 + lcs[i-1][j-1];
                else lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
            }
        }
        return lcs[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(comString("abc", "bacd"));
    }
}
