package com.techrevolution.algorithms.medium.minnumberchars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProgramTest {

    @Test
    void testMinimumCharactersForWords() {
        String[] words = new String[] {"this", "that", "did", "deed", "them!", "a"};
        char[] expected = new char[] {'t', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!'};
        var actual = new Program().minimumCharactersForWords(words);
        assertArrayEquals(expected, actual);
    }

}