package com.techrevolution.algorithms.medium.bsttraversal;

import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 21/12/21
 * Time: 2:59 PM
 */
public class Solution1 {
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if (tree != null) {
            array.add(tree.value);
            preOrderTraverse(tree.left, array);
        }
        if (tree != null) {
            preOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if (tree != null) {
            postOrderTraverse(tree.left, array);
            postOrderTraverse(tree.right, array);
            array.add(tree.value);
        }
        return array;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
