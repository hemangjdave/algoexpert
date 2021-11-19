package com.techrevolution.algorithms.easy.insertionsort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 19/11/21
 * Time: 5:42 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(Arrays.toString(insertionSort(new int[]{8, 5, 2, 9, 5, 6, 3})));
    }

    public static int[] insertionSort(int[] array) {
        // Write your code here.
        for (var i = 0; i < array.length - 1; i++) {
            for (var j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    var temp = array[j - 1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
