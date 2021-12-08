package com.techrevolution.algorithms.medium.longestpeak;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 05/12/21
 * Time: 7:47 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3})));
        log.info(String.valueOf(longestPeak(new int[]{1 , 2 , 3 , 3 , 2 , 1})));

        log.info(String.valueOf(longestPeak(new int[]{1, 2, 3, 2, 3, 2})));
        log.info(String.valueOf(longestPeak(new int[]{1, 2, 3, 2, 1, 0})));
    }

    public static int longestPeak(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return 0;
        }
        List<Integer> numbers = new ArrayList<>();
        List<Integer> sumOfNumbers = new ArrayList<>();
        boolean decreasing = false;
        boolean hasIncreasNumber = false;
        var index = 0;
        while (true) {
            if (index == array.length - 1) {
                break;
            }
            if (array[index] < array[index + 1]) {
                hasIncreasNumber = true;
                break;
            }
            index++;
        }
        for (var i = index; i < array.length ; i++) {
            if (i == array.length - 1) {
                if (decreasing && array[i] < array[i - 1]) {
                    numbers.add(array[i]);
                    if (sumOfNumbers.size() > 0)
                        sumOfNumbers.add(numbers.size());
                }
            }
            else if (array[i] < array[i + 1]) {
                numbers.add(array[i]);
                if (decreasing) {
                    if (hasIncreasNumber)
                        sumOfNumbers.add(numbers.size());
                    numbers.clear();
                    numbers.add(array[i]);
                    decreasing = false;
                }
            } else if (array[i] == array[i + 1]) {
                if (!numbers.isEmpty() && numbers.size() < 4) {
                    numbers.clear();
                } else {
                    numbers.add(array[i]);
                    sumOfNumbers.add(numbers.size());
                    numbers.clear();
                }
            } else {
                numbers.add(array[i]);
                decreasing = true;
            }
        }
        log.info(sumOfNumbers.toString());
        if (sumOfNumbers.isEmpty()) {
            return 0;
        } else if (sumOfNumbers.size() == 1) {
            return sumOfNumbers.get(0);
        } else {
            sumOfNumbers.sort(Comparator.reverseOrder());
            return sumOfNumbers.get(0);
        }
    }
}
