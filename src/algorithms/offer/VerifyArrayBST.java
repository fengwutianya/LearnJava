package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class VerifyArrayBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return VerifySquenceOfBST(sequence, 0, sequence.length);
    }

    private boolean VerifySquenceOfBST(int[] sequence, int start, int end) {
        int i;
        for (i = start; i < end; i++) {
            if (isRoot(sequence, i, start, end)) break;
        }
        if (i >= end) return false;
        return VerifySquenceOfBST(sequence, start, i) && VerifySquenceOfBST(sequence, i, end);
    }

    private boolean isRoot(int[] sequence, int i, int start, int end) {
        for (int j = start; j < i; j++) {
            if (sequence[j] > sequence[i]) return false;
        }
        for (int j = i + 1; j < end; j++) {
            if (sequence[j] < sequence[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sequence = {1,2,3,5,4};
        System.out.println(
        new VerifyArrayBST().VerifySquenceOfBST(sequence));
    }
}
