package com.techrevolution.algorithms.easy.nodedepth;

import com.techrevolution.algorithms.easy.tree.Node;

/**
 * Created by Hemang Dave.
 * Date: 30/09/21
 * Time: 12:34 AM
 */
public class Solution3 {

    private Solution3() {
    }

    public static int nodeDepth(Node node) {
        return init(node, 0);
    }

    private static int init(Node node, int depth) {
        if (node == null) {
            return 0;
        }
        return depth + init(node.getLeft(), depth + 1) + init(node.getRight(), depth + 1);
    }
}
