package com.techrevolution.algorithms.medium.permutations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {
    @Test
    void TestCase1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> perms = Program.getPermutations(input);
        assertEquals(6, perms.size());
        assertTrue(contains(perms, new ArrayList<>(Arrays.asList(1, 2, 3))));
        assertTrue(contains(perms, new ArrayList<>(Arrays.asList(1, 3, 2))));
        assertTrue(contains(perms, new ArrayList<>(Arrays.asList(2, 1, 3))));
        assertTrue(contains(perms, new ArrayList<>(Arrays.asList(2, 3, 1))));
        assertTrue(contains(perms, new ArrayList<>(Arrays.asList(3, 1, 2))));
        assertTrue(contains(perms, new ArrayList<>(Arrays.asList(3, 2, 1))));
    }

    public boolean contains(List<List<Integer>> arr1, List<Integer> arr2) {
        for (List<Integer> subArray : arr1) {
            if (subArray.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}