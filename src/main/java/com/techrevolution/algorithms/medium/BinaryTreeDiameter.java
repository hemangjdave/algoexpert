package com.techrevolution.algorithms.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created By Hemang Dave
 * Date: 23/08/22
 * Time: 3:11 pm
 */
@Slf4j
public class BinaryTreeDiameter {
    public static void main(String[] args) {
        final BinaryTreeDiameter diameter = new BinaryTreeDiameter();
        final BinaryTree tree = diameter.failedTree();
        log.info(String.valueOf(diameter.binaryTreeDiameter(tree)));
        System.out.println();
        log.info(String.valueOf(diameter.binaryTreeDiameter(diameter.createTree())));
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        final TreeMap<Integer, Integer> sortedMap = new TreeMap<>();
        postOrderTraverse(tree, sortedMap, tree);
        log.info(String.valueOf(sortedMap.firstKey()));
        log.info(String.valueOf(sortedMap.lastKey()));
        log.info(sortedMap.toString());
        final Optional<Integer> optionalInteger = sortedMap.values().stream().max(Comparator.naturalOrder());
        return optionalInteger.orElse(-1);
    }

    private void postOrderTraverse(BinaryTree tree, SortedMap<Integer, Integer> sortedMap, BinaryTree rootNode) {
        if (tree.left != null) {
            postOrderTraverse(tree.left, sortedMap, rootNode);
        }
        if (tree.right != null) {
            postOrderTraverse(tree.right, sortedMap, rootNode);
        }
        if (isLeafNode(tree)) {
            sortedMap.put(tree.value, 0);
        } else {
            int leftNodeValue = tree.left != null ? sortedMap.get(tree.left.value) + 1 : 0;
            int rightNodeValue = tree.right != null ? sortedMap.get(tree.right.value) + 1 : 0;
            if (isFullDiameter(tree.left) && isFullDiameter(tree.right)) {
                sortedMap.put(tree.value, leftNodeValue + rightNodeValue);
            } else {
                int value = tree.left.left == null ? 0 : sortedMap.get(tree.left.left.value);
                int right = tree.left.right == null ? 0 : sortedMap.get(tree.left.right.value);
                sortedMap.put(tree.value, Math.max(value, right) + 2);
            }
        }
    }


    private boolean isLeafNode(BinaryTree tree) {
        return tree.left == null && tree.right == null;
    }

    private boolean isFullDiameter(BinaryTree tree) {
        if (tree == null) {
            return true;
        }
        return tree.left == null || tree.right == null;
    }

    private BinaryTree createTree() {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(3);
        tree.right = new BinaryTree(2);
        tree.left.left = new BinaryTree(7);
        tree.left.left.left = new BinaryTree(8);
        tree.left.left.left.left = new BinaryTree(9);
        tree.left.right = new BinaryTree(4);
        tree.left.right.right = new BinaryTree(5);
        tree.left.right.right.right = new BinaryTree(6);
        return tree;
    }

    private BinaryTree failedTree() {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.left.left = new BinaryTree(4);
        tree.left.right = new BinaryTree(5);
        tree.right = new BinaryTree(3);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);
        return tree;
    }
}
