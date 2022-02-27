package com.techrevolution.algorithms.hard.subarraysort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProgramTest {

    @Test
    void TestCase1() {
        int[] expected = {3, 9};
        assertArrayEquals(Program.subarraySort(new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}), expected);

    }
}