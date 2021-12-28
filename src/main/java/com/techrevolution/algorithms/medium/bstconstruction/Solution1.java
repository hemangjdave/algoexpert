package com.techrevolution.algorithms.medium.bstconstruction;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Hemang Dave.
 * Date: 10/12/21
 * Time: 4:53 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(15);
        bst.insert(5);
        log.info(String.valueOf(bst.right.value));
        log.info(String.valueOf(bst.left.value));
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            BST rootNode = this;
            while (rootNode != null) {
                if (value > rootNode.value && rootNode.right == null) {
                    rootNode.right = new BST(value);
                    return this;
                } else if (rootNode.left == null) {
                    rootNode.left = new BST(value);
                    return this;
                } else {
                    rootNode = value >= rootNode.value ? rootNode.right : rootNode.left;
                }
            }
            // Do not edit the return statement of this method.
            return this;
        }

        public boolean contains(int value) {
            // Write your code here.
            return false;
        }

        public BST remove(int value) {
            // Write your code here.
            
            // Do not edit the return statement of this method.
            return this;
        }
    }
}
