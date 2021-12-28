package com.techrevolution.algorithms.medium.maxsubsetsum;

/**
 * Created by Hemang Dave.
 * Date: 28/12/21
 * Time: 7:16 PM
 */
public class Program2 {

    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        var second = array[0];
        var first = Math.max(array[0], array[1]);
        for (var i = 2; i < array.length; i++) {
            var current = Math.max(first, second + array[i]);
            second = first;
            first = current;
        }
        return first;
    }
}
