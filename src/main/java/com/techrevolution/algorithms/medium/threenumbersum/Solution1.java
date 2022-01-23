package com.techrevolution.algorithms.medium.threenumbersum;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created By Hemang Dave
 * Date: 02/12/21
 * Time: 12:02 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        List<Integer[]> integers = threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);
        integers.forEach(integers1 -> Stream.of(integers1).forEach(value -> log.info(String.valueOf(value))));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> sumList = new ArrayList<>();
        Arrays.sort(array);
        // -8 , -6 , 1 , 2 , 3 , 5 , 6 , 12
        for (var index = 0; index < array.length - 1; index++) {
            var initialValue = array[index];
            for (var i = index+1; i < array.length; i++) {
                var twoValueSum = initialValue + array[i];
                int numberInArray = getNumberInArray(array, i+1, twoValueSum , targetSum);
                if (numberInArray > -1) {
                    Integer[] sums = new Integer[3];
                    sums[0] = initialValue;
                    sums[1] = array[i];
                    sums[2] = numberInArray;
                    sumList.add(sums);
                }
            }
        }
        return sumList;
    }

    private static int getNumberInArray(int[] array, int index, int value , int targetValue) {
        for (var i = index; i < array.length; i++) {
            if (array[i] + value == targetValue) {
                return array[i];
            }
        }
        return -1;
    }
}
