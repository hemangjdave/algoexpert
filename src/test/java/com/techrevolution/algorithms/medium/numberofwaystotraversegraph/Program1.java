package com.techrevolution.algorithms.medium.numberofwaystotraversegraph;

/**
 * Created by Hemang Dave.
 * Date: 04/01/22
 * Time: 1:06 PM
 */
public class Program1 {
    public int numberOfWaysToTraverseGraph(int width, int height) {
        // Write your code here.
        int[][] graph = new int[width][height];
        return (width * height) - 2;
    }
}
