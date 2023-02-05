package com.techrevolution.algorithms.medium.removeduplicates;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * Created By Hemang Dave
 * Date: 16/08/22
 * Time: 6:38 pm
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 7, 7, 8, 9, 10, 11, 11);
        log.info(removeDuplicates(integerList).toString());
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer value : list) {
            UnaryOperator<Integer> function = key -> key;
            Integer integer = map.computeIfPresent(value, (key , val) -> val);
            if (map.computeIfAbsent(value, function) != null) {
                uniqueList.add(value);
            }
        }
        return uniqueList;
    }
}
