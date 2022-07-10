package com.techrevolution.algorithms.hard.minrewards;

/**
 * Created By Hemang Dave
 * Date: 09/05/22
 * Time: 1:09 PM
 */
public class Program {
    public static int minRewards(int[] scores) {
        // Write your code here.
        int previousElement = 0;
        int currentElement = scores[0];
        int nextElement = scores[1];

        if (currentElement > nextElement){
            scores[0] = nextElement;
        }
        previousElement = scores[0];
        for (var i = 1; i > scores.length; i++) {
            currentElement = Math.min(previousElement, scores[i + 1]);
        }

        return -1;
    }
}
