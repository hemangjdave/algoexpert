package com.techrevolution.algorithms.easy.sortedsquarearray;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.IntStream;

@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9};
        log.info(Arrays.toString(sortedSquaredArray(array)));
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        array = IntStream.of(array).map(value -> value * value).toArray();
        Arrays.sort(array);
        return array;
    }
}
