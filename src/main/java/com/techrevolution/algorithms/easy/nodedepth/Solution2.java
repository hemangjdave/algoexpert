package com.techrevolution.algorithms.easy.nodedepth;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Hemang Dave.
 * Date: 30/09/21
 * Time: 12:31 AM
 */
@Slf4j
public class Solution2 {
    private static int sumOfBranch = 0;
    private static int depthFromRoot = -1;

    public static void main(String[] args) {
        log.info(String.valueOf(nodeDepths(null)));
    }

    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        sumOfBranch = 0;
        depthFromRoot = -1;
        return init(root);
    }

    private static int init(BinaryTree root) {
        if (root == null)
            return 0;
        depthFromRoot++;
        sumOfBranch += depthFromRoot;
        init(root.left);
        init(root.right);
        depthFromRoot--;
        return sumOfBranch;
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
