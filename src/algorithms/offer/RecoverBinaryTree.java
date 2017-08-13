package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class RecoverBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return recurse(pre, in, 0, 0, pre.length);
    }

    private TreeNode recurse(int[] pre, int[] in, int preStart, int inStart, int length) {
        if (length == 0) return null;
        int nodeVal = pre[preStart];
        TreeNode node = new TreeNode(nodeVal);
        int partion = findPartion(in, nodeVal);
        node.left = recurse(pre, in, preStart+1, inStart, partion-inStart);
        node.right = recurse(pre, in, preStart+partion-inStart+1, partion+1, length-(partion-inStart)-1);
        return node;
    }

    private int findPartion(int[] in, int nodeVal) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == nodeVal) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode node = new RecoverBinaryTree().reConstructBinaryTree(pre, in);
        preTraverse(node);
        System.out.println();
        inTraverse(node);
    }

    private static void inTraverse(TreeNode node) {
        if (node != null) {
            inTraverse(node.left);
            System.out.print(node.val + " ");
            inTraverse(node.right);
        }
    }

    private static void preTraverse(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preTraverse(node.left);
            preTraverse(node.right);
        }
    }
}
