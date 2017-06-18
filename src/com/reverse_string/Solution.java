package com.reverse_string;

public class Solution {
  public String reverseString(String s) {
    if (s.length()<=1) return s;
    char[] arrC = s.toCharArray();
    if (arrC.length == 2) {
      char tmp = arrC[1];
      arrC[1] = arrC[0];
      arrC[0] = tmp;
    }
    int length = s.length();

    for (int i =0;i<(length/2);i++) {
      char tmp = arrC[length-1-i];
      arrC[length-1-i] = arrC[i];
      arrC[i] = tmp;

    }
    return String.valueOf(arrC);
  }
}
