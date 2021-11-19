package com.techrevolution.algorithms.easy.selctionsort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 19/11/21
 * Time: 5:57 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(Arrays.toString(selectionSort(new int[]{8, 5, 2, 9, 5, 6, 3})));
    }

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        var smallestNumber = array[0];
        var index = 0;
        for (var i = 1; i < array.length; i++) {
            for (var j = index + 1; j <= array.length - 1; j++) {
                if (array[j] < smallestNumber) {
                    smallestNumber = array[j];
                    var temp = array[index];
                    array[index] = smallestNumber;
                    array[j] = temp;
                }
            }
            index++;
            smallestNumber = array[index];
        }
        return array;
    }
}
