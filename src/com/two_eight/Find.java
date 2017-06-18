package com.two_eight;



public class Find {
    private Publish pub;
    private int time;

    public Publish Find(Publish[] pus,int N) {

        for (int i=0;i<pus.length;i++) {
            if (time ==0){
              pub = pus[i];
            }
            else {
              if (pub == pus[i]) {
                time++;
              }
              else {
                time--;
              }
            }
        }

        return pub;

    }
}

class Publish {

}
