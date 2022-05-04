package com.techrevolution.algorithms.hard.largestrange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProgramTest {

    @Test
    void TestCase1() {
        int[] expected = {0, 7};
        assertArrayEquals(Program.largestRange(new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected);
    }

    @Test
    void TestCase2() {
        int[] expected = {1,2};
        assertArrayEquals(Program.largestRange(new int[]{1,2}), expected);
    }

    @Test
    void TestCase3() {
        int[] expected = {1,4};
        assertArrayEquals(Program.largestRange(new int[]{4, 2, 1, 3, 6}), expected);
    }

    @Test
    void TestCase4() {
        int[] expected = {6,10};
        assertArrayEquals(Program.largestRange(new int[]{8, 4, 2, 10, 3, 6, 7, 9, 1}), expected);
    }

    @Test
    void TestCase5() {
        int[] expected = {10,19};
        assertArrayEquals(Program.largestRange(new int[]{19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14}), expected);
    }

    @Test
    void TestCase6() {
        int[] expected = {-7,7};
        assertArrayEquals(Program.largestRange(new int[]{0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15, 12, 12, 2, 1, 6, 13, 14, -2}), expected);
    }

    void sortedHashSet(){

    }

}