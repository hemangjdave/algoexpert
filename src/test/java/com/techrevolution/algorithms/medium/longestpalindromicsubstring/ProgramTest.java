package com.techrevolution.algorithms.medium.longestpalindromicsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void TestCase1() {
        assertEquals("xyzzyx", Program.longestPalindromicSubstring("abaxyzzyxf"));
    }

    @Test
    void TestCase2() {
        assertEquals("noon", Program.longestPalindromicSubstring("it's highnoon"));
    }

    @Test
    void TestCase3() {
        assertEquals("zzzzzzzzzzzzzzzzzzzz", Program.longestPalindromicSubstring("abcdefgfedcbazzzzzzzzzzzzzzzzzzzz"));
    }

}