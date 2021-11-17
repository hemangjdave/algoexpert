package com.techrevolution.algorithms.easy.fibonacci;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 16/11/21
 * Time: 1:25 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(getNthFib(5)));
        log.info(String.valueOf(getNthFib(6)));
        log.info(String.valueOf(getNthFib(8)));
        log.info(String.valueOf(getNthFib(2)));
    }

    // n = 2 --> 0 , 1 --> 1
    // n = 6 --> 0 , 1 , 1 , 2 , 3 , 5 --> 5
    // n = 6 --> 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21--> 5
    private static int getNthFib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        List<Integer> list = new ArrayList<>(n);
        var firstIndex = 0;
        var secondIndex = 1;
        list.add(firstIndex);
        list.add(secondIndex);
        var sum = 0;
        for (var i = 2; i < n; i++) {
            sum = list.get(firstIndex) + list.get(secondIndex);
            list.add(sum);
            firstIndex++;
            secondIndex++;
        }
        return sum;
    }
}
