package com.techrevolution.algorithms.easy.tree;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.function.BiPredicate;

/**
 * Created by Hemang Dave.
 * Date: 24/09/21
 * Time: 2:24 PM
 */
@Slf4j
@RequiredArgsConstructor
public class FindClosestValueInTree {
    private final BinaryTree binaryTree;

    public int findClosestValueInTree(int value) {
        final BiPredicate<Integer, Integer> biPredicate = (targetValue, nodeValue) -> targetValue < nodeValue;
        Node rootNode = binaryTree.getRootNode();
        Node closestNode = rootNode;
        while (rootNode != null) {
            rootNode = biPredicate.test(value, rootNode.getValue()) ?
                    rootNode.getLeft() :
                    rootNode.getRight();
            var distanceFromClosestNode = getAbsoluteValue(value, closestNode.getValue()); // 1
            if (rootNode != null) {
                var distanceFromCurrentNode = getAbsoluteValue(value, rootNode.getValue()); // 5
                if (distanceFromCurrentNode < distanceFromClosestNode) closestNode = rootNode;
            }
        }
        return closestNode != null ? closestNode.getValue() : -1;
    }

    private int getAbsoluteValue(int value, int nodeValue) {
        return Math.abs(value - nodeValue);
    }


}
