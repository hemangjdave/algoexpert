package com.techrevolution.algorithms.easy.tree;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Node {
    private final int value;
    private Node left;
    private Node right;
}
