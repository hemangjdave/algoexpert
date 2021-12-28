package com.techrevolution.algorithms.medium.mergeoverlapingintervals;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 16/12/21
 * Time: 7:32 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        var i = 0;
        while (i < 10) {
            if (i == 2) {
                i += 2;
            }
            log.info(String.valueOf(i++));
        }
        for (i = 0; i < 10; i++) {
            if (i == 2) {
                i += 2;
            }
            log.info(String.valueOf(i));
        }
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> overLappedIntervals = new ArrayList<>();
        var index = 0;
        List<int[]> nonOverLappedIntervals = new ArrayList<>();
        while (index < intervals.length - 1) {
            int[] firstIntervals = overLappedIntervals.isEmpty() ? intervals[index] : overLappedIntervals.get(overLappedIntervals.size() - 1);
            int[] secondInterval = intervals[++index];
            if (isOverLappingIntervals(firstIntervals, secondInterval)) {
                if (overLappedIntervals.isEmpty()) {
                    overLappedIntervals.add(mergeTwoIntervals(firstIntervals, secondInterval));
                } else {
                    var listSize = overLappedIntervals.size();
                    overLappedIntervals.set(listSize - 1, mergeTwoIntervals(firstIntervals, secondInterval));
                }
            } else {
                if (!overLappedIntervals.contains(firstIntervals)) {
                    nonOverLappedIntervals.add(firstIntervals);
                }
            }
        }
        var secondLastInterval = intervals[intervals.length - 2];
        var lastIntervals = intervals[intervals.length - 1];
        if (lastIntervals[0] > secondLastInterval[1]) {
            nonOverLappedIntervals.add(lastIntervals);
        }
        nonOverLappedIntervals.addAll(overLappedIntervals);
        return nonOverLappedIntervals.toArray(new int[0][0]);
    }

    private int[] mergeTwoIntervals(int[] interval1, int[] interval2) {
        return new int[]{interval1[0], interval2[1]};
    }

    private boolean isOverLappingIntervals(int[] interval1, int[] interval2) {
        var secondIndexOfFirstInterval = interval1[1];
        var firstIndexOfSecondInterval = interval2[0];
        return secondIndexOfFirstInterval >= firstIndexOfSecondInterval;
    }
}
