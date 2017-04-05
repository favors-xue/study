package com.sum_of_left_leaves;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn on 2017/4/4.
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;

        List<Integer> sum  = new ArrayList<>();
        findLeft(root,sum);
        int result = 0;
        for(Integer i : sum) {
            result+=i;
        }
        return result;
    }

    private boolean findLeft(TreeNode root,List<Integer> sum) {
        if(root.left==null&&root.right==null) return true;
        if (root.left !=null) {
            if(findLeft(root.left, sum)) {
                sum.add(root.left.val);
            }
        }
        if (root.right != null) findLeft(root.right,sum);
        return false;
    }
}
