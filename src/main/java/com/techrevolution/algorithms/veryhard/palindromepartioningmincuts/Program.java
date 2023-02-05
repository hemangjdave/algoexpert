package com.techrevolution.algorithms.veryhard.palindromepartioningmincuts;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 22/08/22
 * Time: 3:23 pm
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        String input = "noonabbad";
        log.info(String.valueOf(palindromePartitioningMinCuts(input)));
        List<Character> integers = new java.util.ArrayList<>(Arrays.stream(input.chars().toArray()).mapToObj(value -> (char) value).toList());
        System.out.println(integers);
        Collections.rotate(integers, 1);
        System.out.println(integers);
        int c = 'a';
        System.out.println((char) c);
    }

    public static int palindromePartitioningMinCuts(String str) {
        // Write your code here.
        if (str.length() == 1) {
            return 0;
        }
        int checkCount = checkCount(str, 0, 2);
        return checkCount == 0 ? 1 : checkCount;
    }

    private static int checkCount(String str, int startIdx, int endIdx) {
        var count = 0;
        while (endIdx < str.length()) {
            String subString = str.substring(startIdx, endIdx);
            if (isPalindrome(subString)) {
                count++;
                startIdx = endIdx;
                endIdx = endIdx + 2;
            } else {
                endIdx++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar != lastChar) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
