package com.techrevolution.algorithms.easy.nonrepeatingchar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    @Test
    void testFirstNonRepeatingCharacter() {
        assertEquals(1 , new Solution1().firstNonRepeatingCharacter("abcdcaf"));
        assertEquals(6 , new Solution1().firstNonRepeatingCharacter("faadabcbbebdf"));
        assertEquals(-1 , new Solution1().firstNonRepeatingCharacter("abcdefghhgfedcba"));
        assertEquals(16 , new Solution1().firstNonRepeatingCharacter("abcdefghabcdefghi"));
    }

}