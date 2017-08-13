package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class SortedArrayFindInteger {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) return false;
        return dfs(target, array, 0, 0, array.length, array[0].length);
    }

    private boolean dfs(int target, int[][] array, int i, int j, int i1, int j1) {
        if (i == i1 || j == j1) return false;
        if (array[i][j] > target) return false;
        int row = i;
        int column = j;
        for (; j < j1; j++) {
            int num = array[i][j];
            if (num == target) return true;
            if (num > target) break;
        }
        for (; i < i1; i++) {
            int num = array[i][j-1];
            if (num == target) return true;
            if (num > target) break;
        }
        return dfs(target, array, row, j, i, j1) ||
                dfs(target, array, i, column, i1, j) ||
                dfs(target, array, i, j, i1, j1);
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 7, 8},
                {2, 3, 4, 5, 7, 8, 9},
                {3, 4, 5, 7, 8, 9, 10}
        };
        System.out.println(new SortedArrayFindInteger().Find(10, array));
    }
}
