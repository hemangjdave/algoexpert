package com.techrevolution.algorithms.hard.findnodedistancek;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.singletonList;

/**
 * Created By Hemang Dave
 * Date: 31/07/22
 * Time: 8:10 pm
 */
@Slf4j
public class Program2 {

    private final Map<BinaryTree, List<BinaryTree>> map = new HashMap<>();

    private final ArrayList<Integer> resultValue = new ArrayList<>();

    private final Set<Integer> integers = new HashSet<>();

    private int target;

    private int depth;


    public void setTarget(int target) {
        this.target = target;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    static class BinaryTree {
        public final int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return " " + value;
        }
    }

    private void addToVisitedNodes(List<BinaryTree> binaryTrees) {
        binaryTrees.forEach(tree1 -> integers.add(tree1.value));
    }

    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        // Write your code here.
        this.setDepth(k);
        this.setTarget(target);
        BinaryTree targetNode = getTargetNode(tree, null, target);
        if (targetNode == null) {
            return new ArrayList<>();
        }
        List<BinaryTree> binaryTrees = map.get(targetNode);
        addToVisitedNodes(binaryTrees);
        fillList(binaryTrees, 1);
        return resultValue;
    }

    private void fillList(List<BinaryTree> initialList, int initialDepth) {
        if (initialDepth == depth) {
            initialList.forEach(tree -> resultValue.add(tree.value));
            return;
        }
        List<BinaryTree> collections = new ArrayList<>();
        for (BinaryTree tree : initialList) {
            if (tree.value != target) {
                List<BinaryTree> binaryTrees = map.get(tree);
                binaryTrees.removeIf(tree1 -> tree1.value == target);
                binaryTrees.forEach(tree1 -> {
                    if (! integers.contains(tree1.value)) {
                        collections.add(tree1);
                        addToVisitedNodes(singletonList(tree1));
                    }
                });
            }
        }
        fillList(collections, ++ initialDepth);
    }

    private BinaryTree getTargetNode(BinaryTree rootTree, BinaryTree targetNode, int target) {
        if (rootTree.left != null) {
            targetNode = getTargetNode(rootTree.left, targetNode, target);
        }
        if (rootTree.right != null) {
            targetNode = getTargetNode(rootTree.right, targetNode, target);
        }
        if (rootTree.value == target) {
            targetNode = rootTree;
        }
        map.put(rootTree, new ArrayList<>());
        generateMap(rootTree);
        return targetNode;
    }

    private void generateMap(BinaryTree tree) {
        if (isLeafNode(tree)) {
            return;
        }
        if (tree.left != null) {
            map.get(tree).add(tree.left);
            map.get(tree.left).add(tree);
        }
        if (tree.right != null) {
            map.get(tree).add(tree.right);
            map.get(tree.right).add(tree);
        }
    }

    private boolean isLeafNode(BinaryTree tree) {
        return tree.left == null && tree.right == null;
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.right = new BinaryTree(6);
        root.right.right.left = new BinaryTree(7);
        root.right.right.left.right = new BinaryTree(9);
        root.right.right.right = new BinaryTree(8);
        root.right.right.right.right = new BinaryTree(10);
        int target = 3;
        int k = 3;
        Program2 program2 = new Program2();
        List<Integer> finalResult = program2.findNodesDistanceK(root, target, k);
        log.info(finalResult.toString());
    }
}
