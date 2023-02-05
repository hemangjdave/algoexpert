package com.techrevolution.algorithms.easy.removeduplicatefromlinkedlist;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created By Hemang Dave
 * Date: 26/07/22
 * Time: 1:16 AM
 */
public class Program {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // 1 1 3 4 4 4 5 6 6
    // 1 3 4 5 6
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        Set<Integer> set = new LinkedHashSet<>();
        BigInteger bigInteger;
        LinkedList temp = linkedList;
        LinkedList unique = linkedList;
        while (temp != null) {
            set.add(temp.value);
            temp = temp.next;
        }
        for (var i : set) {
            if (unique != null) {
                unique.value = i;
                temp = unique;
                unique = unique.next;
            }
        }
        if (temp != null && temp.next != null) {
            temp.next = null;
        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        Program program = new Program();
//        program.addMany(linkedList, Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6));
        program.addMany(linkedList, Arrays.asList(1, 9, 11, 15, 15, 16, 17));
        program.printLinkedList(linkedList);
        LinkedList duplicates = program.removeDuplicatesFromLinkedList(linkedList);
        System.out.println();
        program.printLinkedList(duplicates);
    }

    private void printLinkedList(LinkedList list) {
        LinkedList traverseNode = list;
        while (traverseNode != null) {
            System.out.print(traverseNode.value + " ");
            traverseNode = traverseNode.next;
        }
    }

    public LinkedList addMany(LinkedList ll, List<Integer> values) {
        LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new LinkedList(value);
            current = current.next;
        }
        return ll;
    }
}
