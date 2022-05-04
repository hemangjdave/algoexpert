package com.techrevolution.algorithms.hard.largestRectangleUnderSkyline;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    @Test
    void TestCase1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 3, 2, 4, 1, 5, 3, 2));
        int expected = 9;
        var actual = new Program().largestRectangleUnderSkyline(input);
        assertEquals(expected, actual);
    }

    @Test
    void testArrayList() {
        List<String> list = Arrays.asList("Hemang", "Shiva");
        List<String> list2 = new ArrayList<>(list);
        List<String> list3 = new ArrayList<>(Arrays.asList("Hemang", new String("Shiva")));
        System.out.println(list.equals(list2));
        System.out.println(list.equals(list3));
    }

    @Test
    void testForLoop() {
        for (int i = 0, j = i; i < 5; i++) {
            System.out.println("i is:--" + i + " and j is:--" + j);
        }
    }

    @Test
    void testStakeDataStructure() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(1);
        stack.addLast(3);
        stack.addLast(4);
//        System.out.println(stack.getLast());
//        System.out.println(stack.getLast());
//        System.out.println(stack.getLast());
//        System.out.println(stack.element());
//        System.out.println(stack.element());
//        System.out.println(stack.element());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
        Iterator<Integer> iterator = stack.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}