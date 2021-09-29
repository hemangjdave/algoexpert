package com.techrevolution.algorithms.easy.nodedepth;

import com.techrevolution.algorithms.easy.tree.BinaryTree;
import com.techrevolution.algorithms.easy.tree.Node;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Hemang Dave.
 * Date: 27/09/21
 * Time: 11:57 PM
 */
@Slf4j
public class Solution1 {

    private static final BinaryTree tree = new BinaryTree();

    private static int sumOfBranch = 0;
    private static int depthFromRoot = -1;

    public static void main(String[] args) {
        new Solution1().createTree();
        log.info(tree.toString());
        Node rootNode = tree.getRootNode();
        log.info(String.valueOf(nodeDepth(rootNode)));
    }

    public static int nodeDepth(Node node) {
        if (node == null)
            return 0;
        depthFromRoot++;
        sumOfBranch += depthFromRoot;
        log.info("Node value {} with depth {} with sumofbranch {}", node.getValue(), depthFromRoot, sumOfBranch);
        nodeDepth(node.getLeft());
        nodeDepth(node.getRight());
        depthFromRoot--;
        return sumOfBranch;
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
