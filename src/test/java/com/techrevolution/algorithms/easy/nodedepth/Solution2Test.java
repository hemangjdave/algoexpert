package com.techrevolution.algorithms.easy.nodedepth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {
    @Test
    void TestCase1() {

        var root = new Solution2.BinaryTree(1);
        root.left = new Solution2.BinaryTree(2);
        root.left.left = new Solution2.BinaryTree(4);
        root.left.left.left = new Solution2.BinaryTree(8);
        root.left.left.right = new Solution2.BinaryTree(9);
        root.left.right = new Solution2.BinaryTree(5);
        root.right = new Solution2.BinaryTree(3);
        root.right.left = new Solution2.BinaryTree(6);
        root.right.right = new Solution2.BinaryTree(7);
        int actual = Solution2.nodeDepths(root);
        assertEquals(16, actual);
    }
}