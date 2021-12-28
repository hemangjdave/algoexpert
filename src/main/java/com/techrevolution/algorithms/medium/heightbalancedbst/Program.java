package com.techrevolution.algorithms.medium.heightbalancedbst;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Hemang Dave.
 * Date: 28/12/21
 * Time: 11:50 AM
 */
@Slf4j
public class Program {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class TreeInfo {
        public final int leftHeight;
        public final int rightHeight;
        public final boolean isBalanced;

        public TreeInfo(int leftHeight, int rightHeight, boolean isBalanced) {
            this.leftHeight = leftHeight;
            this.rightHeight = rightHeight;
            this.isBalanced = isBalanced;
        }
    }

    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        // Write your code here.
        Map<BinaryTree, TreeInfo> binaryTreeTreeInfoMap = heightBalancedBinaryTree(tree, new HashMap<>());
        Optional<TreeInfo> optionalTreeInfo = binaryTreeTreeInfoMap.values().stream().filter(treeInfo -> !treeInfo.isBalanced).findAny();
        return optionalTreeInfo.isEmpty();
    }

    public Map<BinaryTree, TreeInfo> heightBalancedBinaryTree(BinaryTree tree, Map<BinaryTree, TreeInfo> map) {
        // Write your code here.
        if (tree.left != null) {
            heightBalancedBinaryTree(tree.left, map);
        }
        if (tree.right != null) {
            heightBalancedBinaryTree(tree.right, map);
        }
        // log.info(String.valueOf(tree.value));
        return storeTreeInfo(tree, map);
    }

    private Map<BinaryTree, TreeInfo> storeTreeInfo(BinaryTree tree, Map<BinaryTree, TreeInfo> map) {
        if (isLeafNode(tree)) {
            TreeInfo treeInfo = new TreeInfo(0, 0, true);
            map.put(tree, treeInfo);
        } else {
            var leftHeight = 0;
            var rightHeight = 0;
            if (tree.left != null) {
                TreeInfo treeInfo = map.get(tree.left);
                if (treeInfo == null || !treeInfo.isBalanced) {
                    return map;
                }
                var lHeight = treeInfo.leftHeight;
                var rHeight = treeInfo.rightHeight;
                leftHeight = Math.max(lHeight, rHeight) + 1;
            }
            if (tree.right != null) {
                TreeInfo treeInfo = map.get(tree.right);
                if (treeInfo == null || !treeInfo.isBalanced) {
                    return map;
                }
                var lHeight = treeInfo.leftHeight;
                var rHeight = treeInfo.rightHeight;
                rightHeight = Math.max(lHeight, rHeight) + 1;
            }
            var isBalanced = Math.abs(leftHeight - rightHeight) <= 1;
            TreeInfo treeInfo = new TreeInfo(leftHeight, rightHeight, isBalanced);
            map.put(tree, treeInfo);
        }
        return map;
    }

    private boolean isLeafNode(BinaryTree tree) {
        return tree.left == null && tree.right == null;
    }
}
