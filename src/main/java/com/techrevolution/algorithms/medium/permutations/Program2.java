package com.techrevolution.algorithms.medium.permutations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created By Hemang Dave
 * Date: 30/08/22
 * Time: 1:06 am
 */
public class Program2 {

    private final List<Integer> list = new ArrayList<>();
    private final IntPredicate intPredicate = (value -> value > 10);

    public static void main(String[] args) {
//        System.out.println(getPermutations(Arrays.asList(1, 2, 3)));
        Program2 program2 = new Program2();
        List<Integer> l1 = program2.list;
        List<Integer> l2 = program2.list;
        System.out.println(l1 == l2);

        Predicate<Integer> predicate1 = program2.getPredicate();
        Predicate<Integer> predicate2 = program2.getPredicate();
        System.out.println(predicate1 == predicate2);

        IntPredicate intPredicate1 = program2.intPredicate;
        IntPredicate intPredicate2 = program2.intPredicate;
        System.out.println(intPredicate1 == intPredicate2);

    }

    private List<Integer> getList() {
        return new ArrayList<>();
    }

    private Predicate<Integer> getPredicate() {
        return new PredicateImpl();
    }

    static class PredicateImpl implements Predicate<Integer> {
        @Override
        public boolean test(Integer integer) {
            return false;
        }
    }

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();
        if (array.isEmpty()) {
            return result;
        }
        if (array.size() == 1) {
            return Collections.singletonList(array);
        }
        Queue<List<Integer>> arrayQueue = new ArrayDeque<>();
        arrayQueue.add(array);
        generatePermutations(arrayQueue, result);
        return result;
    }

    private static void generatePermutations(Queue<List<Integer>> arrayQueue, List<List<Integer>> result) {
        var start = 0;
        var end = 1;
        while (! arrayQueue.isEmpty()) {
            List<Integer> integers = arrayQueue.poll();
            result.add(integers);
            var s = start;
            var e = end;
            while (e < integers.size() - 1) {
                Collections.swap(integers, s, e);
                e++;
                ArrayList<Integer> list = new ArrayList<>(integers);
                arrayQueue.add(list);
                result.add(list);
            }
            start++;
            end++;
        }
    }

}
