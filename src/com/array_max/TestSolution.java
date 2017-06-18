package com.array_max;

/**
 * Created by shawn on 2017/6/7.
 */
public class TestSolution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] n = new int[]{-2,-3,-4,-5,4,-8,6};
        int a = s.MaxSum(n);
        System.out.println(a);
    }
}
