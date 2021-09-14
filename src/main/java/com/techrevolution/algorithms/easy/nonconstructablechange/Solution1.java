package com.techrevolution.algorithms.easy.nonconstructablechange;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{5, 7, 1, 1, 2, 3, 22})));
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{1, 2, 5})));
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{1, 1, 1, 1, 1})));
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{6, 4, 5, 1, 1, 8, 9})));
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{1})));
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{2})));
        log.info(String.valueOf(new Solution1().nonConstructableChange(new int[]{109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4})));
    }

    public int nonConstructableChange(int[] coins) {
        // Write your code here.
        // [1,2,5]
        // [1,2,4]
        // [1 , 1 , 2 , 3 , 5 , 7 , 22]
        // [1 , 1 , 1 , 1 , 1]
        // [2 , 5]
        Arrays.sort(coins);
        var sumOfCoins = 0;
        var previousCoinTotal = 0;
        var minimumNonConstructableCoin = 0;
        for (var coin : coins) {
            if (coin > previousCoinTotal + 1 || (coins.length == 1 && coins[0] != 1)) {
                return minimumNonConstructableCoin + 1;
            }
            previousCoinTotal = sumOfCoins + coin;
            minimumNonConstructableCoin = previousCoinTotal;
            sumOfCoins += coin;
        }
        return sumOfCoins + 1;
    }
}
