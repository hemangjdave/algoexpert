package com.techrevolution.algorithms.easy.generatedocument;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    private final Solution1 solution1 = new Solution1();

    @Test
    void testGenerateDocument() {
        assertTrue(solution1.generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
        assertFalse(solution1.generateDocument("A", "a"));
        assertTrue(solution1.generateDocument("a hsgalhsa sanbjksbdkjba kjx", ""));
        assertFalse(solution1.generateDocument(" ", "hello"));
        assertTrue(solution1.generateDocument("aheaollabbhb", "hello"));
        assertTrue(solution1.generateDocument("&*&you^a%^&8766 _=-09     docanCMakemthisdocument", "Can you make this document &"));
    }
}