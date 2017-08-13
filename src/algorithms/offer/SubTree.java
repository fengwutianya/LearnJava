package algorithms.offer;

/**
 * Created by xuan on 2017/8/13 0013.
 */
public class SubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return hasSubtree(root1, root2);
    }

    private boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val) {
            if (isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right)) {
                return true;
            }
        }
        return hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root2.val != root1.val) return false;
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2), root2 = new TreeNode(2);
        System.out.println(new SubTree().HasSubtree(root1, root2));
    }
}
