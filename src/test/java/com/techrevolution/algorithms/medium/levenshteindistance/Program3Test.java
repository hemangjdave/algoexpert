package com.techrevolution.algorithms.medium.levenshteindistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Program3Test {
    @Test
    void testCase1() {
        String str1 = "abc";
        String str2 = "yabd";
        assertEquals(2, Program3.levenshteinDistance(str1, str2));
    }

    @Test
    void testCase2() {
        String str1 = "cereal";
        String str2 = "saturday";
        assertEquals(2, Program3.levenshteinDistance(str1, str2));
    }
}