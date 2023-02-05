package com.techrevolution.algorithms.medium.linkedlistconstruction;

/**
 * Created By Hemang Dave
 * Date: 12/08/22
 * Time: 9:03 pm
 */
public class Program {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.setHead(new Node(1));
		doublyLinkedList.setTail(new Node(5));
		System.out.println(doublyLinkedList);

	}

	static class DoublyLinkedList {
		public Node head;
		public Node tail;

		public void setHead(Node node) {
			// Write your code here.
		}

		public void setTail(Node node) {
			// Write your code here.
		}

		public void insertBefore(Node node, Node nodeToInsert) {
			// Write your code here.
		}

		public void insertAfter(Node node, Node nodeToInsert) {
			// Write your code here.
		}

		public void insertAtPosition(int position, Node nodeToInsert) {
			// Write your code here.
		}

		public void removeNodesWithValue(int value) {
			// Write your code here.
		}

		public void remove(Node node) {
			// Write your code here.
		}

		public boolean containsNodeWithValue(int value) {
			// Write your code here.
			return false;
		}

		@Override
		public String toString() {
			var traverseNode = head;
			var builder = new StringBuilder();
			while (traverseNode != null) {
				builder.append(traverseNode.value);
				traverseNode = traverseNode.next;
			}
			return builder.toString();
		}
	}

	// Do not edit the class below.
	static class Node {
		public int value;
		public Node prev;
		public Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
