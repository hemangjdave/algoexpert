package com.techrevolution.algorithms.medium.mergeoverlapingintervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1Test {

    @Test
    void testMergeOverLappingIntervals1() {
        int[][] intervals =
                new int[][]{
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] expected =
                new int[][]{
                        {1, 2},
                        {3, 8},
                        {9, 10}
                };
        int[][] actual = new Solution1().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testMergeOverLappingIntervals2() {
        int[][] intervals =
                new int[][]{
                        {1, 2},
                        {1, 3},
                        {4, 5}
                };
        int[][] expected =
                new int[][]{
                        {1, 3},
                        {4, 5}
                };
        int[][] actual = new Solution1().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testMergeOverLappingIntervals3() {
        int[][] intervals =
                new int[][]{
                        {1, 10},
                        {11, 20},
                        {21, 30},
                        {31, 40},
                        {41, 50},
                        {51, 60},
                        {61, 70},
                        {71, 80},
                        {81, 90},
                        {91, 100}
                };
        int[][] expected =
                new int[][]{
                        {1, 10},
                        {11, 20},
                        {21, 30},
                        {31, 40},
                        {41, 50},
                        {51, 60},
                        {61, 70},
                        {71, 80},
                        {81, 90},
                        {91, 100}
                };
        int[][] actual = new Solution1().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testMergeOverLappingIntervals4() {
        int[][] intervals =
                new int[][]{
                        {89, 90},
                        {-10, 20},
                        {-50, 0},
                        {70, 90},
                        {90, 91},
                        {90, 95}
                };
        int[][] expected =
                new int[][]{
                        {-50, 20},
                        {70, 95},
                };
        int[][] actual = new Solution1().mergeOverlappingIntervals(intervals);
        for (var i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

}