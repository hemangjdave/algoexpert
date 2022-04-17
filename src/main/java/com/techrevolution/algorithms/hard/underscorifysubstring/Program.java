package com.techrevolution.algorithms.hard.underscorifysubstring;

import lombok.experimental.UtilityClass;

/**
 * Created By Hemang Dave
 * Date: 26/02/22
 * Time: 1:13 PM
 */

@FunctionalInterface
interface TriPredicate<T, U, V> {
    boolean isOverLappedOrSideBySide(T t, U u, V v);
}

@UtilityClass
public class Program {

    private static final TriPredicate<String, String, Integer> triPredicate = (String::startsWith);

    public static String underscorifySubstring(String str, String substring) {
        // Write your code here.
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(appendUnderscore(word, substring)).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    public static String appendUnderscore(String word, String substring) {
        StringBuilder builder = new StringBuilder(word);
        var startIndex = 0;
        var endIndex = 0;
        while (true) {
            if (substring.length() > 1 || endIndex == 0) {
                startIndex = builder.indexOf(substring, endIndex);
            } else {
                startIndex = builder.indexOf(substring, endIndex + 1);
            }
            if (startIndex == -1) {
                return builder.toString();
            }
            endIndex = startIndex + substring.length();
            while (true) {
                if (triPredicate.isOverLappedOrSideBySide(builder.toString(), substring, endIndex)) {
                    endIndex += substring.length();
                } else if (
                        triPredicate.isOverLappedOrSideBySide(builder.toString(), substring, endIndex - 1)
                                && substring.length() > 1
                ) {
                    endIndex += substring.length() - 1;
                } else {
                    break;
                }
            }
            builder.insert(startIndex, "_").insert(endIndex + 1, "_");
        }
    }
}
