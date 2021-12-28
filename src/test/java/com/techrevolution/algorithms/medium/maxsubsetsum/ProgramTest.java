package com.techrevolution.algorithms.medium.maxsubsetsum;

import org.junit.jupiter.api.Test;

import static com.techrevolution.algorithms.medium.maxsubsetsum.Program.maxSubsetSumNoAdjacent;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void tessMaxSubsetSumNoAdjacent() {
        int[] input = {75, 105, 120, 75, 90, 135};
        int actual = maxSubsetSumNoAdjacent(input);
        int expected = 330;
        assertEquals(expected, actual);
    }

    @Test
    void tessMaxSubsetSumNoAdjacent2() {
        int[] input = {10, 5, 20, 25, 15, 5, 5, 15, 3, 15, 5, 5, 15};
        int actual = maxSubsetSumNoAdjacent(input);
        int expected = 90;
        assertEquals(expected, actual);
    }
}