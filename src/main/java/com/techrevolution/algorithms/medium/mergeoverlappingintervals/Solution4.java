package com.techrevolution.algorithms.medium.mergeoverlappingintervals;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 09/12/21
 * Time: 8:26 PM
 */
@Slf4j
public class Solution4 {
    public static void main(String[] args) {
        int[][] intervals =
                new int[][]{
                        {0, 0},
                        {0, 0},
                        {0, 0},
                        {0, 1}
                };
        int[][] result = new Solution4().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < result.length; i++) {
            log.info(Arrays.toString(result[i]));
        }
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.

        List<Integer> integers = new LinkedList<>();
        Arrays.stream(intervals).forEach(ints -> Arrays.stream(ints).forEach(integers::add));
        for (var i = 0; i < intervals.length - 1; i++) {
            int[] array1 = intervals[i];
            int[] array2 = intervals[i + 1];
            if (isOverlapping(array1[1], array2[0])) {
                integers.removeIf(integer -> integer == array1[1]);
                integers.removeIf(integer -> integer == array2[0]);
            }
        }
        int[][] results;
        if (integers.size() < 4) {
            results = new int[integers.size()][2];
            var index = 0;
            for (var i = 0; i < integers.size(); i++) {
                results[i] = new int[]{integers.get(index++), integers.get(index++)};
            }
        } else {
            results = new int[integers.size()/2][2];
            var index = 0;
            for (var i = 0; i < integers.size() / 2; i++) {
                results[i] = new int[]{integers.get(index++), integers.get(index++)};
            }
        }

        return results;
    }

    private boolean isOverlapping(int a, int b) {
        return a > b || a == b;
    }
}
