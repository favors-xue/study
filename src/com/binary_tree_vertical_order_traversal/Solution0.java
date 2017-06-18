package com.binary_tree_vertical_order_traversal;

import java.util.*;

public class Solution0 {
    private Map<Integer,List<Integer>> travel = new HashMap<>();
    private int min=0,max=0;
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        int dist = 0;
        List<Integer> rootVal = new ArrayList<>();
        rootVal.add(root.val);
        travel.put(0,rootVal);
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();
        cols.add(0);
        nodes.add(root);
        while(!nodes.isEmpty()) {
            TreeNode n = nodes.poll();
            int dist = cols.poll();
            if(n.left != null) {
                putTravel(n.left,dist+1);
                nodes.add(n.left);
                cols.add(dist+1);
            }
            if (n.right != null) {
                putTravel(n.right,0-dist-1);
                nodes.add(n.right);
                cols.add(dist-1);
            }
        }

        for (int i = max;i>=min;i--) {
            if (travel.get(i)==null) continue;
            result.add(travel.get(i));
        }
        return result;
    }

    private void putTravel(TreeNode node,int level) {
        if(level>max) max = level;
        if(level<min) min = level;
        if(travel.get(level) == null) {
            List<Integer> col = new ArrayList<>();
            col.add(node.val);
            travel.put(level,col);
        }
        else {
            List<Integer> result = travel.get(level);
            result.add(node.val);
        }
    }

}
