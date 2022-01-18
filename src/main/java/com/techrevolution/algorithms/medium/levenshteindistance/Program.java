package com.techrevolution.algorithms.medium.levenshteindistance;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Hemang Dave.
 * Date: 29/12/21
 * Time: 2:54 PM
 */
@Slf4j
public class Program {

    private Program() {
    }

    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        var efforts = 0;
        if (str1.isEmpty()) {
            return str2.length();
        }
        char[] str2Chars = str2.toCharArray();
        StringBuilder builder = new StringBuilder(str1);
        for (var i = 0; i < str2Chars.length; i++) {
            if (i > str1.length() - 1) {
                builder.insert(i, str2Chars[i]);
                str1 = builder.toString();
                efforts++;
            } else if (str2Chars[i] != str1.charAt(i)) {
                if (str1.charAt(i) == str2Chars[str2Chars.length - 1]) {
                    builder.deleteCharAt(i);
                    str1 = builder.toString();
                    efforts++;
                } else {
                    var index = str1.indexOf(str2Chars[i], i);
                    if (index == -1) {
                        if (str1.length() < str2.length()) {
                            builder.insert(i, str2Chars[i]);
                            str1 = builder.toString();
                        } else {
                            str1 = str1.replaceFirst(str1.charAt(i) + "", str2Chars[i] + "");
                        }
                        efforts++;
                    } else {
                        str1 = str1.replaceFirst(str1.charAt(i) + "", str2Chars[i] + "");
                        efforts++;
                    }
                }
            }
        }
        log.info(str1);
        return str1.length() > str2.length() ? ++efforts : efforts;
    }
}
