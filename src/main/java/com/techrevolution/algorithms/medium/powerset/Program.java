package com.techrevolution.algorithms.medium.powerset;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

/**
 * Created By Hemang Dave
 * Date: 26/06/22
 * Time: 5:25 PM
 */
@Slf4j
public class Program {

    public static void main(String[] args) {
        log.info(powerSet(new ArrayList<>(Arrays.asList(1, 2 , 3 , 4))).toString());
    }

    public static List<List<Integer>> powerSet(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> result = new ArrayList<>();
        if (array.isEmpty()) {
            result.add(array);
            return result;
        }
        for (var i = 0; i < array.size(); i++) {
            result.add(Collections.singletonList(i));
            powerSet(array, result, i);
        }
        return result;
    }

    private static void powerSet(List<Integer> list, List<List<Integer>> result, int index) {
        Queue<List<Integer>> queue = new ArrayDeque<>();
        for (var i = index; i < list.size(); i++) {
            for (var j = i + 1; j < list.size(); j++) {
                List<Integer> integers = Arrays.asList(list.get(i), list.get(j));
                result.add(integers);
                queue.add(integers);
            }
        }
        while (!queue.isEmpty()) {
            List<Integer> integerList = queue.poll();
            int currentSize = list.indexOf(integerList.get(integerList.size() - 1)) + 1;
            for (var i = currentSize; i < list.size(); i++) {
                List<Integer> sublist = new ArrayList<>(integerList);
                sublist.add(list.get(i));
                result.add(sublist);
                queue.add(sublist);
            }
        }
    }
}
