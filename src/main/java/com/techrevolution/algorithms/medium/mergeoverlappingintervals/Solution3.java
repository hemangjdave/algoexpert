package com.techrevolution.algorithms.medium.mergeoverlappingintervals;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 09/12/21
 * Time: 7:12 PM
 */
@Slf4j
public class Solution3 {
    public static void main(String[] args) {
        int[][] intervals =
                new int[][]{
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] result = new Solution3().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < result.length; i++) {
            log.info(Arrays.toString(result[i]));
        }
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        List<int[]> ints = new ArrayList<>();
        int successEntry = 0;
        int numOfmerge = 0;
        for (var i = successEntry; i < intervals.length; i++) {
            if (i == intervals.length - 1) {
                ints.add(intervals[i]);
            }else if (i < intervals.length-1 && !isOverlapping(intervals[i][1], intervals[i + 1][0])) {
                ints.add(intervals[successEntry++]);
            } else {
                while (successEntry < intervals.length-1 && isOverlapping(intervals[successEntry][1] , intervals[successEntry+1][0])){
                    int[] newArray = mergetTwoArrays(intervals[numOfmerge == 0 ? successEntry : numOfmerge], intervals[successEntry + 1]);
                    if (numOfmerge == 0) {
                        ints.add(newArray);
                    } else {
                        var index = ints.size();
                        ints.set(index - 1, newArray);
                    }
                    successEntry++;
                    numOfmerge++;
                }
            }
        }
        int[][] result = new int[ints.size()][2];
        var index = 0;
        for (int[] value : ints) {
            result[index++] = value;
        }
        return result;
    }

    private int[] mergetTwoArrays(int[] array1, int[] array2) {
        return new int[]{array1[0] , array2[1]};
    }

    private boolean isOverlapping(int a, int b) {
        return a > b || a == b;
    }
}
