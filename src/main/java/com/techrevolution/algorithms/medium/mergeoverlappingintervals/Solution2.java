package com.techrevolution.algorithms.medium.mergeoverlappingintervals;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By Hemang Dave
 * Date: 09/12/21
 * Time: 5:55 PM
 */
@Slf4j
public class Solution2 {

    public static void main(String[] args) {
        int[][] intervals =
                new int[][]{
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] result = new Solution1().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < result.length; i++) {
            log.info(Arrays.toString(result[i]));
        }
        int[][] intervals2 =
                new int[][]{
                        {1, 3},
                        {2, 8},
                        {9, 3}
                };
        result = new Solution2().mergeOverlappingIntervals(intervals2);
        for (var i = 0; i < result.length; i++) {
            log.info(Arrays.toString(result[i]));
        }
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        int[][] results = new int[intervals.length][2];
        var lastIndexOfNewArray = 0;
        for (var i = 0; i < intervals.length - 1; i++) {
            int[] firstArray = intervals[i];
            int[] secondArray = intervals[i + 1];
            if (isOverlapping(firstArray[1], secondArray[0])) {
                int[] newArray = new int[2];
                newArray[0] = intervals[lastIndexOfNewArray][0];
                newArray[1] = secondArray[1];
                results[lastIndexOfNewArray] = newArray;
            } else {
                results[i] = firstArray;
                lastIndexOfNewArray++;
            }
        }
        return results;
    }

    private boolean isOverlapping(int a, int b) {
        return a > b || a == b;
    }
}
