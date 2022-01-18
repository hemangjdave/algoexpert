package com.techrevolution.algorithms.medium.levenshteindistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Program2Test {

    @Test
    void testCase8() {
        assertEquals(3, Program2.levenshteinDistance("table", "bal"));
    }

}