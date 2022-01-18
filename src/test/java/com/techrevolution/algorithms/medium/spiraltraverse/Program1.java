package com.techrevolution.algorithms.medium.spiraltraverse;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 04/01/22
 * Time: 4:00 PM
 */
@Slf4j
public class Program1 {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> integerList = new ArrayList<>();
        var maxWidth = array[0].length;
        var minWidth = 0;
        var maxHeight = array.length;
        var minHeight = 0;
        var initialHeight = 0;
        var initialWidth = 0;
        var successCount = 0;
        var maxCount = array.length * array[0].length;
        while (successCount < maxCount) {
            while (initialWidth < maxWidth) {
                integerList.add(array[initialHeight][initialWidth++]);
                successCount++;
            }
            maxWidth--;
            while (initialHeight < maxHeight - 1 && successCount < maxCount) {
                integerList.add(array[++initialHeight][initialWidth - 1]);
                successCount++;
            }
            maxHeight--;
            initialWidth--;
            while (initialWidth > minWidth && successCount < maxCount) {
                integerList.add(array[initialHeight][--initialWidth]);
                successCount++;
            }
            minWidth++;
            initialHeight--;
            while (initialHeight > minHeight && successCount < maxCount) {
                integerList.add(array[initialHeight--][initialWidth]);
                successCount++;
            }
            minHeight++;
            initialWidth++;
            initialHeight++;
            if (maxCount % 2 == 0)
                successCount++;
        }
        return integerList;
    }
}


// Solution 1
/*
List<Integer> integerList = new ArrayList<>();
    var maxCount = array.length * array[0].length;
    var traverseCount = 0;
    var initialHeight = 0;
    var initialWidth = 0;
    var maxWidth = array[0].length;
    var maxHeight = array.length;
        while (traverseCount < maxCount) {
        for (var i = initialHeight; i < maxHeight; i++) {
        for (var j = initialWidth; j < maxWidth; j++) {
        integerList.add(array[Math.abs(i)][Math.abs(j)]);
        traverseCount++;
        initialWidth++;
        }
        }
        initialHeight++;
        initialWidth--;
        traverseCount++;
        }
        return integerList;*/
