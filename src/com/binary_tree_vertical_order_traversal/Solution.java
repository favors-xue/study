package com.binary_tree_vertical_order_traversal;

import java.util.*;

public class Solution {
    private Map<Integer,List<Integer>> travel = new HashMap<>();
    private int min=0,max=0;
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();
        q.add(root);
        cols.add(0);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            int col = cols.poll();
            if (travel.get(col)==null) {
                List<Integer> v = new ArrayList<Integer>();
                v.add(node.val);
                travel.put(col,v);
            }
            else {
              travel.get(col).add(node.val);
            }
            min = Math.min(min,col);
            max = Math.max(max,col);

            if (node.left !=null) {
                q.add(node.left);
                cols.add(col+1);
            }

            if(node.right!=null) {
                q.add(node.right);
                cols.add(col-1);
            }
        }

        for (int i = max ;i>=min;i--) {
            if (travel.get(i) == null) continue;
            result.add(travel.get(i));
        }
        return result;

    }

}
