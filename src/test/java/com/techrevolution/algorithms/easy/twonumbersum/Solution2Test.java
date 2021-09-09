package com.techrevolution.algorithms.easy.twonumbersum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    @Test
    void testTwoNumberSumWithValidArray(){
        assertArrayEquals(
                new int[]{11,-1}, Solution2.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)
        );
        assertArrayEquals(
                new int[]{8,9}, Solution2.twoNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 17)
        );
        assertArrayEquals(
                new int[]{3,15}, Solution2.twoNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18)
        );
        assertArrayEquals(
                new int[]{-5,0}, Solution2.twoNumberSum(new int[]{-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5)
        );
        assertArrayEquals(
                new int[]{}, Solution2.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 15)
        );
        assertArrayEquals(
                new int[]{210,-47}, Solution2.twoNumberSum(
                        new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163
                )
        );
    }

    @Test
    void testTwoNumberSumWithSingleArrayValue(){
        assertArrayEquals(
                new int[]{}, Solution2.twoNumberSum(new int[]{14}, 15)
        );
    }

    @Test
    void testTwoNumberSumWithTwoArrayValue(){
        assertArrayEquals(
                new int[]{4,6}, Solution2.twoNumberSum(new int[]{4, 6}, 10)
        );
    }

    @Test
    void testTwoNumberSumWithThreeArrayValue(){
        assertArrayEquals(
                new int[]{4,1}, Solution2.twoNumberSum(new int[]{4, 6, 1}, 5)
        );
        assertArrayEquals(
                new int[]{}, Solution2.twoNumberSum(new int[]{15}, 15)
        );
    }

    @Test
    void testTwoNumberSumWithFourArrayValue(){
        assertArrayEquals(
                new int[]{6 , -3}, Solution2.twoNumberSum(new int[]{4, 6, 1, -3}, 3)
        );
    }
}