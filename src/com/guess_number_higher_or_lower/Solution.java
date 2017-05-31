package com.guess_number_higher_or_lower;

import java.util.Map;
import java.util.Random;

/**
 * Created by shawn on 2017/4/6.
 */
public class Solution extends GuessGame {
    public Solution(int n) {
        super(n);
    }
    public int guessNumber(int n) {
        if (this.guess(n) == 0) return n;
        if (n == 1) return 1;
        if (n == 2) return this.guess(n) == 0? 2:1;

        return findNumber(1,n);
    }

    private int findNumber(int start,int end) {

        if ((end - start) == 1) return this.guess(end) ==0?end:start;
        int m = (end - start+1)%2;

        int i = (end - start+1)/2;
        if(start ==1)
        i = (m == 0? i : i+1);
        int num = i;
        if(start != 1)
            num = start + i;
        if (this.guess(num) ==0) return num;

        if (this.guess(num) > 0) return findNumber(num,end);
        if (this.guess(num) < 0) return findNumber(start,num);
        return 0;
    }
}
