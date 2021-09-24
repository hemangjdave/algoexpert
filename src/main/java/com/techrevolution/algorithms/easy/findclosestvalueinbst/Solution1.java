package com.techrevolution.algorithms.easy.findclosestvalueinbst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(findClosestValueInBst(null, -1)));
    }

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBst(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBst(tree.right, target, closest);
        } else {
            return closest;
        }
    }


    static class BST {
        private final int value;
        private BST left;
        private BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
