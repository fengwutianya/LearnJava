package algorithms.offer;

import java.util.ArrayList;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class ShunShiZhen {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        printMatrix(matrix, result, 0, 0, matrix.length-1, matrix[0].length-1);
        return result;
    }

    private void printMatrix(int[][] matrix, ArrayList<Integer> result, int i, int j, int ilen, int jlen) {
        if (i > ilen || j > jlen) return;
        for (int k = j; k <= jlen; k++) {
            result.add(matrix[i][k]);
        }
        i++;
        if (i > ilen || j > jlen) return;
        for (int k = i; k <= ilen; k++) {
            result.add(matrix[k][jlen]);
        }
        jlen--;
        if (i > ilen || j > jlen) return;
        for (int k = jlen; k >= j; k--) {
            result.add(matrix[ilen][k]);
        }
        ilen--;
        if (i > ilen || j > jlen) return;
        for (int k = ilen; k >= i; k--) {
            result.add(matrix[k][j]);
        }
        j++;
        printMatrix(matrix, result, i, j, ilen, jlen);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2}
//                {1,2,3},
//                {10,11,4},
//                {9,12,5},
//                {8,7,6}
        };
        ArrayList<Integer> list = new ShunShiZhen().printMatrix(matrix);
        for (int i: list) {
            System.out.print(i + " ");
        }
    }
}
