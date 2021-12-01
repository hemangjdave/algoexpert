package com.techrevolution.algorithms.easy.runlenghtencoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    private final Solution1 solution1 = new Solution1();

    @Test
    void testRunLengthEncoding() {
        assertEquals("9A4A2B4C2D", solution1.runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
        assertEquals("1a1A", solution1.runLengthEncoding("aA"));
    }

    @Test
    void testRunLengthEncoding2() {
        assertEquals("9*3*7^6$7%6!9A9A2A", solution1.runLengthEncoding("************^^^^^^^$$$$$$%%%%%%%!!!!!!AAAAAAAAAAAAAAAAAAAA"));
        assertEquals("9 9 8 ", solution1.runLengthEncoding("                          "));
    }

    @Test
    void testRunLengthEncoding3() {
        assertEquals("8.6_9=4A3 3A4B3 3B", solution1.runLengthEncoding("........______=========AAAA   AAABBBB   BBB"));
        assertEquals("9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a1a", solution1.runLengthEncoding("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

}