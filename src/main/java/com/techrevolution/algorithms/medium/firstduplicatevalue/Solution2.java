package com.techrevolution.algorithms.medium.firstduplicatevalue;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Hemang Dave
 * Date: 09/12/21
 * Time: 4:10 PM
 */
@Slf4j
public class Solution2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        log.info(String.valueOf(new Solution1().firstDuplicateValue(new int[]{2, 1, 5, 2, 3, 3, 4})));
        log.info(String.valueOf(new Solution1().firstDuplicateValue(new int[]{2, 1, 5, 3, 3, 2, 4})));
        long endTime = System.currentTimeMillis();
        log.info(String.valueOf((endTime - startTime)));
    }

    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        Set<Integer> integerSet = new HashSet<>();
        for (var value : array) {
            if (integerSet.contains(value)) {
                return value;
            }
            integerSet.add(value);
        }
        return -1;
    }
}
