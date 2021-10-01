package com.techrevolution.algorithms.easy.minimumwaitingtime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    private Solution1 solution1;

    @BeforeEach
    void setUp() {
        solution1 = new Solution1();
    }

    @Test
    void testMinimumWaitingTime1() {
        assertEquals(17, solution1.minimumWaitingTime(new int[]{3, 2, 1, 2, 6}));
    }

    @Test
    void testMinimumWaitingTime2() {
        assertEquals(6, solution1.minimumWaitingTime(new int[]{2, 1, 1, 1}));
        assertEquals(23, solution1.minimumWaitingTime(new int[]{1, 2, 4, 5, 2, 1}));
        assertEquals(32, solution1.minimumWaitingTime(new int[]{25, 30, 2, 1}));
        assertEquals(10, solution1.minimumWaitingTime(new int[]{1, 1, 1, 1, 1}));
        assertEquals(19, solution1.minimumWaitingTime(new int[]{7, 9, 2, 3}));
        assertEquals(45, solution1.minimumWaitingTime(new int[]{4, 3, 1, 1, 3, 2, 1, 8}));
        assertEquals(20, solution1.minimumWaitingTime(new int[]{5, 4, 3, 2, 1}));
        assertEquals(20, solution1.minimumWaitingTime(new int[]{1, 2, 3, 4, 5}));
        assertEquals(81, solution1.minimumWaitingTime(new int[]{1, 1, 1, 4, 5, 6, 8, 1, 1, 2, 1}));
        assertEquals(10, solution1.minimumWaitingTime(new int[]{17, 4, 3}));
    }

    @Test
    void testMinimumWaitingTimeWithOnlyOneValue() {
        assertEquals(0, solution1.minimumWaitingTime(new int[]{7}));
    }

    @Test
    void testMinimumWaitingTimeWithOnlyTwoValues() {
        assertEquals(8, solution1.minimumWaitingTime(new int[]{8, 9}));
        assertEquals(1, solution1.minimumWaitingTime(new int[]{1, 9}));
    }
}