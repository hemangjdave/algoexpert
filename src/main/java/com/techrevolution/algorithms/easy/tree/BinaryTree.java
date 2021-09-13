package com.techrevolution.algorithms.easy.tree;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@Slf4j
public class BinaryTree {

    private Node rootNode;
    private static final BiPredicate<Integer, Integer> biPredicate = (value, nodeValue) -> value > nodeValue;
    private static final Predicate<Node> nullCheckPredicate = Objects::nonNull;
    private static final UnaryOperator<Node> rightNodeUnaryOperator = Node::getRight;
    private static final UnaryOperator<Node> leftNodeUnaryOperator = Node::getLeft;

    public void add(int value) {
        Node newNode = new Node(value);
        Node traverseNode = rootNode;
        if (rootNode == null) {
            rootNode = newNode;
            return;
        }
        while (traverseNode != null) {
            traverseNode = biPredicate.test(value, getValueFromNode(traverseNode))
                    ? linkRightNode(traverseNode, newNode)
                    : linkLeftNode(traverseNode, newNode);
        }
    }

    private static int getValueFromNode(Node node) {
        return node.getValue();
    }

    private static Node linkLeftNode(Node traverseNode, Node newNode) {
        if (nullCheckPredicate.negate().test(leftNodeUnaryOperator.apply(traverseNode))) {
            traverseNode.setLeft(newNode);
            return null;
        }
        return leftNodeUnaryOperator.apply(traverseNode);
    }

    private static Node linkRightNode(Node traverseNode , Node newNode){
        if (nullCheckPredicate.negate().test(rightNodeUnaryOperator.apply(traverseNode))) {
            traverseNode.setRight(newNode);
            return null;
        }
        return rightNodeUnaryOperator.apply(traverseNode);
    }

    public void printNodeValue(){
        traverseNode(rootNode);
    }

    private static void traverseNode(Node rootNode){
        if (nullCheckPredicate.test(leftNodeUnaryOperator.apply(rootNode))) {
            traverseNode(leftNodeUnaryOperator.apply(rootNode));
        }
        log.info(String.valueOf(getValueFromNode(rootNode)));
        if (nullCheckPredicate.test(rightNodeUnaryOperator.apply(rootNode))) {
            traverseNode(rightNodeUnaryOperator.apply(rootNode));
        }
    }

    public int getClosestValueInTree(int value){
        Node traverseNode = rootNode;
        while (traverseNode != null) {
            int valueFromNode = getValueFromNode(traverseNode);
            if (value == valueFromNode) {
                return value;
            }
            if (value > valueFromNode) {
                traverseNode = rightNodeUnaryOperator.apply(traverseNode);
                if (traverseNode.getValue() > value && leftNodeUnaryOperator.apply(traverseNode) == null) {
                    return valueFromNode;
                }
            } else {
                traverseNode = traverseNode.getLeft();
                if (traverseNode.getValue() < value && rightNodeUnaryOperator.apply(traverseNode) == null) {
                    return valueFromNode;
                }
            }
        }
        return  -1;
    }
}
