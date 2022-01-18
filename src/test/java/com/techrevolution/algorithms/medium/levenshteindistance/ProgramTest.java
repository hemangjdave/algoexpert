package com.techrevolution.algorithms.medium.levenshteindistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void testCase1() {
        assertEquals(2, Program.levenshteinDistance("abc", "yabd"));
    }

    @Test
    void testCase2() {
        assertEquals(1, Program.levenshteinDistance("algoexpert", "algozexpert"));
    }

    @Test
    void testCase3() {
        assertEquals(10, Program.levenshteinDistance("abcdefghij", "1234567890"));
    }

    @Test
    void testCase4() {
        assertEquals(9, Program.levenshteinDistance("abcdefghij", "a234567890"));
    }

    @Test
    void testCase5() {
        assertEquals(4, Program.levenshteinDistance("biting", "mitten"));
    }

    @Test
    void testCase6() {
        assertEquals(3, Program.levenshteinDistance("", "abc"));
    }

    @Test
    void testCase7() {
        assertEquals(1, Program.levenshteinDistance("abc", "abcx"));
    }

    @Test
    void testCase8() {
        assertEquals(2, Program.levenshteinDistance("xabc", "abcx"));
    }

    @Test
    void testCase9() {
        assertEquals(3, Program.levenshteinDistance("table", "bal"));
    }

    @Test
    void testCase10() {
        assertEquals(3, Program.levenshteinDistance("gumbo", "gambol"));
    }

}