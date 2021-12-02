package com.techrevolution.algorithms.medium.threenumbersum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    @Test
    void testThreeNumberSum() {
        List<Integer[]> threeNumberSum = Solution1.threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);
        Integer[] first = {-8, 2, 6};
        Integer[] second = {-8, 3, 5};
        Integer[] third = {-6, 1, 5};
        List<Integer[]> expected = List.of(first, second, third);
        assertTrue(compareLists(expected, threeNumberSum));
    }

    @Test
    void testThreeNumberSum2() {
        List<Integer[]> threeNumberSum = Solution1.threeNumberSum(new int[]{1, 2, 3}, 6);
        Integer[] first = new Integer[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        assertArrayEquals(first, threeNumberSum.get(0));
    }

    @Test
    void testThreeNumberSum3() {
        List<Integer[]> threeNumberSum = Solution1.threeNumberSum(new int[]{8, 10, -2, 49, 14}, 57);
        Integer[] first = new Integer[3];
        first[0] = -2;
        first[1] = 10;
        first[2] = 49;
        assertArrayEquals(first, threeNumberSum.get(0));
    }

    private boolean compareLists(List<Integer[]> expected, List<Integer[]> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        for (var i = 0; i < expected.size(); i++) {
            boolean equals = Arrays.equals(expected.get(i), actual.get(i));
            if (!equals) {
                return false;
            }
        }
        return true;
    }

}