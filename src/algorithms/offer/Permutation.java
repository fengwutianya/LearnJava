package algorithms.offer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by xuan on 8/18/17.
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        TreeSet<String> result = new TreeSet<>();
        if (str == null || str.length() == 0) return new ArrayList<>();

        char[] chars = str.toCharArray();
        dfs(result, chars, 0);
        return new ArrayList<>(result);
    }

    private void dfs(TreeSet<String> result, char[] chars, int len) {
        if (len == chars.length) {
            String str = new String(chars);
            if (!result.contains(str))
                result.add(str);
            return;
        }
        for (int i = len; i < chars.length; i++) {
            swap(chars, i, len);
            dfs(result, chars, len + 1);
            swap(chars, i, len);
        }
    }

    private void swap(char[] chars, int i, int len) {
        char temp = chars[i];
        chars[i] = chars[len];
        chars[len] = temp;
    }
}
