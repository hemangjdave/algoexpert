package com.techrevolution.algorithms.medium.samebst;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created By Hemang Dave
 * Date: 28/07/22
 * Time: 12:50 am
 */
@Slf4j
public class Program {
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        // Write your code here.
        if (arrayOne.size() != arrayTwo.size()) {
            return false;
        }
        if (! arrayOne.isEmpty() && ! Objects.equals(arrayOne.get(0), arrayTwo.get(0))) {
            return false;
        }
        for (Integer integer : arrayOne) {
            boolean isRemoved = arrayTwo.remove(integer);
            if (! isRemoved) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> arrayOne = new ArrayList<>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11));
        List<Integer> arrayTwo = new ArrayList<>(Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81));
        boolean sameBsts = sameBsts(arrayOne, arrayTwo);
        if (sameBsts) log.info("Both trees are same.");
        else log.info("Both trees are not same.");
    }
}
