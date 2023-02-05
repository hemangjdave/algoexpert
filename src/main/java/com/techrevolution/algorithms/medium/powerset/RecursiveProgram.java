package com.techrevolution.algorithms.medium.powerset;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created By Hemang Dave
 * Date: 22/08/22
 * Time: 11:38 pm
 */
@Slf4j
public class RecursiveProgram {
    public static void main(String[] args) {
        log.info(powerSet(IntStream.rangeClosed(1, 4).boxed().toList()).toString());
        System.out.println();
        log.info(powerSet(List.of()).toString());
    }

    public static List<List<Integer>> powerSet(List<Integer> array) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (array.isEmpty()) {
            addEmptyList(resultList);
            return resultList;
        }
        addEmptyList(resultList);
        for (var i = 0; i < array.size(); i++) {
            List<Integer> originalList = new ArrayList<>(Collections.singletonList(array.get(i)));
            resultList.add(originalList);
            generatePowerSet(array, originalList, resultList, i + 1);
        }
        return resultList;
    }

    private static void addEmptyList(List<List<Integer>> list) {
        list.add(Collections.emptyList());
    }

    private static void generatePowerSet(List<Integer> array, List<Integer> originalList, List<List<Integer>> resultList, int index) {
        if (index >= array.size()) {
            return;
        }
        List<Integer> list = new ArrayList<>(originalList);
        list.add(array.get(index));
        resultList.add(list);
        generatePowerSet(array, originalList, resultList, ++index);
        generatePowerSet(array, list, resultList, index);
    }
}