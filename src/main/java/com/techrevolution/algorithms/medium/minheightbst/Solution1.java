package com.techrevolution.algorithms.medium.minheightbst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 22/12/21
 * Time: 11:16 AM
 */
public class Solution1 {
    public static BST minHeightBst(List<Integer> array) {
        List<Integer> integers = new ArrayList<>(array);
        // Write your code here.
        var listSize = integers.size();
        var midIndex = listSize / 2;
        var leftTree = integers.subList(0, midIndex);
        var rightTree = integers.subList(midIndex + 1, listSize);
        BST bst = new BST(integers.get(midIndex));
        processTree(bst, leftTree);
        processTree(bst, rightTree);
        return bst;
    }

    private static void processTree(BST bst, List<Integer> list) {
        if (list.size() > 1) {
            var listSize = list.size();
            var midIndex = listSize / 2;
            bst.insert(list.get(midIndex));
            var leftTree = list.subList(0, midIndex);
            var rightTree = list.subList(midIndex + 1, listSize);
            processTree(bst, leftTree);
            processTree(bst, rightTree);
        } else if (list.size() == 1) {
            bst.insert(list.get(0));
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
