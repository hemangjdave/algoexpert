package com.techrevolution.algorithms.easy.linkedlist;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Hemang Dave.
 * Date: 04/10/21
 * Time: 5:13 PM
 */
@Slf4j
public class SinglyLinkedList {

    private Node rootNode;
    private Node traverseNode;

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        log.info(list.toString());
        list.removeDuplicates();
        log.info(list.toString());
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
            traverseNode = rootNode;
            return;
        }
        traverseNode.setNext(newNode);
        traverseNode = newNode;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void removeDuplicates(LinkedList list) {
        
    }

    public void removeDuplicates() {
        Node headNode = rootNode;
        Node previouseNode = null;
        var currentValue = 0;
        var nextValue = 0;
        while (headNode != null) {
            currentValue = headNode.getValue();
            if (currentValue == nextValue && previouseNode != null) {
                previouseNode.setNext(headNode.getNext());
            }
            previouseNode = headNode;
            headNode = headNode.getNext();
            if (headNode != null) {
                nextValue = headNode.getValue();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node headNode = rootNode;
        while (headNode != null) {
            builder.append(headNode.getValue()).append(" ");
            headNode = headNode.getNext();
        }
        return builder.toString();
    }

    @RequiredArgsConstructor
    @Setter
    @Getter
    static class Node {
        private final int value;
        private Node next;
    }
}
