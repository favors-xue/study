package com.binary_tree_vertical_order_traversal;

import java.util.List;

/**
 * Created by shawn on 2017/6/18.
 */
public class TestSolution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node_1 = new TreeNode(9);
        root.left = node_1;
        TreeNode node_2 = new TreeNode(20);
        root.right = node_2;
        TreeNode node_3 = new TreeNode(15);
        node_2.left = node_3;
        TreeNode node_4 = new TreeNode(7);
        node_2.right = node_4;
        Solution s = new Solution();
        List<List<Integer>> result = s.verticalOrder(root);

    }
}
