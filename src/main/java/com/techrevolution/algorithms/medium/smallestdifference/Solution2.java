package com.techrevolution.algorithms.medium.smallestdifference;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 02/12/21
 * Time: 3:10 PM
 */
@Slf4j
public class Solution2 {
    public static void main(String[] args) {
        log.info(Arrays.toString(smallestDifference(new int[]{-1, 5, 10, 20, 28, 3} , new int[]{26, 134, 135, 15, 17})));
        log.info(Arrays.toString(smallestDifference(new int[]{10, 0, 20, 25} , new int[]{1005, 1006, 1014, 1032, 1031})));
        log.info(Arrays.toString(smallestDifference(new int[]{10, 0, 20, 25, 2200} , new int[]{1005, 1006, 1014, 1032, 1031})));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne); // 0 , 10 , 20 , 25                  -1 , 3 , 5 , 10 , 20 , 28
        Arrays.sort(arrayTwo); // 1005 , 1006 , 1014 , 1031 , 1032
        var smallest = Integer.MAX_VALUE;
        var highest = 0;
        var lowest = 0;
        var diff = 0;
        for (int firstOne : arrayOne) {
            for (int secondOne : arrayTwo) {
                diff = firstOne < secondOne ? (secondOne - firstOne) : (firstOne - secondOne);
                if (diff < smallest) {
                    smallest = diff;
                    lowest = secondOne;
                    highest = firstOne;
                }
            }
        }
        return new int[]{highest, lowest};
    }
}
