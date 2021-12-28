package com.techrevolution.algorithms.medium.minheightbst;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Solution1Test {

    @Test
    void testMinHeightBST() {
        List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        Solution1.BST bst = Solution1.minHeightBst(array);
        assertNotNull(bst);
    }

}