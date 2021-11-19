package com.techrevolution.algorithms.easy.bubblesort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 19/11/21
 * Time: 12:13 AM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(Arrays.toString(bubbleSort(new int[]{8, 5, 2, 9, 5, 6, 3})));
    }

    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        var loopIndex = array.length;
        var loopCounter = 0;
        for (var i = 0; i < loopIndex; i++) {
            for (var j = 0; j < loopIndex - 1; j++) {
                loopCounter++;
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        log.info("loop counter :--{}" , loopCounter);
        return array;
    }
}
