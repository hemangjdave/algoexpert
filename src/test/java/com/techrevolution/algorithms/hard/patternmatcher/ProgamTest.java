package com.techrevolution.algorithms.hard.patternmatcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgamTest {

    @Test
    void TestCase1() {
        String[] expected = {"go", "powerranger"};
        String inputPattern = "xxyxxy";
        String inputString = "gogopowerrangergogopowerranger";
        assertTrue(compare(Program.patternMatcher(inputPattern, inputString), expected));
    }

    public boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1.length == 0 && arr2.length == 0) {
            return true;
        }
        return arr1[0].equals(arr2[0]) && arr1[1].equals(arr2[1]);
    }

}