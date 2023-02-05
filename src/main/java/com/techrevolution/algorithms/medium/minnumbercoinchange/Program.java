package com.techrevolution.algorithms.medium.minnumbercoinchange;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By Hemang Dave
 * Date: 12/08/22
 * Time: 5:49 pm
 */
@Slf4j
public class Program {

    public static void main(String[] args) {
//        log.info(String.valueOf(minNumberOfCoinsForChange(25, new int[]{1, 2, 11})));
//        log.info(String.valueOf(minNumberOfCoinsForChange(25, new int[]{4, 5, 11})));
//        log.info(String.valueOf(minNumberOfCoinsForChange(24, new int[]{1, 5, 10})));
//        log.info(String.valueOf(minNumberOfCoinsForChange(7, new int[]{1, 5, 10})));
//        log.info(String.valueOf(minNumberOfCoinsForChange(10, new int[]{1, 5, 10})));
        log.info(String.valueOf(minNumberOfCoinsForChange(24, new int[]{1, 5, 10})));
//        log.info(String.valueOf(minNumberOfCoinsForChange(135, new int[]{39, 45, 130, 40, 4, 1, 60, 75})));
    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        // Write your code here.
        int minNumberOfCoins = Integer.MAX_VALUE;
        final Set<Integer> set = new HashSet<>();
        Arrays.stream(denoms).forEach(set::add);
        var tempReminder = 0;
        for (var i = denoms.length - 1; i >= 0; i--) {
            var quotient = getQuotient(n, denoms[i]);
            var reminder = getReminder(n, denoms[i]);
            if (reminder != n && tempReminder == 0) {
                tempReminder = reminder;
            }

            if (checkAndGetDifferenceInSet(n, denoms[i], set) == 2) {
                return 2;
            }
            final int reminderInSet = checkReminderInSet(n, denoms[i], set);
            if (reminderInSet > -1 && reminderInSet < minNumberOfCoins) {
                minNumberOfCoins = reminderInSet;
            }
            if (reminder == 0 && quotient < minNumberOfCoins) {
                minNumberOfCoins = quotient;
                if (minNumberOfCoins == 1) {
                    return minNumberOfCoins;
                }
            }
            if (set.contains(tempReminder - denoms[i]) && minNumberOfCoins > 3) {
                minNumberOfCoins = 3;
            }
            if (tempReminder % denoms[i] == 0) {
                minNumberOfCoins = Math.min(minNumberOfCoins, tempReminder + quotient);
            }
        }

        return minNumberOfCoins;
    }

    private static int checkAndGetDifferenceInSet(int n, int denom, Set<Integer> set) {
        if (set.contains(n - denom)) {
            return 2;
        }
        return -1;
    }

    private static int getQuotient(int n, int denom) {
        return n / denom;
    }

    private static int getReminder(int n, int denom) {
        return n % denom;
    }

    private static int checkReminderInSet(int n, int denom, Set<Integer> set) {
        final int reminder = getReminder(n, denom);
        if (set.contains(reminder)) {
            return getQuotient(n, denom) + 1;
        }
        return -1;
    }

}
