package com.techrevolution.algorithms.medium.reconstructbst;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Hemang Dave.
 * Date: 27/12/21
 * Time: 1:23 PM
 */
@Slf4j
public class Solution1 {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        IntStream.of(10, 4, 2, 1, 5, 17, 19, 18).forEach(list::add);
        Solution1 solution1 = new Solution1();
        BST reconstructBst = solution1.reconstructBst(list);
        log.info(solution1.inorderTraverse(reconstructBst, new ArrayList<>()).toString());

    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        // Write your code here.
        if (preOrderTraversalValues.isEmpty()) {
            return null;
        }
        BST bst = new BST(preOrderTraversalValues.get(0));
        BST rootNode = new BST(preOrderTraversalValues.get(0));
        for (var i = 1; i < preOrderTraversalValues.size(); i++) {
            Integer value = preOrderTraversalValues.get(i);
            if (value < rootNode.value) {
                constructLeftBST(value, bst);
            } else {
                constructRightBST(value, bst);
            }
        }
        return bst;
    }

    private void constructLeftBST(int nodeValue, BST tree) {
        if (nodeValue < tree.value) {
            if (tree.left == null) {
                tree.left = new BST(nodeValue);
            } else {
                constructLeftBST(nodeValue, tree.left);
            }
        } else {
            if (tree.right == null) {
                tree.right = new BST(nodeValue);
            } else {
                constructRightBST(nodeValue, tree.right);
            }
        }
    }

    private void constructRightBST(int nodeValue, BST tree) {
        if (nodeValue >= tree.value) {
            if (tree.right == null) {
                tree.right = new BST(nodeValue);
            } else {
                constructRightBST(nodeValue, tree.right);
            }
        } else {
            if (tree.left == null) {
                tree.left = new BST(nodeValue);
            } else {
                constructRightBST(nodeValue, tree.left);
            }
        }
    }

    private List<Integer> inorderTraverse(BST tree, List<Integer> list) {
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
