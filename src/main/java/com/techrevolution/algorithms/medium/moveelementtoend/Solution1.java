package com.techrevolution.algorithms.medium.moveelementtoend;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By Hemang Dave
 * Date: 02/12/21
 * Time: 4:59 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        int[] values = {2, 1, 2, 2, 2, 3, 4, 2};
        List<Integer> collect = Arrays.stream(values).boxed().collect(Collectors.toList());
        log.info(moveElementToEnd(collect, 2).toString());

        values = new int[]{1, 2, 4, 5, 6};
        collect = Arrays.stream(values).boxed().collect(Collectors.toList());
        log.info(moveElementToEnd(collect, 3).toString());

        values = new int[]{1, 2, 4, 5, 3};
        collect = Arrays.stream(values).boxed().collect(Collectors.toList());
        log.info(moveElementToEnd(collect, 3).toString());
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        if (!array.contains(toMove)) {
            return array;
        }
        // 2, 1, 2, 2, 2, 3, 4, 2
        Collections.sort(array);
        // 1 , 2 , 2 , 2, 2 , 2 , 3 , 4
        var firstIndex = 0;
        for (var i = 0; i < array.size(); i++) {
            var value = array.get(i);
            if (value < toMove) {
                firstIndex++;
            } else if (value != toMove) {
                array.set(firstIndex, value);
                array.set(i, toMove);
                firstIndex++;
            }
        }
        return array;
    }
}
