package com.binary_tree_paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn on 2017/4/4.
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        return findPath(root,String.valueOf(root.val),paths);
    }

    public List<String> findPath(TreeNode root,String path,List<String> paths) {
        if(root.left == null && root.right == null) {

            paths.add(path);
            return paths;
        }

        if(root.left != null) {
            findPath(root.left,path + "->" +root.left.val,paths);

        }
        if(root.right != null) {
            findPath(root.right,path + "->" +root.right.val,paths);
        }

        return paths;
    }


}
