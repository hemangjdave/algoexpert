package com.techrevolution.algorithms.medium.powerset;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * Created By Hemang Dave
 * Date: 28/06/22
 * Time: 9:10 PM
 */
@Slf4j
public class Program2 {
    public static void main(String[] args) {
        log.info(powerset(IntStream.rangeClosed(1, 4).boxed().toList()).toString());
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
            processQueue(array, result, queue, i);
        }
        return result;
    }

    private static void processQueue(List<Integer> array, List<List<Integer>> result, Queue<List<Integer>> queue, int index) {
        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            if (index == array.size() && !Objects.equals(list.get(list.size() - 1), array.get(array.size() - 1))) {
                index -= 2;
            }
            log.info("pulling element {} with index {}" , list , index);
            for (var i = index + 1; i < array.size(); i++) {
                List<Integer> sublist = new ArrayList<>(list);
                sublist.add(array.get(i));
                result.add(sublist);
                queue.add(sublist);
            }
            ++index;

        }
    }
}
