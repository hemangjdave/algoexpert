package com.techrevolution.algorithms.medium.firstduplicatevalue;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Hemang Dave
 * Date: 08/12/21
 * Time: 10:32 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        log.info(String.valueOf(new Solution1().firstDuplicateValue(new int[]{2, 1, 5, 2, 3, 3, 4})));
        log.info(String.valueOf(new Solution1().firstDuplicateValue(new int[]{2, 1, 5, 3, 3, 2, 4})));
        long endTime = System.currentTimeMillis();
        log.info(String.valueOf((endTime - startTime)));
    }

    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        var lastIndex = array.length;
        var firstDuplicate = -1;
        for (var i = 0; i < lastIndex; i++) {
            var number = array[i];
            for (var j = i + 1; j < lastIndex; j++) {
                if (array[j] == number) {
                    firstDuplicate = array[j];
                    lastIndex = j;
                }
            }
        }
        return firstDuplicate;
    }

}
