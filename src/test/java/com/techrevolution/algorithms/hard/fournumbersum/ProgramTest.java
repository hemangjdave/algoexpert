package com.techrevolution.algorithms.hard.fournumbersum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    private boolean compare(List<Integer[]> quads1, List<Integer[]> quads2) {
        for (Integer[] quad : quads2) {
            Arrays.sort(quad);
        }
        for (Integer[] quad : quads1) {
            Arrays.sort(quad);
        }
        for (Integer[] quad2 : quads2) {
            boolean found = false;
            for (Integer[] quad1 : quads1) {
                if (Arrays.equals(quad2, quad1)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    @Test
    void TestCase1() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{7, 6, 4, -1});
        quadruplets.add(new Integer[]{7, 6, 1, 2});
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }
}