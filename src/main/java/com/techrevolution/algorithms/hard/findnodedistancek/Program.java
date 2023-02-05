package com.techrevolution.algorithms.hard.findnodedistancek;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Created By Hemang Dave
 * Date: 27/07/22
 * Time: 9:45 pm
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

        @Override
        public String toString() {
            return " " + value;
        }
    }

    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        // Write your code here.
        Map<BinaryTree, List<BinaryTree>> map = new HashMap<>();
        BinaryTree targetTree = null;
        targetTree = performBidirectionalGraph(map, tree, null, target);
        System.out.println();
        log.info(map.toString());
        ArrayList<Integer> resultList = new ArrayList<>();
        List<BinaryTree> connectedLists = map.get(targetTree);
        Stack<BinaryTree> stack = new Stack<>();
        for (BinaryTree listTree : connectedLists) {
            stack.add(listTree);
            int distnace = 1;
            while (distnace < k) {

            }
        }
        for (BinaryTree connectedTree : connectedLists) {
            int counter = 1;
            List<BinaryTree> trees = new ArrayList<>();
            while (counter < k) {
                trees = map.get(connectedTree);
                counter++;
            }
            for (BinaryTree innerTree : trees) {
                if (innerTree.value != target) {
                    resultList.add(innerTree.value);
                }
            }
        }

        return resultList;
    }

    private BinaryTree performBidirectionalGraph(Map<BinaryTree, List<BinaryTree>> map, BinaryTree tree , BinaryTree targetTree , int target) {
        Queue<BinaryTree> bfsQueue = new ArrayDeque<>();
        bfsQueue.add(tree);
        while (! bfsQueue.isEmpty()) {
            BinaryTree currentTreeNode = bfsQueue.poll();
            if (currentTreeNode.value == target) {
                targetTree = currentTreeNode;
            }
            if (currentTreeNode.left != null) {
                bfsQueue.add(currentTreeNode.left);
                List<BinaryTree> valueList = map.get(currentTreeNode);
                if (valueList == null) {
                    map.put(currentTreeNode, new ArrayList<>(Collections.singletonList(currentTreeNode.left)));
                } else {
                    valueList.add(currentTreeNode.left);
                }
                List<BinaryTree> leftNodeList = map.get(currentTreeNode.left);
                if (leftNodeList == null) {
                    map.put(currentTreeNode.left, new ArrayList<>(Collections.singletonList(currentTreeNode)));
                } else {
                    leftNodeList.add(currentTreeNode);
                }
            }
            if (currentTreeNode.right != null) {
                bfsQueue.add(currentTreeNode.right);
                List<BinaryTree> valueList = map.get(currentTreeNode);
                if (valueList == null) {
                    map.put(currentTreeNode, new ArrayList<>(Collections.singletonList(currentTreeNode.right)));
                } else {
                    valueList.add(currentTreeNode.right);
                }
                List<BinaryTree> leftNodeList = map.get(currentTreeNode.right);
                if (leftNodeList == null) {
                    map.put(currentTreeNode.right, new ArrayList<>(Collections.singletonList(currentTreeNode)));
                } else {
                    leftNodeList.add(currentTreeNode);
                }
            }
            System.out.print(" " + currentTreeNode.value);
        }
        return targetTree;
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new Program.BinaryTree(2);
        root.right = new Program.BinaryTree(3);
        root.left.left = new Program.BinaryTree(4);
        root.left.right = new Program.BinaryTree(5);
        root.right.right = new Program.BinaryTree(6);
        root.right.right.left = new Program.BinaryTree(7);
        root.right.right.right = new Program.BinaryTree(8);
        int target = 3;
        int k = 2;
        ArrayList<Integer> nodesDistanceK = new Program().findNodesDistanceK(root, target, k);
        System.out.println(nodesDistanceK);
    }
}
