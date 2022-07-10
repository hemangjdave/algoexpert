package com.techrevolution.algorithms.medium.longestpalindromicsubstring;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Hemang Dave
 * Date: 18/04/22
 * Time: 12:00 AM
 */
@Slf4j
public class Program {
    private Program(){}
    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        if (str.length() == 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        int count = 1;
        String longestSubString = "";
        var index = 0;
        StringBuilder builder = new StringBuilder(str);
        while (index < chars.length) {
            char c = chars[index];
            var indexOf = str.indexOf(c, count);
            if (indexOf < str.length() - 1 && str.charAt(indexOf + 1) == c) {
                index++;
                count = index + 1;
            } else if (indexOf > -1) {
                String subString;
                if (!builder.isEmpty()) {
                    var startIndex = str.indexOf(c, longestSubString.length());
                    var endIndex = count - 1;
                    subString = str.substring(startIndex, endIndex);
                } else {
                    subString = str.substring(index, indexOf + 1);
                }
                if (isStringPalindrom(subString)) {
                    if (subString.length() > longestSubString.length()) {
                        longestSubString = subString;
                    }
                    count = indexOf + 2;
                    index = indexOf + 1;
                } else {
                    index++;
                    count = index + 1;
                }
            }
        }
        return longestSubString;
    }

    private static boolean isStringPalindrom(String string) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            char firstChar = string.charAt(i);
            char secondChar = string.charAt(j);
            if (firstChar != secondChar) {
                return false;
            }
        }
        return true;
    }
}
