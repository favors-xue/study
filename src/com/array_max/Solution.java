package com.array_max;

public class Solution {

    public int MaxSum(int[] a) {
        int[] start = new int[a.length];
        int[] all = new int[a.length];
        start[a.length-1] = a[a.length-1];
        all[a.length-1] = a[a.length-1];
        for (int i = a.length-2;i>=0;i--) {
            start[i] = max(a[i],a[i]+start[i+1]);
            all[i] = max(start[i],all[i+1]);
        }
        return all[0];

    }

    private int max(int a,int b) {
        return a>b?a:b;
    }

}
