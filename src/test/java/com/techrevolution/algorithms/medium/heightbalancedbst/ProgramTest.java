package com.techrevolution.algorithms.medium.heightbalancedbst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    void TestCase1() {
        Program.BinaryTree root = new Program.BinaryTree(1);
        root = new Program.BinaryTree(1);
        root.left = new Program.BinaryTree(2);
        root.right = new Program.BinaryTree(3);
        root.left.left = new Program.BinaryTree(4);
        root.left.right = new Program.BinaryTree(5);
        root.right.right = new Program.BinaryTree(6);
        root.left.right.left = new Program.BinaryTree(7);
        root.left.right.right = new Program.BinaryTree(8);
        var actual = new Program().heightBalancedBinaryTree(root);
        assertTrue(actual);
    }

    @Test
    void TestCase2() {
        Program.BinaryTree root;
        root = new Program.BinaryTree(1);
        root.left = new Program.BinaryTree(2);
        root.left.right = new Program.BinaryTree(5);
        root.left.right.left = new Program.BinaryTree(12);
        root.left.left = new Program.BinaryTree(4);
        root.left.left.left = new Program.BinaryTree(8);
        root.left.left.left.left = new Program.BinaryTree(11);
        var actual = new Program().heightBalancedBinaryTree(root);
        assertFalse(actual);
    }
}