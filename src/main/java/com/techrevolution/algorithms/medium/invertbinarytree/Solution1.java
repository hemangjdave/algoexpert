package com.techrevolution.algorithms.medium.invertbinarytree;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Hemang Dave.
 * Date: 22/12/21
 * Time: 10:15 PM
 */
@Slf4j
public class Solution1 {
    public static BinaryTree invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        if (tree == null) {
            return tree;
        }
        BinaryTree newBinaryTree = new BinaryTree(tree.value);
        return assignNewTree(newBinaryTree, tree);
    }

    private static BinaryTree assignNewTree(BinaryTree newBinaryTree, BinaryTree oldTree) {
        if (oldTree != null) {
            if (oldTree.left == null) {
                newBinaryTree.right = null;
            } else {
                newBinaryTree.right = new BinaryTree(oldTree.left.value);
                assignNewTree(newBinaryTree.right, oldTree.left);
            }
        }
        if (oldTree != null) {
            if (oldTree.right == null) {
                newBinaryTree.left = null;
            } else {
                newBinaryTree.left = new BinaryTree(oldTree.right.value);
                assignNewTree(newBinaryTree.left, oldTree.right);
            }
        }
        return newBinaryTree;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
