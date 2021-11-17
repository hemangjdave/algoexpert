package com.techrevolution.algorithms.easy.productsum;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 16/11/21
 * Time: 5:14 PM
 */
@Slf4j
public class Solution1 {

    public static void main(String[] args) {
        List<Object> objectArrayList =
                new ArrayList<>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<>(
                                        Arrays.asList(6, new ArrayList<>(Arrays.asList(-13, 8)), 4))));
        log.info("Final value will be for objectArrayList :-- {}", productSum(objectArrayList));
        List<Object> objectList = Arrays.asList(
                3,
                new ArrayList<>(Arrays.asList(1, new ArrayList<>(Collections.singletonList(2))))
        );
        log.info("Final value will be for objectList :-- {}", productSum(objectList));

        List<Object> singleObject = List.of(
                new ArrayList<>(
                        List.of(
                                new ArrayList<>(
                                        List.of(
                                                new ArrayList<>(
                                                        List.of(
                                                                new ArrayList<>(List.of(5))
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        log.info("Final value will be for singleObject :-- {}", productSum(singleObject));
    }

    private static int processList(List<Object> list, int multipliedBy, List<Object> finalValues, int multiplier) {
        log.info("sublist is :--{} with multipliedBy :--{}", list.toString(), multipliedBy);
        for (Object o : list) {
            if (o instanceof List) {
                @SuppressWarnings("unchecked")
                List<Object> subList = ((List<Object>) o);
                processList(subList, multipliedBy * multiplier, finalValues, multiplier + 1);
            } else {
                finalValues.add((int) o * multipliedBy);
            }
        }
        return finalValues.stream().mapToInt(value -> (int) value).sum();
    }

    public static int productSum(List<Object> array) {
        // Write your code here.
        return processList(array, 1, new ArrayList<>(), 2);
    }
}
