package com.techrevolution.algorithms.veryhard.allkindofnodedepth;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 17/08/22
 * Time: 3:44 pm
 */
@Slf4j
public class Program2 {
	public static void main(String[] args) {
		var root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.left.left = new BinaryTree(4);
		root.left.left.left = new BinaryTree(8);
		root.left.left.right = new BinaryTree(9);
		root.left.right = new BinaryTree(5);
		root.right = new BinaryTree(3);
		root.right.left = new BinaryTree(6);
		root.right.right = new BinaryTree(7);
		log.info("Total height is:--{}", allKindsOfNodeDepths(root));
	}

	public static int allKindsOfNodeDepths(BinaryTree root) {
		// Write your code here.
		var childNodeMap = new HashMap<Integer, Integer>();
		postOrderTraverse(root, childNodeMap);
		return - 1;
	}

	private static void postOrderTraverse(BinaryTree tree, Map<Integer, Integer> childNodeMap) {
		if (tree.left != null) {
			postOrderTraverse(tree.left, childNodeMap);
		}
		if (tree.right != null) {
			postOrderTraverse(tree.right, childNodeMap);
		}
		if (! isLeafNode(tree))
			childNodeMap.put(tree.value, (getNodeDepth(tree.left, childNodeMap) + getNodeDepth(tree.right, childNodeMap) - 1));
	}

	private static int getNodeDepth(BinaryTree tree, Map<Integer, Integer> childNodeMap) {
		final Integer depth = childNodeMap.get(tree.value);
		if (depth == null) {
			return 1;
		}
		return 2 * (depth) + 1;
	}

	private static boolean isLeafNode(BinaryTree tree) {
		return tree.left == null && tree.right == null;
	}

	static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}
}
