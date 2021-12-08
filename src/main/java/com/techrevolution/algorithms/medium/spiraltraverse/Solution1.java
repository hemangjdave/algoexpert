package com.techrevolution.algorithms.medium.spiraltraverse;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 02/12/21
 * Time: 7:29 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        var input = new int[][]{
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6}

                };
        log.info(spiralTraverse(input).toString());
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        var rowIndex = 0;
        var colIndex = 0;
        var rowLength = array.length;
        var colLength = array[0].length;
        log.info("rowLength is :-- {}" , rowLength);
        log.info("colLength is :-- {}" , colLength);
        List<Integer> integers = new ArrayList<>();
        for (var i = rowIndex; i < rowLength; i++) {
            for (var j = colIndex; j < colLength; j++) {
                integers.add(array[i][j]);
            }
        }
        return integers;
    }
}