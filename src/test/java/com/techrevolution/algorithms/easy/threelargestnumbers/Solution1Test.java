package com.techrevolution.algorithms.easy.threelargestnumbers;

import org.junit.jupiter.api.Test;

import static com.techrevolution.algorithms.easy.threelargestnumbers.Solution1.findThreeLargestNumbers;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1Test {

    @Test
    void testLargestThreeDigitNumbers1() {
        assertArrayEquals(new int[]{18, 141, 541}, findThreeLargestNumbers(new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}));
    }

    @Test
    void testLargestThreeDigitNumbers2() {
        assertArrayEquals(new int[]{11, 43, 55}, findThreeLargestNumbers(new int[]{55, 43, 11, 3, -3, 10}));
    }

    @Test
    void testLargestThreeDigitNumbers3() {
        assertArrayEquals(new int[]{7, 8, 55}, findThreeLargestNumbers(new int[]{55, 7, 8}));
    }

    @Test
    void testLargestThreeDigitNumbers4() {
        assertArrayEquals(new int[]{-2 , -1 , 7}, findThreeLargestNumbers(new int[]{-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7}));
    }
}