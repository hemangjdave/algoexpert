package com.techrevolution.algorithms.easy.twonumbersum;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Solution2 {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        var targetedSum = 10;
        log.info(Arrays.toString(twoNumberSum(array, targetedSum)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> integers = new HashSet<>();
        for (var num : array) {
            var potentialMatch = targetSum - num;
            if (integers.contains(potentialMatch)) {
                return new int[]{potentialMatch, num};
            }
            integers.add(num);
        }
        return new int[0];
    }
}
