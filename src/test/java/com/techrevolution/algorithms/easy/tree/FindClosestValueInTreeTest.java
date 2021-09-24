package com.techrevolution.algorithms.easy.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindClosestValueInTreeTest {

    private FindClosestValueInTree findClosestValueInTree;

    @BeforeEach
    void setUp() {
        BinaryTree tree = new BinaryTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(2);
        tree.add(3);
        tree.add(13);
        tree.add(22);
        tree.add(1);
        tree.add(11);
        tree.add(14);
        tree.add(16);
        tree.add(18);
        tree.add(25);
        tree.add(36);
        findClosestValueInTree = new FindClosestValueInTree(tree);
    }

    @Test
    void testClosestValueInTreeMethod() {
        assertEquals(1, findClosestValueInTree.findClosestValueInTree(1));
        assertEquals(16, findClosestValueInTree.findClosestValueInTree(17));
        assertEquals(22, findClosestValueInTree.findClosestValueInTree(21));
        assertEquals(18, findClosestValueInTree.findClosestValueInTree(19));
        assertEquals(36, findClosestValueInTree.findClosestValueInTree(35));
        assertEquals(36, findClosestValueInTree.findClosestValueInTree(99));
        assertEquals(1, findClosestValueInTree.findClosestValueInTree(-1));
    }
}