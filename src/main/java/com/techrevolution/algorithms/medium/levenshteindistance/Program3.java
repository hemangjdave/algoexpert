package com.techrevolution.algorithms.medium.levenshteindistance;

/**
 * Created by Hemang Dave.
 * Date: 02/01/22
 * Time: 5:57 PM
 */
public class Program3 {
    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        if (str1.isEmpty()) {
            return str2.length();
        }
        StringBuilder builder = new StringBuilder(str1);
        char[] str2chars = str2.toCharArray();
        var efforts = 0;
        for (var i = 0; i < str2chars.length; i++) {
            if (i > str1.length()) {
                efforts++;
                return efforts;
            }
            char str1char = builder.charAt(i);
            char str2char = str2chars[i];
            var isStr1big = str1.length() > str2.length();
            if (str1char != str2char) {
                var indexofstr2char = str1.indexOf(str2char, i);
                if (indexofstr2char == -1) {
                    if (str1.length() < str2.length()) {
                        builder.insert(i, str2char);
                        str1 = builder.toString();
                        efforts++;
                    } else if (isStr1big) {
                        builder.deleteCharAt(i);
                        str1 = builder.toString();
                        efforts++;
                    } else {
                        str1 = str1.replaceFirst(str1char + "", str2char + "");
                        efforts++;
                    }
                } else {
                    if (isStr1big) {
                        var charAt = str1.charAt(indexofstr2char);
                        builder.deleteCharAt(i);
                        efforts++;
                        builder.insert(i, charAt);
                        efforts++;
                        str1 = builder.toString();
                    } else if (str1.length() < str2.length()) {
                        builder.deleteCharAt(indexofstr2char);
                        efforts++;
                        builder.insert(i, str2char);
                        efforts++;
                        str1 = builder.toString();
                    } else {
                        var charAt = str1.charAt(indexofstr2char);
                        var charAtForFirstString = str1.charAt(i);
                        str1 = str1.replaceFirst("" + charAtForFirstString, "" + charAt);
                        efforts++;
                        str1 = str1.replaceFirst("" + charAt, "" + str1char);
                        efforts++;
                    }
                }
            }
        }
        if (str1.length() > str2.length()) {
            efforts++;
        }
        return efforts;
    }
}
