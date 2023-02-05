package com.techrevolution.algorithms.hard.mergelinkedlist;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 06/08/22
 * Time: 6:31 pm
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        new Program().run();
    }

    public void run() {
        LinkedList list1 = new LinkedList(2);
        addMany(list1, new ArrayList<>(Arrays.asList(6, 7, 8)));
        LinkedList list2 = new LinkedList(1);
        addMany(list2, new ArrayList<>(Arrays.asList(3, 4, 5, 9, 10)));
        LinkedList output = mergeLinkedLists(list1, list2);
        printList(output);
        List<Integer> expectedNodes =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        log.info(getNodesInArray(output).equals(expectedNodes) + ""); // true
    }

    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // headone 2 6 7 8
    // headtwo 1 3 4 5 9 10
    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        // Write your code here.
        LinkedList returnList, finalResult;
        if (headOne.value > headTwo.value) {
            returnList = headTwo;
            finalResult = returnList;
            merge(headTwo.next, headOne, returnList);
        } else {
            returnList = headOne;
            finalResult = returnList;
            merge(headOne.next, headTwo, returnList);
        }
        return finalResult;
    }

    private static void merge(LinkedList mainList, LinkedList subList, LinkedList returnList) {
        if (mainList == null || subList == null) {
            if (mainList != null) {
                returnList.next = mainList;
            } else if (subList != null) {
                returnList.next = subList;
            }
            printList(returnList);
            return;
        }
        if (mainList.value > subList.value) {
            returnList.next = subList;
            returnList = returnList.next;
            merge(mainList, subList.next, returnList);
        } else {
            returnList.next = mainList;
            returnList = returnList.next;
            merge(mainList.next, subList, returnList);
        }
    }

    private static void printList(LinkedList list) {
        LinkedList traverseList = list;
        while (traverseList != null) {
            System.out.print(traverseList.value + " ");
            traverseList = traverseList.next;
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

    public List<Integer> getNodesInArray(LinkedList ll) {
        List<Integer> nodes = new ArrayList<>();
        LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }
}
