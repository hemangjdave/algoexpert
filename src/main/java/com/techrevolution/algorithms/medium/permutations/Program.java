package com.techrevolution.algorithms.medium.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 13/06/22
 * Time: 4:38 PM
 */
public class Program {

    public static void main(String[] args) {
//        getPermutations(Arrays.asList(1, 2));
//        getPermutations(Arrays.asList(1, 2 , 3));
        getPermutations(Arrays.asList(1, 2, 3, 4));
    }

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        if (array.isEmpty()) {
            return Collections.emptyList();
        }
        List<List<Integer>> returnList = new ArrayList<>();
        // Adding the first array element
        returnList.add(new ArrayList<>(array));
        int inputLength = array.size();
        int permutationNumber = (inputLength * inputLength) - inputLength;
        inputLength--;
        int swapIndex = inputLength - 1;
        for (var i = 0; i < 24; i++) {
            returnList.add(swapElement(inputLength--, swapIndex--, array));
            if (swapIndex == -1) {
                inputLength = array.size() - 1;
                swapIndex = 1;
            }
        }
        System.out.println(returnList);
        return returnList;
    }

    private static List<Integer> swapElement(int currentPosition, int swapPosition, List<Integer> list) {
        int currentValue = list.get(currentPosition);
        int swapValue = list.get(swapPosition);
        list.set(swapPosition, currentValue);
        list.set(currentPosition, swapValue);
        return new ArrayList<>(list);
    }

}
