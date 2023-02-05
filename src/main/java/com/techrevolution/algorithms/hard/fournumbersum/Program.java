package com.techrevolution.algorithms.hard.fournumbersum;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created By Hemang Dave
 * Date: 29/04/22
 * Time: 6:24 PM
 */
@Slf4j
public class Program {

    public static void main(String[] args) {
        List<Integer[]> integers = fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);
        integers.forEach(integers1 -> log.info(Arrays.toString(integers1)));
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        var totalSum = IntStream.of(array).sum();
        if (targetSum > totalSum) {
            return Collections.emptyList();
        }

        final List<Integer[]> list = new ArrayList<>();
        List<Integer> integerList = Arrays.stream(array).boxed().toList();
        for (var i = 0; i <= integerList.size() - 4; i++) {
            Integer[] integers = new Integer[4];
            var finalSum = targetSum - integerList.get(i);
            var firstSum = finalSum;
            for (var j = i + 1; j <= integerList.size() - 3; j++) {
                finalSum = finalSum - integerList.get(j);
                var secondSum = finalSum;
                for (var k = j + 1; k < integerList.size(); k++) {
                    finalSum = finalSum - integerList.get(k);
                    List<Integer> sublist = integerList.subList(k + 1, integerList.size());
                    if (sublist.contains(finalSum)) {
                        integers[0] = integerList.get(i);
                        integers[1] = integerList.get(j);
                        integers[2] = integerList.get(k);
                        integers[3] = finalSum;
                        list.add(integers);
                        integers = new Integer[4];
                    }
                    finalSum = secondSum;
                }
                finalSum = firstSum;
            }
        }
        return list;
    }

    private static void printInfo() {
        System.out.println("Hemang is printing with fleet....it is writeen in kotlin...");
    }
}
