package com.techrevolution.algorithms.medium.sortedmatrixsearch;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 11/08/22
 * Time: 1:22 am
 */
public class Program {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004},
        };
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 44)));
    }

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        // Write your code here.
        int[] indexes = new int[2];
        indexes[0] = - 1;
        indexes[1] = - 1;
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                int a = matrix[i][j];
                if (a == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;
    }
}
