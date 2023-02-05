package com.techrevolution.algorithms.veryhard.compareleaftraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void TestCase1() {
        Program.BinaryTree tree1 = new Program.BinaryTree(1);
        tree1.left = new Program.BinaryTree(2);
        tree1.right = new Program.BinaryTree(3);
        tree1.left.left = new Program.BinaryTree(4);
        tree1.left.right = new Program.BinaryTree(5);
        tree1.right.right = new Program.BinaryTree(6);
        tree1.left.right.left = new Program.BinaryTree(7);
        tree1.left.right.right = new Program.BinaryTree(8);

        Program.BinaryTree tree2 = new Program.BinaryTree(1);
        tree2.left = new Program.BinaryTree(2);
        tree2.right = new Program.BinaryTree(3);
        tree2.left.left = new Program.BinaryTree(4);
        tree2.left.right = new Program.BinaryTree(7);
        tree2.right.right = new Program.BinaryTree(5);
        tree2.right.right.left = new Program.BinaryTree(8);
        tree2.right.right.right = new Program.BinaryTree(6);

        var expected = true;
        var actual = new Program().compareLeafTraversal(tree1, tree2);
        assertEquals(expected, actual);
    }

}