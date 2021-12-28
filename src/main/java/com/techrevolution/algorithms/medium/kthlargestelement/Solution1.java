package com.techrevolution.algorithms.medium.kthlargestelement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 22/12/21
 * Time: 4:22 PM
 */
public class Solution1 {
    // This is an input class. Do not edit.
    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        List<Integer> list = inorderTraverseTree(tree, new ArrayList<>());
        list.sort(Comparator.reverseOrder());
        return list.get(k - 1);
    }

    private List<Integer> inorderTraverseTree(BST tree, List<Integer> list) {
        if (tree.left != null) {
            inorderTraverseTree(tree.left, list);
        }
        list.add(tree.value);
        if (tree.right != null) {
            inorderTraverseTree(tree.right, list);
        }
        return list;
    }

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }
}
