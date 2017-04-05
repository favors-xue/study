package com.group_anagrams;

import java.util.*;

/**
 * Created by shawn on 2017/4/6.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length ==0) {
            return new ArrayList<>();
        }
        Map<String,List<String>> group = new HashMap<>();
        for (int i=0;i<strs.length;i++) {
            String sum = this.getAsiiSum(strs[i]);
            List<String> listStr = group.get(sum);
            if(listStr == null) {
                listStr = new ArrayList<>();
                listStr.add(strs[i]);
                group.put(sum,listStr);
            }
            else {
                listStr.add(strs[i]);
            }
        }
        List<List<String>> outPut = new ArrayList<>();
        for(String key : group.keySet()) {
            outPut.add(group.get(key));
        }
        return outPut;
    }

    private String getAsiiSum(String str) {
        char[] com = new char[26];
        int result = 0;
        for (int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            com[c-'a'] ++;
        }
        return new String(com) + str.length();
    }
}
