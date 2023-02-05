package com.techrevolution.algorithms.medium.matchingbrackets;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 08/08/22
 * Time: 1:32 pm
 */
@Slf4j
public class Program {

    private static final Map<String, String> patternMap = new HashMap<>();

    static {
        patternMap.put("(", ")");
        patternMap.put("[", "]");
        patternMap.put("{", "}");
    }

    public static void main(String[] args) {
//        String input = "([])(){}(())()()";
//        String input = "([)])(){}(())()()";
        String input = "([([([{}])])])";
        log.info(balancedBrackets(input) + "");
    }

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        if (str.isEmpty() || str.length() == 2) {
            return true;
        }
        final int endIndex = getIndex(str, patternMap.get(String.valueOf(str.charAt(0))));
        if (endIndex == -1) return false;
        String subString = str.substring(0, endIndex + 1);
        System.out.println("subString is:--" + subString);
        System.out.println("remaining String is:--" + str.substring(endIndex + 1));
        balancedBrackets(str.substring(endIndex + 1));
        return false;
    }

    // ([)])(){}(())()()
    // ([([([{}])])])
    private static int getIndex(String string, String character) {
        if (null == character) {
            return -1;
        }
        var indexOf = string.indexOf(character);
        if (character.equals(String.valueOf(string.charAt(indexOf + 1)))) {
            indexOf = string.indexOf(character, indexOf + 1);
        }
        if (indexOf == 1 && !character.equals(String.valueOf(string.charAt(0)))) {
            return -1;
        }
        return indexOf;
    }
}
