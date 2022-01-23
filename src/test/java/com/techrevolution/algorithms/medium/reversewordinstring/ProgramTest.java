package com.techrevolution.algorithms.medium.reversewordinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void testReverseWordInString() {
        String input = "AlgoExpert is the best!";
        String expected = "best! the is AlgoExpert";
        String actual = new Program().reverseWordsInString(input);
        assertEquals(expected, actual);
    }

    @Test
    void testReverseWordInString2() {
        String input = "test        ";
        String expected = "        test";
        String actual = new Program().reverseWordsInString(input);
        assertEquals(expected, actual);
    }

}