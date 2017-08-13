package algorithms.offer;

import java.util.ArrayList;

/**
 * Created by xuan on 8/13/17.
 */
public class SumPath {
    private int sum = 0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        dfs(root, target, result, new ArrayList<Integer>());
        return result;
    }

    private void dfs(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if (root == null && sum == target) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        list.add(root.val);
        sum += root.val;
        dfs(root.left, target, result, list);
        dfs(root.right, target, result, list);
        sum -= root.val;
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right =  new TreeNode(1);
        root.right.right = new TreeNode(1);
        System.out.println(new SumPath().FindPath(root, 3).size());
    }
}
