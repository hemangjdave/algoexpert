package com.techrevolution.algorithms.easy.validatesubsequence;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class ValidateSubSequenceArray {
    public static void main(String[] args) {
        List<Integer> mainList = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(28, 1, 6, -1, 10);
        log.info("" + isValidSubsequence(mainList, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() > array.size()) {
            return false;
        }
        // Write your code here.
        for (Integer number : sequence) {
            var index = array.indexOf(number);
            if (index == -1) return false;
            array = array.subList(index + 1, array.size());
        }
        return true;
    }
}
