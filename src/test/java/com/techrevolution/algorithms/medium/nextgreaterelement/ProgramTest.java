package com.techrevolution.algorithms.medium.nextgreaterelement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ProgramTest {

    @Test
    void TestCase1() {
        int[] input = new int[]{2, 5, -3, -4, 6, 7, 2};
        int[] expected = new int[]{5, 6, 6, 6, 7, -1, 5};
        int[] actual = new Program().nextGreaterElement(input);
        assert (Arrays.equals(expected, actual));
    }

    @Test
    void TestCase2() {
        int[] input = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] expected = new int[]{-1, 7, 7, 7, 7, 7, 7};
        int[] actual = new Program().nextGreaterElement(input);
        assert (Arrays.equals(expected, actual));
    }

    @Test
    void TestCase3() {
        int[] input = new int[]{5, 6, 1, 2, 3, 4};
        int[] expected = new int[]{6, -1, 2, 3, 4, 5};
        int[] actual = new Program().nextGreaterElement(input);
        assert (Arrays.equals(expected, actual));
    }

    @Test
    void TestCase4() {
        int[] input = new int[]{1, 2, 3, 4, 1, 2, 3, 4, -8, -7, 6, 2, 17, 2, -8, 9, 0, 2};
        int[] expected = new int[]{2, 3, 4, 6, 2, 3, 4, 6, -7, 6, 17, 17, -1, 9, 9, 17, 2, 3};
        int[] actual = new Program().nextGreaterElement(input);
        assert (Arrays.equals(expected, actual));
    }
}