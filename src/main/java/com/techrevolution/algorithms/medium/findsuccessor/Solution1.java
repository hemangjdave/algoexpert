package com.techrevolution.algorithms.medium.findsuccessor;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 27/12/21
 * Time: 6:12 PM
 */
@Slf4j
public class Solution1 {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.parent = root;
        root.right = new BinaryTree(3);
        root.right.parent = root;
        root.left.left = new BinaryTree(4);
        root.left.left.parent = root.left;
        root.left.right = new BinaryTree(5);
        root.left.right.parent = root.left;
        root.left.left.left = new BinaryTree(6);
        root.left.left.left.parent = root.left.left;
        BinaryTree node = root.left.right;
        BinaryTree successor = new Solution1().findSuccessor(root, node);
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        var binaryTreeList = inorderTraverse(tree, new ArrayList<>());
        var index = binaryTreeList.indexOf(node);
        if (index == binaryTreeList.size() - 1) {
            return null;
        } else {
            return binaryTreeList.get(index + 1);
        }
    }

    private List<BinaryTree> inorderTraverse(BinaryTree tree, List<BinaryTree> list) {
        if (tree.left != null) {
            inorderTraverse(tree.left, list);
        }
        list.add(tree);
        if (tree.right != null) {
            inorderTraverse(tree.right, list);
        }
        return list;
    }
}
