package com.techrevolution.algorithms.medium.validatebst;

/**
 * Created by Hemang Dave.
 * Date: 20/12/21
 * Time: 5:56 PM
 */
public class Solution2 {

    public static boolean validateBst(BST tree) {
        // Write your code here.
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateBst(BST tree, int minValue, int maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }
        if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
            return false;
        }
        if (tree.right != null && !validateBst(tree.right, tree.value, maxValue)) {
            return false;
        }
        return true;
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
