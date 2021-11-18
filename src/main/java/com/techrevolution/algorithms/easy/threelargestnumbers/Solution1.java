package com.techrevolution.algorithms.easy.threelargestnumbers;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 18/11/21
 * Time: 11:15 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(Arrays.toString(findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7})));
        log.info(Arrays.toString(findThreeLargestNumbers(new int[]{55, 43, 11, 3, -3, 10})));
        log.info(Arrays.toString(findThreeLargestNumbers(new int[]{55, 7, 8})));
        log.info(Arrays.toString(findThreeLargestNumbers(new int[]{-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7})));
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] sortedArray = new int[3];
        var firstLargest = array[0];
        var secondLargest = Integer.MIN_VALUE;
        var thirdLargest = Integer.MIN_VALUE;
        for (var i = 1; i < array.length; i++) {
            if (array[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = array[i];
            } else if (array[i] > thirdLargest){
                thirdLargest = array[i];
            }
        }
        log.info("First larget is:--{}" , firstLargest);
        log.info("Second larget is:--{}" , secondLargest);
        log.info("Third larget is:--{}" , thirdLargest);
        sortedArray[0] = thirdLargest;
        sortedArray[1] = secondLargest;
        sortedArray[2] = firstLargest;
        return sortedArray;
    }
}
