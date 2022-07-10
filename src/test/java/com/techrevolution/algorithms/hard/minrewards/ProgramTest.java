package com.techrevolution.algorithms.hard.minrewards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void TestCase1() {
        assertEquals(25, Program.minRewards(new int[]{8, 4, 2, 1, 3, 6, 7, 9, 5}));
    }
}