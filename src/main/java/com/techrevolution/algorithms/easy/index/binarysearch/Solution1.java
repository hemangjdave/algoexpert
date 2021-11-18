package com.techrevolution.algorithms.easy.index.binarysearch;

import lombok.extern.slf4j.Slf4j;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/**
 * Created By Hemang Dave
 * Date: 18/11/21
 * Time: 8:14 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 0)));
        log.info(String.valueOf(binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33)));
        log.info(String.valueOf(binarySearch(new int[]{1, 5, 23, 111}, 35)));
    }

    public static int binarySearch(int[] array, int target) {
        IntUnaryOperator intUnaryOperator;
        IntPredicate intPredicate;
        // Write your code here.
        var midValue = array[array.length / 2];
        if (target < midValue) {
            intUnaryOperator = (value -> --value);
            intPredicate = value -> value >= 0;
        } else {
            intUnaryOperator = (value -> ++value);
            intPredicate = value -> value < array.length;
        }
        return getIndex(array, target, intUnaryOperator, intPredicate);
    }

    private static int getIndex(int[] array, int target, IntUnaryOperator intUnaryOperator, IntPredicate intPredicate) {
        for (var i = array.length / 2; intPredicate.test(i);i = intUnaryOperator.applyAsInt(i)) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
