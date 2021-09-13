package com.techrevolution.algorithms.easy.tree;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node {
    private final int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }
}
