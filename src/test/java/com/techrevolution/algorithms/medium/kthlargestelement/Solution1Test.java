package com.techrevolution.algorithms.medium.kthlargestelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    @Test
    void testKthLargestElementInTree() {
        Solution1.BST root = new Solution1.BST(15);
        root.left = new Solution1.BST(5);
        root.left.left = new Solution1.BST(2);
        root.left.left.left = new Solution1.BST(1);
        root.left.left.right = new Solution1.BST(3);
        root.left.right = new Solution1.BST(5);
        root.right = new Solution1.BST(20);
        root.right.left = new Solution1.BST(17);
        root.right.right = new Solution1.BST(22);
        int k = 3;
        int expected = 17;
        var actual = new Solution1().findKthLargestValueInBst(root, k);
        assertEquals(expected, actual);
    }

}