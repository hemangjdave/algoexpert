package com.techrevolution.algorithms.easy.validatesubsequence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    @Test
    void testIsValidSequence1() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence2() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence3() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 6, -1, 8, 10);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence4() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(22, 25, 6);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence5() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, 10);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence6() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 10);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence7() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, -1, 8, 10);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence8() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(25);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence9() {
        List<Integer> mainList = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> sequence = Arrays.asList(1, 1, 1);
        assertTrue(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence10() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 12);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence11() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(4, 5, 1, 22, 25, 6, -1, 8, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence12() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence13() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 22, 25, 6, -1, 8, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence14() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 22, 6, -1, 8, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence15() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -1);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence16() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -1, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence17() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -2);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence18() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(26);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence19() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(5, 1, 25, 22, 6, -1, 8, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence20() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(5, 26, 22, 8);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence21() {
        List<Integer> mainList = Arrays.asList(1, 1, 6, 1);
        List<Integer> sequence = List.of(1, 1, 1, 6);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence22() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10, 11, 11, 11, 11);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }

    @Test
    void testIsValidSequence23() {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(5, 1, 22, 25, 6, -1, 8, 10, 10);
        assertFalse(Solution1.isValidSubsequence(mainList, sequence));
    }
}
