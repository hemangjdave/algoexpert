package com.techrevolution.algorithms.medium.mergeoverlappingintervals;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 09/12/21
 * Time: 5:13 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        int[][] intervals =
                new int[][] {
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] intervals2 =
                new int[][] {
                        {1, 3},
                        {2, 8},
                        {9, 3}
                };
        int[][] result = new Solution1().mergeOverlappingIntervals(intervals2);
        for (var i = 0; i < result.length; i++) {
            log.info(Arrays.toString(result[i]));
        }
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        List<Integer> integers = new ArrayList<>();
        for (var i = 0; i < intervals.length - 1; i++) {
            int[] firstArray = intervals[i];
            int[] secondArray = intervals[i + 1];
            if (!isOverlapping(firstArray[1], secondArray[0])) {
                if (i == intervals.length - 2) {
                    integers.add(secondArray[0]);
                    integers.add(secondArray[1]);
                } else {
                    integers.add(firstArray[0]);
                    integers.add(firstArray[1]);
                }
            } else {
                var size = integers.size();
                if (size % 2 == 0) {
                    integers.add(firstArray[0]);
                } else {
                    integers.add(secondArray[1]);
                }
            }
        }
        integers.forEach(integer -> log.info(String.valueOf(integer)));
        var arrayLength = integers.size() / 2;
        int[][] result = new int[arrayLength][2];
        var index = 0;
        for (var i = 0; i < integers.size() - 1; i +=2) {
            int[] pairs = new int[2];
            pairs[0] = integers.get(i);
            pairs[1] = integers.get(i + 1);
            result[index++] = pairs;
        }
        return result;
    }

    private boolean isOverlapping(int a, int b) {
        return a > b;
    }

}
