package com.techrevolution.algorithms.easy.index.binarysearch;

import org.junit.jupiter.api.Test;

import static com.techrevolution.algorithms.easy.index.binarysearch.Solution1.binarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    @Test
    void testBinarySearch() {
        assertEquals(0,binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 0));
        assertEquals(3 , binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
        assertEquals(-1 , binarySearch(new int[]{1, 5, 23, 111}, 35));
    }

}