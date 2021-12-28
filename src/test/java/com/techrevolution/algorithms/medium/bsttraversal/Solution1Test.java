package com.techrevolution.algorithms.medium.bsttraversal;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
class Solution1Test {

    @Test
    void testBstTraversal() {
        Solution1.BST bst = new Solution1.BST(10);
        bst.right = new Solution1.BST(15);
        bst.right.right = new Solution1.BST(22);
        bst.left = new Solution1.BST(5);
        bst.left.left = new Solution1.BST(2);
        bst.left.right = new Solution1.BST(5);
        bst.left.left.left = new Solution1.BST(1);
        Integer[] expected = {1, 2, 5, 5, 10, 15, 22};
        List<Integer> integerList = Solution1.inOrderTraverse(bst, new ArrayList<>());
        Integer[] actual = integerList.toArray(integerList.toArray(new Integer[0]));
        Assertions.assertArrayEquals(expected, actual);
        expected = new Integer[]{10, 5, 2, 1, 5, 15, 22};
        actual = Solution1.preOrderTraverse(bst, new ArrayList<>()).toArray(new Integer[0]);
        Assertions.assertArrayEquals(expected, actual);
        Integer[] integers = Solution1.postOrderTraverse(bst, new ArrayList<>()).toArray(new Integer[0]);
        log.info(Arrays.toString(integers));
    }
}
