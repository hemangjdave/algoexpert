package com.techrevolution.algorithms.medium.invertbinarytree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class Solution1Test {

    @Test
    void invertBinaryTree() {
        Solution1.BinaryTree tree = new Solution1.BinaryTree(10);
        tree.left = new Solution1.BinaryTree(5);
        tree.left.left = new Solution1.BinaryTree(2);
        tree.left.left.left = new Solution1.BinaryTree(1);
        tree.left.left.right = new Solution1.BinaryTree(3);
        tree.right = new Solution1.BinaryTree(15);
        tree.right.left = new Solution1.BinaryTree(13);
        tree.right.left.right = new Solution1.BinaryTree(14);
        tree.right.left.left = new Solution1.BinaryTree(11);
        tree.right.right = new Solution1.BinaryTree(22);
        tree.right.right.left = new Solution1.BinaryTree(16);
        tree.right.right.left.right = new Solution1.BinaryTree(18);
        tree.right.right.right = new Solution1.BinaryTree(25);
        tree.right.right.right.right = new Solution1.BinaryTree(36);
        log.info(inorderTraverse(tree, new ArrayList<>()).toString());
        Solution1.BinaryTree invertBinaryTree = Solution1.invertBinaryTree(tree);
        log.info(inorderTraverse(invertBinaryTree, new ArrayList<>()).toString());
    }

    private List<Integer> inorderTraverse(Solution1.BinaryTree tree, List<Integer> list) {
        if (tree.left != null) {
            inorderTraverse(tree.left, list);
        }
        list.add(tree.value);
        if (tree.right != null) {
            inorderTraverse(tree.right, list);
        }
        return list;
    }
}