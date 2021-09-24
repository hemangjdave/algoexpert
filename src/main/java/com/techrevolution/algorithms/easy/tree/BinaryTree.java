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
    private static final StringBuilder stringBuilder = new StringBuilder();

    public Node getRootNode() {
        return rootNode;
    }

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

    private static Node linkRightNode(Node traverseNode, Node newNode) {
        if (nullCheckPredicate.negate().test(rightNodeUnaryOperator.apply(traverseNode))) {
            traverseNode.setRight(newNode);
            return null;
        }
        return rightNodeUnaryOperator.apply(traverseNode);
    }

    private static void traverseNode(Node rootNode) {
        if (nullCheckPredicate.test(leftNodeUnaryOperator.apply(rootNode))) {
            traverseNode(leftNodeUnaryOperator.apply(rootNode));
        }
        stringBuilder.append(getValueFromNode(rootNode));
        stringBuilder.append(" , ");
        if (nullCheckPredicate.test(rightNodeUnaryOperator.apply(rootNode))) {
            traverseNode(rightNodeUnaryOperator.apply(rootNode));
        }
    }

    @Override
    public String toString() {
        stringBuilder.append("[");
        traverseNode(rootNode);
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int getClosestValueInTree(int value) {
        return findClosestValueInBST(rootNode, value, rootNode.getValue());
    }

    public int findClosestValueInBST(Node node, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(target - node.getValue())) {
            closest = node.getValue();
        }
        if (target < node.getValue() && node.getLeft() != null) {
            return findClosestValueInBST(node.getLeft(), target, closest);
        } else if (target > node.getValue() && node.getRight() != null) {
            return findClosestValueInBST(node.getRight(), target, closest);
        } else {
            return closest;
        }
    }
}
