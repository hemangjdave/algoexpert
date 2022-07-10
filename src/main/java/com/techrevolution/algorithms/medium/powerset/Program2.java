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
 * Date: 28/06/22
 * Time: 9:10 PM
 */
@Slf4j
public class Program2 {
    public static void main(String[] args) {
        log.info(powerset(new ArrayList<>(Arrays.asList(1, 2 , 3 , 4))).toString());
    }

    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();
        if (array.isEmpty()) {
            result.add(array);
            return result;
        }
        Queue<List<Integer>> queue = new ArrayDeque<>();
        result.add(Collections.emptyList());
        for (var i = 0; i < array.size(); i++) {
            List<Integer> list = Collections.singletonList(array.get(i));
            result.add(list);
            queue.add(list);
            processQueue(array, result, queue);
        }
        return result;
    }

    private static void processQueue(List<Integer> array , List<List<Integer>> result, Queue<List<Integer>> queue) {
        while (!queue.isEmpty()){
            List<Integer> list = queue.poll();
            int index = array.indexOf(list.get(list.size() - 1));
            for (var i = index + 1; i < array.size(); i++) {
                List<Integer> sublist = new ArrayList<>(list);
                sublist.add(array.get(i));
                result.add(sublist);
                queue.add(sublist);
            }
        }
    }
}
