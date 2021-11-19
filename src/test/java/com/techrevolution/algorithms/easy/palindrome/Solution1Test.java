package com.techrevolution.algorithms.easy.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    @Test
    void testPalindrome() {
        assertTrue(Solution1.isPalindrome("abcdcba"));
        assertTrue(Solution1.isPalindrome("a"));
        assertTrue(Solution1.isPalindrome("abcdefghhgfedcba"));
        assertFalse(Solution1.isPalindrome("ab"));
        assertFalse(Solution1.isPalindrome("abcdefghihgfeddcba"));
    }
}