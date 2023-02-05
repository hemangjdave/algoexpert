package com.techrevolution.algorithms.medium.threenumbersort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 11/08/22
 * Time: 12:12 am
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        var array = new int[]{1, 0, 0, - 1, - 1, 0, 1, 1};
        var order = new int[]{1, 0, - 1};
        var actual = new Program().threeNumberSort(array, order);
        log.info(Arrays.toString(actual));
    }

    public int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.
        int[] finalArray = new int[array.length];
        var innerIndex = 0;
        for (int k : order) {
            for (int i : array) {
                if (k == i) {
                    finalArray[innerIndex++] = i;
                }
            }
        }
        return finalArray;
    }
}
