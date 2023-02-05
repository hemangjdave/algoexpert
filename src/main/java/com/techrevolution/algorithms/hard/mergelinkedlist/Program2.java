package com.techrevolution.algorithms.hard.mergelinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.naturalOrder;

/**
 * Created By Hemang Dave
 * Date: 07/08/22
 * Time: 1:15 am
 */
public class Program2 {

    public static void main(String[] args) {
        new Program2().run();
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

    private void run() {
        LinkedList list1 = new LinkedList(2);
        addMany(list1, new ArrayList<>(Arrays.asList(6, 7, 8)));
        LinkedList list2 = new LinkedList(1);
        addMany(list2, new ArrayList<>(Arrays.asList(3, 4, 5, 9, 10)));
        LinkedList linkedList = mergeLinkedLists(list1, list2);
        while (linkedList != null) {
            System.out.print(linkedList.value + " ");
            linkedList = linkedList.next;
        }
    }

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        List<Integer> headOneList = new ArrayList<>();
        fillList(headOneList, headOne);
        headOneList.sort(naturalOrder());
        List<Integer> headTwoList = new ArrayList<>();
        fillList(headTwoList, headTwo);
        headTwoList.sort(naturalOrder());
        LinkedList traverseList;
        LinkedList resultList;
        if (headOne.value < headTwo.value) {
            headOneList.addAll(headTwoList);
            traverseList = headTwo;
            resultList = traverseList;
            traverseList = printList(headOneList, traverseList);
        } else {
            headTwoList.addAll(headOneList);
            traverseList = headOne;
            resultList = traverseList;
            printList(headTwoList, traverseList);
        }
        return resultList;
    }

    private static LinkedList printList(List<Integer> list, LinkedList traverseList) {
        list.sort(naturalOrder());
        for (var i = 1; i < list.size(); i++) {
            traverseList = new LinkedList(list.get(i));
            traverseList = traverseList.next;
        }
        return traverseList;
    }

    private static void fillList(List<Integer> list, LinkedList linkedList) {
        LinkedList traverseList = linkedList;
        while (traverseList != null) {
            list.add(traverseList.value);
            traverseList = traverseList.next;
        }
    }

    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

}
