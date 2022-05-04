package com.techrevolution.algorithms.hard.largestrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created By Hemang Dave
 * Date: 30/04/22
 * Time: 5:26 PM
 */
public class Program {

    public static int[] largestRange(int[] array) {
        // Write your code here.
        if (array.length == 1) {
            return new int[]{array[0], array[0]};
        }
//        Arrays.sort(array);
        // 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 10 , 11 , 12 , 15
        // 1 , 2
        // 0 , 2 , 3 , 4 , 5 , 6 , 7 , 10 , 11 , 12 , 15
        int[] values = new int[2];
        SortedSet<Integer> integerSet = new TreeSet<>();
        Arrays.stream(array).forEach(integerSet::add);
        var maxRange = 0;
        var currentNumber = array[0];
        var counter = 1;
        List<Integer> list = new ArrayList<>();
        list.add(currentNumber);
        for (Integer i : integerSet) {
            if (currentNumber + counter++ == i) {
                list.add(i);
            } else if (list.size() == 1) {
                list.clear();
                currentNumber = i;
                counter = 1;
                list.add(currentNumber);
            } else if (list.size() > maxRange) {
                maxRange = list.size();
                values[0] = list.get(0);
                values[1] = list.get(list.size() - 1);
                list.clear();
                currentNumber = i;
                list.add(currentNumber);
                counter = 1;
            }
        }
        if (list.size() > maxRange) {
            values[0] = list.get(0);
            values[1] = list.get(list.size() - 1);
        }

        return values;
    }
}
