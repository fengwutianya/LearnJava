package algorithms.offer;

import java.util.ArrayList;

/**
 * Created by xuan on 8/13/17.
 */
public class SumPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root != null)
            dfs(root, target, result, new ArrayList<Integer>(), 0);
        return result;
    }

    private void dfs(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int sum) {
//        if (root == null) {
//            if (sum == target) {
//                result.add(new ArrayList<Integer>(list));
//            }
//            return;
//        }
        /**
         * 到叶子结点 上面是错的 我了个去 叶子结点 是指 leave.left == null && leave.right == null
         */
        sum += root.val;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == target)
                result.add(new ArrayList<>(list));
        } else {    //以后就约定好了用if else 而不用return来终止，回溯时要消除影响，传值不用考虑，退栈就没了
                    //传引用的要注意消除影响，比方说这里的list.remove
                    //妈蛋 这么简单的一个dfs豆写不对，没有什么可以骄傲的了
            if (root.left != null)
                dfs(root.left, target, result, list, sum);
            if (root.right != null)
                dfs(root.right, target, result, list, sum);
        }
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
