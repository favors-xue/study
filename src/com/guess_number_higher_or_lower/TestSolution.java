package com.guess_number_higher_or_lower;

/**
 * Created by shawn on 2017/4/6.
 */
public class TestSolution {
    public static void main(String[] args) {
        Solution g = new Solution(6);
        int i = g.guessNumber(10);
        System.out.print(i);
    }
}
