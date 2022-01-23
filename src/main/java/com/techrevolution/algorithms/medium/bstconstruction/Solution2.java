package com.techrevolution.algorithms.medium.bstconstruction;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiPredicate;

/**
 * Created By Hemang Dave
 * Date: 15/12/21
 * Time: 4:31 PM
 */
@Slf4j
public class Solution2 {
    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(5);
        bst.insert(13);
        bst.insert(22);
        bst.insert(1);
        bst.insert(14);
        bst.insert(12);
        bst.remove(10);
        bst.contains(15);
        printBST(bst);
    }

    private static void printBST(BST bst) {
        if (bst.left != null) {
            printBST(bst.left);
        }
        log.info(String.valueOf(bst.value));
        if (bst.right != null) {
            printBST(bst.right);
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        final BiPredicate<BST , BST> biPredicate = (previousNode , rootNode) -> previousNode.value < rootNode.value;

        public BST(int value) {
            this.value = value;
        }

        public BST remove(int value) {
            BST tree = this;
            BST previousNode = tree;
            while (tree != null) {
                if (value == tree.value) {
                    removeValueFromTree(tree, previousNode);
                    return this;
                } else if (value > tree.value) {
                    previousNode = tree;
                    tree = tree.right;
                } else {
                    previousNode = tree;
                    tree = tree.left;
                }
            }
            return this;
        }

        private void removeValueFromTree(BST rootNode, BST previousNode) {
            if (isLeafNode(rootNode)) {
                removeLeafNode(rootNode, previousNode);
            } else {
                removeNonLeafNode(rootNode, previousNode);
            }
        }

        private void removeLeafNode(BST rootNode, BST previousNode) {
            if (biPredicate.test(previousNode, rootNode)) {
                previousNode.right = null;
            } else {
                previousNode.left = null;
            }
        }

        private void removeNonLeafNode(BST rootNode , BST previousNode){
            var depthOfLeftTree = getDepthForLeftTree(rootNode);
            var depthOfRightTree = getDepthForRightTree(rootNode);
            BST node;
            if (depthOfLeftTree == 0) {
                node = findAndRemoveLowestNodeInRightTree(rootNode);
            } else if (depthOfRightTree == 0) {
                node = findAndRemoveHighestNodeInLeftTree(rootNode);
            } else if (depthOfLeftTree > depthOfRightTree) {
                node = findAndRemoveLowestNodeInRightTree(rootNode);
            } else {
                node = findAndRemoveHighestNodeInLeftTree(rootNode);
            }
            if (previousNode.value == rootNode.value) {
                rootNode.value = node.value;
            }else if (biPredicate.negate().test(previousNode, rootNode)) {
                previousNode.left = node;
            } else {
                previousNode.right = node;
            }
        }

        private BST findAndRemoveLowestNodeInRightTree(BST subtree ) {
            subtree = subtree.right;
            BST previousNode = subtree;
            BST lowestNode;
            while (subtree.left != null) {
                subtree = subtree.left;
            }
            lowestNode = subtree;
            if (subtree.right != null) {
                previousNode.left = subtree.right;
            } else {
                previousNode.left = null;
            }
            lowestNode.right = previousNode;
            return lowestNode;
        }

        private BST findAndRemoveHighestNodeInLeftTree(BST subtree) {
            subtree = subtree.left;
            if (isLeafNode(subtree)) {
                return subtree;
            }
            BST previousNode = subtree;
            BST highestNode;
            while (subtree.right != null) {
                previousNode = subtree;
                subtree = subtree.right;
            }
            highestNode = subtree;
            if (subtree.left != null) {
                previousNode.right = subtree.left;
            } else {
                previousNode.right = null;
            }
            highestNode.left = previousNode;
            return highestNode;
        }

        private int getDepthForRightTree(BST subtree) {
            subtree = subtree.right;
            var depth = 0;
            while (subtree != null) {
                depth++;
                subtree = subtree.left;
            }
            return depth;
        }

        private int getDepthForLeftTree(BST subtree) {
            var depth = 0;
            subtree = subtree.left;
            while (subtree != null) {
                depth++;
                subtree = subtree.right;
            }
            return depth;
        }

        private boolean isLeafNode(BST node) {
            return node.left == null && node.right == null;
        }

        public boolean contains(int value) {
            BST traversNode = this;
            while (traversNode != null) {
                if (value == traversNode.value) {
                    return true;
                } else if (value > traversNode.value) {
                    traversNode = traversNode.right;
                } else {
                    traversNode = traversNode.left;
                }
            }
            return false;
        }

        public BST insert(int value) {
            BST traversNode = this;
            while (true) {
                if (value >= traversNode.value) {
                    if (traversNode.right == null) {
                        traversNode.right = new BST(value);
                        return this;
                    }
                    traversNode = traversNode.right;
                } else {
                    if (traversNode.left == null) {
                        traversNode.left = new BST(value);
                        return this;
                    }
                    traversNode = traversNode.left;
                }
            }
        }
    }
}
