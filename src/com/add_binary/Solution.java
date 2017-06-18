package com.add_binary;

public class Solution {
    public String addBinary(String a, String b) {
        //int type = 2;
        int plus = 0;
        StringBuffer sb = new StringBuffer();
        for (int la = a.length() -1,lb = b.length() - 1; la>=0 || lb >=0; la--,lb--) {
            int na = (la <0 ||a.charAt(la)=='\0')?0:Integer.valueOf(String.valueOf(a.charAt(la)));
            int nb = (lb <0 ||b.charAt(lb)=='\0')?0:Integer.valueOf(String.valueOf(b.charAt(lb)));
            int val =0;
            if (plus >0) {
                val = na ^ 1;
                plus--;
                if (val == 0 && na + nb>0) plus++;
            }
            else {
                val = na;
            }
            val = val ^ nb;
            if (val == 0 && nb>0) plus++;
            sb.append(val);

        }
        if (plus>0) sb.append("1");
        return sb.reverse().toString();
    }

}
