package com.techrevolution.algorithms.medium.staircasetraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created By Hemang Dave
 * Date: 16/07/22
 * Time: 8:45 PM
 */
public class Program {
    public static void main(String[] args) {
        int stairs = 4;
        int maxSteps = 2;
        System.out.println(new Program().staircaseTraversal(stairs, maxSteps)); // 5
    }

    public int staircaseTraversal(int height, int maxSteps) {
        // Write your code here.
        List<Integer> heightList = new ArrayList<Integer>();
        IntStream.rangeClosed(1, height).forEach(value -> heightList.add(1));
        System.out.println(heightList);
        return - 1;
    }

    // 1 1 1 1
    // 1 1 2
    // 1 3 -> terminate
    // go to main list
    // 1 2 1
    // 1 3 -> terminate
    // 2 1 1
    // 2 2



}
