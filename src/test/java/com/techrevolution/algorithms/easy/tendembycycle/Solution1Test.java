package com.techrevolution.algorithms.easy.tendembycycle;

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
    void tendemBycycleTest1() {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        assertEquals(32, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
    }

    @Test
    void tendemBycycleTest2() {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        assertEquals(25, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false));
    }

    @Test
    void tendemBycycleTest3() {
        int[] redShirtSpeeds = {1, 2, 1, 9, 12, 3};
        int[] blueShirtSpeeds = {3, 3, 4, 6, 1, 2};
        assertEquals(30, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false));
    }

    @Test
    void tendemBycycleTest4() {
        int[] redShirtSpeeds = {1, 2, 1, 9, 12, 3};
        int[] blueShirtSpeeds = {3, 3, 4, 6, 1, 2};
        assertEquals(37, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
    }

    @Test
    void tendemBycycleTest5() {
        int[] redShirtSpeeds = {1, 2, 1, 9, 12, 3, 1, 54, 21, 231, 32, 1};
        int[] blueShirtSpeeds = {3, 3, 4, 6, 1, 2, 5, 6, 34, 256, 123, 32};
        assertEquals(816, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
    }

    @Test
    void tendemBycycleTest6() {
        int[] redShirtSpeeds = {1, 2, 1, 9, 12, 3, 1, 54, 21, 231, 32, 1};
        int[] blueShirtSpeeds = {3, 3, 4, 6, 1, 2, 5, 6, 34, 256, 123, 32};
        assertEquals(484, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false));
    }

    @Test
    void tendemBycycleTest7() {
        int[] redShirtSpeeds = {1};
        int[] blueShirtSpeeds = {5};
        assertEquals(5, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
    }

    @Test
    void tendemBycycleTest8() {
        int[] redShirtSpeeds = {1};
        int[] blueShirtSpeeds = {5};
        assertEquals(5, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false));
    }

    @Test
    void tendemBycycleTest9() {
        int[] redShirtSpeeds = {1, 1, 1, 1};
        int[] blueShirtSpeeds = {1, 1, 1, 1};
        assertEquals(4, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false));
    }

    @Test
    void tendemBycycleTest10() {
        int[] redShirtSpeeds = {1, 1, 1, 1};
        int[] blueShirtSpeeds = {1, 1, 1, 1};
        assertEquals(4, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
    }

    @Test
    void tendemBycycleTest11() {
        int[] redShirtSpeeds = {};
        int[] blueShirtSpeeds = {};
        assertEquals(0, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
        assertEquals(0, solution1.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false));
    }
}