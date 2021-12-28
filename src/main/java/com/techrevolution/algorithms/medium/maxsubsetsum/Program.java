package com.techrevolution.algorithms.medium.maxsubsetsum;

/**
 * Created by Hemang Dave.
 * Date: 28/12/21
 * Time: 4:31 PM
 */
public class Program {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return array[0];
        }
        int[] blankArray = new int[array.length];
        blankArray[0] = array[0];
        blankArray[1] = array[1];
        var max = 0;
        for (var i = 2; i < array.length; i++) {
            max = Math.max(blankArray[i - 1], blankArray[i - 2] + array[i]);
            blankArray[i] = max;
        }
        return max;
    }
}
