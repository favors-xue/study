package com.binary_tree_paths;

import java.util.List;

/**
 * Created by shawn on 2017/4/4.
 */
public class TestSolution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode right1 = new TreeNode(3);
        root.right = right1;
        Solution s = new Solution();
        List<String> test = s.binaryTreePaths(root);

    }
}
