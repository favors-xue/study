package com.remove_duplicate_letters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shawn on 2017/4/3.
 */
public class Solution {
    public String removeDuplicateLetters(String s) {
        if (s.length() ==0) return "";
        Map<Character,Integer> letters = new HashMap<>();
        char[] newLetters = new char[s.length()];
        int i = 0;
        int pos = 0;
        for(char c : s.toCharArray()) {

            if (letters.get(c) == null ) {
                letters.put(c,0);
            }
            else {
                int l = letters.get(c);
                letters.put(c,++l);
            }
        }

        for (char c : s.toCharArray()) {
            if (c < s.charAt(pos)) {
                pos = i;
            }
            if (letters.get(c) == 0) {
                break;
            }
            else {
                int l = letters.get(c);
                letters.put(c,--l);
            }
            i++;

        }
        if (i == s.length()) {
            pos = 0;
        }
        String tail  = s.substring(pos+1).replaceAll(String.valueOf(s.charAt(pos)),"");

        return s.charAt(pos) + removeDuplicateLetters(tail);
        /*
        int[] cnt = new int[26];
        int pos = 0; // the position for the smallest s[i]
        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) pos = i;
            if (--cnt[s.charAt(i) - 'a'] == 0) break;
        }
        return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
*/
    }

}
