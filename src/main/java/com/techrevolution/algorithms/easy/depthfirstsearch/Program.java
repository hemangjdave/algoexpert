package com.techrevolution.algorithms.easy.depthfirstsearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 26/05/22
 * Time: 4:46 PM
 */
public class Program {
	// Do not edit the class below except
	// for the depthFirstSearch method.
	// Feel free to add new properties
	// and methods to the class.
	static class Node {
		String name;
		List<Node> children = new ArrayList<>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> depthFirstSearch(List<String> array) {
			// Write your code here.
			Deque<Node> stack = new ArrayDeque<>();
			stack.add(this);
			while (! stack.isEmpty()) {
				Node node = stack.pop();
				array.add(node.name);
				List<Node> nodeList = node.children;
				if (! nodeList.isEmpty()) {
					for (var i = nodeList.size() - 1; i >= 0; i--) {
						stack.add(nodeList.get(i));
					}
				}
			}
			return array;
		}

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}

		@Override
		public String toString() {
			return "Node{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}
