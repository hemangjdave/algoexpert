package com.techrevolution.algorithms.medium.numberofwaystomakechange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void testCase1() {
        int[] input = {1, 5};
        var denoms = 6;
        assertEquals(2, Program.numberOfWaysToMakeChange(denoms, input));
    }
}
