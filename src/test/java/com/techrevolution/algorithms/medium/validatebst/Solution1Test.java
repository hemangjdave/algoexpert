package com.techrevolution.algorithms.medium.validatebst;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class Solution1Test {

    @Test
    void validateBst() {
        Solution1.BST bst = new Solution1.BST(10);
        bst.left = new Solution1.BST(5);
        bst.right = new Solution1.BST(15);
        bst.left.left = new Solution1.BST(2);
        bst.left.right = new Solution1.BST(11);
        bst.right.right = new Solution1.BST(22);
        Assertions.assertFalse(Solution1.validateBst(bst));
    }

    @Test
    void validateBst2() {
        Solution1.BST bst = new Solution1.BST(25);
        bst.right = new Solution1.BST(27);
        bst.left = new Solution1.BST(18);
        bst.left.left = new Solution1.BST(12);
        bst.left.left.left = new Solution1.BST(9);
        bst.left.left.right = new Solution1.BST(14);
        bst.left.right = new Solution1.BST(22);
        bst.left.right.right = new Solution1.BST(24);
        bst.left.right.right.right = new Solution1.BST(28);
        bst.left.right.left = new Solution1.BST(20);
        bst.left.right.left.left = new Solution1.BST(19);
        bst.left.right.left.right = new Solution1.BST(21);
        Assertions.assertFalse(Solution1.validateBst(bst));
    }

}