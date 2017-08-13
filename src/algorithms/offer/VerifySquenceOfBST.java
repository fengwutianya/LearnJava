package algorithms.offer;

/**
 * Created by xuan on 8/13/17.
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return verifySequenceOfBST(sequence, 0, sequence.length);
    }

    private boolean verifySequenceOfBST(int[] sequence, int start, int end) {
        if (end-1 <= start) return true;
        int root = sequence[end-1];
        int i;
        for (i = start; i < end-1; i++) {
            if (sequence[i] > root) break;
        }
        for (; i < end-1; i++) {
            if (sequence[i] < root) break;
        }
        if (i != end-1) return false;
        return verifySequenceOfBST(sequence, start, i) &&
                verifySequenceOfBST(sequence, i, end-1);
    }
}
