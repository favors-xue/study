package com.group_anagrams;

import java.util.List;

/**
 * Created by shawn on 2017/4/6.
 */
public class TestSolution {

    public static void main (String[] args) {
        Solution s = new Solution();
        String[] strs = new String[] {"boo","bob"};
        List<List<String>> result = s.groupAnagrams(strs);
        for(List<String> l : result) {
            System.out.println("[");
            for (String str : l) {
                System.out.println(str+",");
            }
            System.out.println("[");
        }
    }

}
