package com.guess_number_higher_or_lower;

/**
 * Created by shawn on 2017/4/6.
 */
public class GuessGame {
    private int num;
    public GuessGame(int num) {
        this.num = num;
    }

    public int guess(int n) {
        if (n > this.num)
            return -1;
        else if (n < this.num) {
            return 1;
        }
        else
            return 0;
    }
}
