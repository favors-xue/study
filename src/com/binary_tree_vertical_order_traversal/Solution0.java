package com.binary_tree_vertical_order_traversal;

import java.util.*;

public class Solution0 {
    private Map<Integer,List<Integer>> travel = new HashMap<>();
    private int min=0,max=0;
    public List<List<Integer>> verticalOrder(TreeNode root) {

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
