package com.techrevolution.algorithms.hard.patternmatcher;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 08/02/22
 * Time: 12:44 PM
 */
@Slf4j
public class Program {

    public static String[] patternMatcher(String pattern, String str) {
        // Write your code here.
        List<String> list = new ArrayList<>();
        StringBuilder supporter = new StringBuilder();
        var startIndex = 0;
        var endIndex = 1;
        while (str.length() > 0) {
            if (startIndex >= str.length() || endIndex > str.length()) {
                break;
            }
            String substring1 = str.substring(startIndex, endIndex);
            String substring2 = supporter.length() == 0 ? str.substring(endIndex, endIndex + 1) : supporter.toString();

            if (!substring1.equals(substring2)) {
                if (substring1.length() == 1 && substring2.length() == 1)
                    supporter.append(substring1).append(substring2.charAt(0));
                else
                    supporter.append(substring1.charAt(0));

                if (supporter.toString().length() * 2 <= str.length()) {
                    if (str.substring(supporter.length(), supporter.length() * 2).equals(supporter.toString())) {
                        list.add(supporter.toString());
                        str = str.replace(supporter.toString(), "");
                        supporter = new StringBuilder();
                        startIndex = 0;
                        endIndex = 1;
                    } else {
                        startIndex = supporter.length();
                        endIndex = startIndex + supporter.length();
                    }
                }
            }
        }
        log.info(list.toString());
        return  list.toArray(list.toArray(new String[0]));
    }

    private static List<String> processEqualPattern(String pattern, String str){
        List<String> list = new ArrayList<>();
        String subString1 = pattern.substring(0, 1);
        String subString2 = pattern.substring(1, 2);
        String subPattern1 = pattern.substring(0, 1);
        String subPattern2 = pattern.substring(1, 2);
        String finalString = null;
        return list;
    }

}
