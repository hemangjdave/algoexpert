package com.techrevolution.algorithms.hard.patternmatcher;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 09/02/22
 * Time: 7:11 PM
 */
@Slf4j
public class Program2 {

    public static void main(String[] args) {
        log.info(String.valueOf(wordFrequencyInString("gogogobabitago", "go")));
        String inputPattern = "xxyxxy";
        String inputString = "gogopowerrangergogopowerranger";
        Arrays.stream(patternMatcher(inputPattern, inputString)).forEach(log::info);
    }

    public static String[] patternMatcher(String pattern, String str) {

        var numOfx = wordFrequencyInString(pattern, "x");
        var numOfy = wordFrequencyInString(pattern, "y");
        var searchNumber = numOfx > numOfy ? numOfx : numOfy;
        List<String> list = new ArrayList<>();
        if (pattern.length() == str.length()) {

        }

        return new String[]{};
    }

    private static int wordFrequencyInString(String mainString, String srchString) {
        var count = 0;
        var stringLength = mainString.length();
        var index = 0;
        while (index < stringLength) {
            var subIndex = mainString.indexOf(srchString , index);
            if (subIndex == -1) {
                return count;
            } else {
                count++;
                index = subIndex+1;
            }
        }

        return count;
    }

}
