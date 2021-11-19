package com.techrevolution.algorithms.easy.palindrome;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Hemang Dave
 * Date: 19/11/21
 * Time: 11:38 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(isPalindrome("abcdcba")));
        log.info(String.valueOf(isPalindrome("abca")));
        log.info(String.valueOf(isPalindrome("abba")));
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        var stringLength = str.length();
        for (int i = 0, j = stringLength - 1; i < stringLength / 2 && j >= stringLength / 2; i++, j--) {
            if (i < j && str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
