package com.techrevolution.algorithms.easy.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
class BinaryTreeTest {

    private BinaryTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinaryTree();
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
    }

    @Test
    void addValueToTree() {
        assertEquals("[1 , 2 , 3 , 5 , 10 , 11 , 13 , 14 , 15 , 16 , 18 , 22 , 25 , 36]", tree.toString());
    }

    @Test
    void getRootNodeShouldNotBeNull() {
        assertNotNull(tree.getRootNode());
    }

    @Test
    void testClosestValueInTree() {
        assertEquals(1, tree.getClosestValueInTree(1));
        assertEquals(16, tree.getClosestValueInTree(17));
        assertEquals(22, tree.getClosestValueInTree(21));
        assertEquals(18, tree.getClosestValueInTree(19));
        assertEquals(36, tree.getClosestValueInTree(35));
        assertEquals(36, tree.getClosestValueInTree(99));
        assertEquals(1, tree.getClosestValueInTree(-1));
    }
}