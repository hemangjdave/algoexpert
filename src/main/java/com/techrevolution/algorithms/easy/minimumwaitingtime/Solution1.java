package com.techrevolution.algorithms.easy.minimumwaitingtime;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Hemang Dave.
 * Date: 01/10/21
 * Time: 4:43 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(new Solution1().minimumWaitingTime(new int[]{3, 2, 1, 2, 6})));
    }

    public int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        var sum = 0;
        var avgTime = 0;
        for (var i = 1; i < queries.length; i++) {
            sum = sum + queries[i - 1];
            avgTime = sum + avgTime;
        }
        return avgTime;
    }
}
