package com.techrevolution.algorithms.medium.minswap;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created By Hemang Dave
 * Date: 26/08/22
 * Time: 5:46 pm
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        log.info(String.valueOf(minSwap("101010101")));
        log.info(String.valueOf(minSwap("101100101")));
        log.info(String.valueOf(minSwap("10101010101210101010101")));
        log.info(String.valueOf(minSwap("10101010011210101011001")));

    }

    public static int minSwap(String input) {
        List<Character> characters = new ArrayList<>(input.chars().mapToObj(value -> (char) value).toList());
        if (isPalindrome(characters)) {
            return 0;
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        characters.forEach(character -> frequencyMap.merge(character, 1, Integer::sum));
        long count = frequencyMap.values().stream().filter(value -> value % 2 != 0).count();
        if (count > 1) {
            return - 1;
        }
        var left = 0;
        var right = characters.size() - 1;
        var result = 0;
        while (left < right) {
            var l = left;
            var r = right;
            while (! Objects.equals(characters.get(l), characters.get(r))) {
                r -= 1;
            }
            if (l == r) {
                Collections.swap(characters, r, r + 1);
                result++;
                continue;
            } else {
                while (r < right) {
                    Collections.swap(characters, r, r + 1);
                    r += 1;
                    result += 1;
                }
            }
            left += 1;
            right -= 1;
        }
        return result;
    }

    private static boolean isPalindrome(List<Character> list) {
        if (list.isEmpty() || list.size() == 1) {
            return true;
        }
        char first = list.get(0);
        char last = list.get(list.size() - 1);
        if (first != last) {
            return false;
        }
        return isPalindrome(list.subList(1, list.size() - 1));
    }
}