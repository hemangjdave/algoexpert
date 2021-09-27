package com.techrevolution.algorithms.easy.branchsum;

import com.techrevolution.algorithms.easy.tree.BinaryTree;
import com.techrevolution.algorithms.easy.tree.Node;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 24/09/21
 * Time: 11:01 PM
 */
@Slf4j
public class Solution1 {

    private static final BinaryTree tree = new BinaryTree();
    private static final List<Integer> branchSums = new ArrayList<>();
    private int sumOfBranch = 0;

    public static void main(String[] args) {
        var solution1 = new Solution1();
        solution1.createTree();
        solution1.sumBranch(tree.getRootNode());
        log.info(branchSums.toString());
    }


    private void sumBranch(Node traverseNode) {
        sumOfBranch += traverseNode.getValue();
        if (traverseNode.getLeft() != null) {
            sumBranch(traverseNode.getLeft());
        }
        if (isLeafNode(traverseNode)) {
            branchSums.add(sumOfBranch);
        }
        if (traverseNode.getRight() != null) {
            sumBranch(traverseNode.getRight());
        }
        sumOfBranch = sumOfBranch - traverseNode.getValue();
    }

    private boolean isLeafNode(Node traverseNode) {
        return traverseNode.getLeft() == null && traverseNode.getRight() == null;
    }

    private void createTree() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(2);
        tree.add(3);
        tree.add(13);
        tree.add(22);
        tree.add(1);
        tree.add(11);
        tree.add(14);
        tree.add(16);
        tree.add(18);
        tree.add(25);
        tree.add(36);
    }

}
