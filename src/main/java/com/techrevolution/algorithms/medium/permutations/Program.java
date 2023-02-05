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
        System.out.println(getPermutations(Arrays.asList(1, 2)));
    }

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        if (array.isEmpty()) {
            return Collections.emptyList();
        }
        if (array.size() == 1) {
            return Collections.singletonList(array);
        }
        List<List<Integer>> returnList = new ArrayList<>();
        swapElements(array, 0, returnList, 0);
        return returnList;
    }

    //1 2 3 , 1 3 2
    // 0 0 , 1 2
    //2 1 3 , 2 3 1
    // 0 1 , 1 2
    //3 2 1 , 3 1 2
    //0 2 , 1 2
    private static void swapElements(List<Integer> array, int index, List<List<Integer>> returnList, int count) {
        if (count > array.size() - 1) {
            return;
        }
        if (index == 0 && count == 0) {
            returnList.add(new ArrayList<>(array));
            swapElements(array, index, returnList, ++ count);
            Collections.swap(array, ++ index, index + 1);
            returnList.add(array);
        } else {
            List<Integer> swappedList = new ArrayList<>(array);
            Collections.swap(swappedList, index, count);
            returnList.add(swappedList);
            swapElements(array, index, returnList, ++ count);
            swapElements(swappedList, ++ index, returnList, index + 1);
        }
    }

}
