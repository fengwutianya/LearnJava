package algorithms.offer;

import java.util.ArrayList;

/**
 * Created by xuan on 8/18/17.
 */
public class BinaryTreeSumPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        dfs(root, target, 0, result, new ArrayList<Integer>());

        return result;
    }

    //binary tree dfs 3 steps
    private void dfs(TreeNode root, int target, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
        temp.add(root.val);
        sum += root.val;

        if (root.left == null && root.right == null) {
            if (sum == target) result.add(new ArrayList<Integer>(temp));
        }
        if (root.left != null)
            dfs(root.left, target, sum, result, temp);
        if (root.right != null)
            dfs(root.right, target, sum, result, temp);

        temp.remove(temp.size()-1);
    }
}
