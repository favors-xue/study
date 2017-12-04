package com

import java.util.HashMap;



import java.util.HashMap;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    Map<int,int> cols = new HashMap<>();
    for (int i=0;i<nums.length;i++) {
      int rest = target - nums[i];
      if (cols.get(rest)==null) {
        cols.put(rest,i);
      }
      else {
        result[0] = cols.get(rest);
        result[1] = i;
        return result;
      }
    }
    return result;
  }
}
