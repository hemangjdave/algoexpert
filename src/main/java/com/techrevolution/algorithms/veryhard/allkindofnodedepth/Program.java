package com.techrevolution.algorithms.veryhard.allkindofnodedepth;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 14/08/22
 * Time: 11:28 pm
 */
@Slf4j
public class Program {
    public static int allKindsOfNodeDepths(BinaryTree root) {
        // Write your code here.
        final HashMap<Integer, Integer> routeMap = new HashMap<>();
        postOrderTraverse(root, new HashMap<>(), routeMap);
        return routeMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    private static void postOrderTraverse(BinaryTree tree, Map<Integer, Integer> sumMap, Map<Integer, Integer> routeMap) {
        if (tree.left != null) {
            postOrderTraverse(tree.left, sumMap, routeMap);
        }
        if (tree.right != null) {
            postOrderTraverse(tree.right, sumMap, routeMap);
        }
        sumMap.put(tree.value, getChildNodes(tree));
    }

    private static int getChildNodes(BinaryTree tree) {
        if (tree.left == null) {
            return 0;
        }
        int childNode = 1 + getChildNodes(tree.left);
        childNode = childNode + getChildNodes(tree.right) + 1;
        return childNode;
    }

    private static boolean isLeafNode(BinaryTree tree) {
        return tree.left == null && tree.right == null;
    }

    public static void main(String[] args) {
        var root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);
        root.left.right = new BinaryTree(5);
        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        log.info("Total height is:--{}", allKindsOfNodeDepths(root));
    }

    static class BinaryTree {
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
