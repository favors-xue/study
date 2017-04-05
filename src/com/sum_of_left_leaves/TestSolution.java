package com.sum_of_left_leaves;

/**
 * Created by shawn on 2017/4/4.
 */
public class TestSolution {
    public static void main (String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        root.left = a;
        TreeNode b = new TreeNode(3);
        a.right = b;
        TreeNode c = new TreeNode(4);
        b.left = c;
        TreeNode d = new TreeNode(5);
        root.right = d;

        Solution s =new Solution();
        System.out.println(s.sumOfLeftLeaves(root));
    }
}
