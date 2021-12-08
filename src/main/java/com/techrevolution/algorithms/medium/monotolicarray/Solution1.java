package com.techrevolution.algorithms.medium.monotolicarray;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created By Hemang Dave
 * Date: 02/12/21
 * Time: 6:21 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(isMonotonic(new int[]{-1, -5, -10, -1100, -1100, -1101, -1102, -9001})));
        log.info(String.valueOf(isMonotonic(new int[]{5 , 4 , 3 , 2 , 1})));
        log.info(String.valueOf(isMonotonic(new int[]{1 , 2 , 3 , 4 , 5})));
        log.info(String.valueOf(isMonotonic(new int[]{1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11})));
        log.info(String.valueOf(isMonotonic(new int[]{-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -8, -9, -10, -11})));
    }

    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if (array.length < 2) {
            return true;
        }
        LinkedHashSet<Integer> integerSet = generateUniqueArray(array);
        if (integerSet.size() == 1) {
            return true;
        }
        Integer[] uniqueArray = integerSet.toArray(new Integer[integerSet.size()]);
        var strictlyIncreasing = uniqueArray[0] <= uniqueArray[1];
        for (var i = 0; i < array.length - 1; i++) {
            if (strictlyIncreasing) {
                if (array[i] > array[i + 1])
                    return false;
            } else if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static LinkedHashSet<Integer> generateUniqueArray(int[] array) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        Arrays.stream(array).forEach(linkedHashSet::add);
        return linkedHashSet;
    }

}
