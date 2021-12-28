package com.techrevolution.algorithms.medium.invertbinarytree;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;

/**
 * Created by Hemang Dave.
 * Date: 25/12/21
 * Time: 2:31 AM
 */
@Slf4j
public class Solution2 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.left = new BinaryTree(5);
        tree.left.left = new BinaryTree(2);
        tree.left.left.left = new BinaryTree(1);
        tree.left.left.right = new BinaryTree(3);
        tree.right = new BinaryTree(15);
        tree.right.left = new BinaryTree(13);
        tree.right.left.right = new BinaryTree(14);
        tree.right.left.left = new BinaryTree(11);
        tree.right.right = new BinaryTree(22);
        tree.right.right.left = new BinaryTree(16);
        tree.right.right.left.right = new BinaryTree(18);
        tree.right.right.right = new BinaryTree(25);
        tree.right.right.right.right = new BinaryTree(36);
        invertBinaryTree(tree);
    }


    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
        final ArrayDeque<BinaryTree> queue = new ArrayDeque<>();
        queue.addLast(tree);
        while (!queue.isEmpty()) {
            BinaryTree binaryTree = queue.pollFirst();
            swapTree(binaryTree);
            if (binaryTree.left != null) {
                queue.addLast(binaryTree.left);
            }
            if (binaryTree.right != null) {
                queue.addLast(binaryTree.right);
            }
        }
    }

    private static void swapTree(BinaryTree tree) {
        BinaryTree tree1 = tree.left;
        tree.left = tree.right;
        tree1.right = tree1;
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
