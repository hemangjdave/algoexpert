package com.techrevolution.algorithms.medium.reversewordinstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    private Program program;

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("AlgoExpert is the best!", "best! the is AlgoExpert"),
                Arguments.of("test        ", "        test"),
                Arguments.of("test        test", "test        test"),
                Arguments.of("Hemang is cool! buddy@", "buddy@ cool! is Hemang")
        );
    }

    @BeforeEach
    void init() {
        program = new Program();
    }

    @ParameterizedTest
    @MethodSource("provideStrings")
    void testParameterizedTest(String str1, String str2) {
        assertEquals(str2, program.reverseWordsInString(str1));
    }
}