package com.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void bft(HashMap<Character, LinkedList<Character>> graph, HashMap<Character, Integer> dist, char start) {
        Queue<Character> q = new LinkedList<>();
        q.add(start);
        dist.put(start,0);
        int i =0;
        while(!q.isEmpty()) {
            char top = q.poll();
            i++;
            int d = dist.get(top)+1;
            for (Character c :graph.get(top)) {

            }
        }

    }
}