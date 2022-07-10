package com.techrevolution.algorithms.medium.nextgreaterelement;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 04/05/22
 * Time: 9:12 PM
 */
public class Program {
    public int[] nextGreaterElement(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return array;
        }
        var cloneArray = array.clone();
        Arrays.sort(array);
        var largestNumber = array[array.length - 1];
        int[] outputArray = new int[array.length];
        var innerIndex = 1;
        for (var i = 0; i < array.length; i++) {
            var isFound = false;
            var currentNumber = cloneArray[i];
            if (i == array.length - 1) {
                innerIndex = 0;
            }
            if (currentNumber == largestNumber) {
                outputArray[i] = -1;
                continue;
            }
            for (var j = innerIndex; j < array.length; j++) {
                if (cloneArray[j] > currentNumber) {
                    outputArray[i] = cloneArray[j];
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                for (var k = 0; k < innerIndex ; k++) {
                    if (cloneArray[k] > currentNumber) {
                        outputArray[i] = cloneArray[k];
                        break;
                    }
                }
            }
            innerIndex++;
        }
        return outputArray;
    }
}
