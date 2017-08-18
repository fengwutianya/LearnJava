package algorithms.offer;

/**
 * Created by xuan on 2017/8/14 0014.
 */
public class BSTtoDoubleDirectionList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null) return pRootOfTree;
        TreeNode leftList = null, rightList = null;
        if (pRootOfTree.left != null)
            leftList = Convert(pRootOfTree.left);
        if (pRootOfTree.right != null)
            rightList = Convert(pRootOfTree.right);
        if (leftList != null) {
            TreeNode temp = leftList;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = pRootOfTree;
            pRootOfTree.left = temp;
        }
        pRootOfTree.right = rightList;
        if (rightList != null)
            rightList.left = pRootOfTree;
        return leftList == null ? pRootOfTree : leftList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(10);
        TreeNode list = new BSTtoDoubleDirectionList().Convert(root);
        while (list != null) {
            System.out.println(list.val);
            list = list.right;
        }
    }
}
