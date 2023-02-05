package com.techrevolution.algorithms.veryhard.compareleaftraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Created By Hemang Dave
 * Date: 23/07/22
 * Time: 5:29 PM
 */
public class Program {
	public static void main(String[] args) {
		BinaryTree tree1 = new BinaryTree(1);
		tree1.left = new BinaryTree(2);
		tree1.right = new BinaryTree(3);
		tree1.left.left = new BinaryTree(4);
		tree1.left.right = new BinaryTree(5);
		tree1.right.right = new BinaryTree(6);
		tree1.left.right.left = new BinaryTree(7);
		tree1.left.right.right = new BinaryTree(8);

		BinaryTree tree2 = new BinaryTree(1);
		tree2.left = new BinaryTree(2);
		tree2.right = new BinaryTree(3);
		tree2.left.left = new BinaryTree(4);
		tree2.left.right = new BinaryTree(7);
		tree2.right.right = new BinaryTree(5);
		tree2.right.right.left = new BinaryTree(8);
		tree2.right.right.right = new BinaryTree(6);
		new Program().compareLeafTraversal(tree1, tree2);
	}

	public boolean compareLeafTraversal(BinaryTree tree1, BinaryTree tree2) {
		// Write your code here.
		List<Integer> list1 = traverseNode(tree1);
		List<Integer> list2 = traverseNode(tree2);
		if (list1.size() != list2.size()) {
			return false;
		}
		for (int i = 0; i < list1.size(); i++) {
			if (! Objects.equals(list1.get(i), list2.get(i))) {
				return false;
			}
		}

		// this is the stream version of the above code...need to check if it passes or not...
		// will check letter 🤗
		Optional<Integer> optionalInteger = list1.stream().dropWhile(integer -> ! Objects.equals(list1.get(integer), list2.get(integer)))
				.findFirst();
		return optionalInteger.isEmpty();
	}

	private List<Integer> traverseNode(BinaryTree tree) {
		List<Integer> result = new ArrayList<>();
		prepareList(tree, result);
		return result;
	}

	private void prepareList(BinaryTree tree, List<Integer> result) {
		if (tree.left != null) {
			prepareList(tree.left, result);
		}
		if (isLeafNode(tree)) {
			result.add(tree.value);
		}
		if (tree.right != null) {
			prepareList(tree.right, result);
		}
	}

	private boolean isLeafNode(BinaryTree tree) {
		return tree.left == null && tree.right == null;
	}

	// This is an input class. Do not edit.
	static class BinaryTree {
		public int value;
		public BinaryTree left = null;
		public BinaryTree right = null;

		public BinaryTree(int value) {
			this.value = value;
		}
	}
}
