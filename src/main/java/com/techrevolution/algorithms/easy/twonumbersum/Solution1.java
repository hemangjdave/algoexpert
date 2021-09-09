package com.techrevolution.algorithms.easy.twonumbersum;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        var targetedSum = 10;
        log.info(Arrays.toString(twoNumberSum(array, targetedSum)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (var i = 0; i < array.length; i++) {
            for (var j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i] , array[j]};
                }
            }
        }
        return new int[0];
    }
}
