package com.techrevolution.algorithms.easy.tree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
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
        log.info(tree.toString());
        log.info(String.valueOf(tree.getClosestValueInTree(1)));
        log.info(String.valueOf(tree.getClosestValueInTree(17)));
        log.info(String.valueOf(tree.getClosestValueInTree(21)));
        log.info(String.valueOf(tree.getClosestValueInTree(19)));
    }
}
