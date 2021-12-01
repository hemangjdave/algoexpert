package com.techrevolution.algorithms.easy.runlenghtencoding;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Hemang Dave
 * Date: 01/12/21
 * Time: 5:26 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(new Solution1().runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
        log.info(new Solution1().runLengthEncoding("aA"));
        log.info(new Solution1().runLengthEncoding("************^^^^^^^$$$$$$%%%%%%%!!!!!!AAAAAAAAAAAAAAAAAAAA"));
    }

    // AAAAAAAAAAAAABBCCCCDD
    public String runLengthEncoding(String string) {
        // Write your code here.
        if (string.isEmpty()) {
            return string;
        }
        char defaultChar = string.charAt(0);
        String encodedString = "";
        var str = string;
        var charIndex = 0;
        while (!str.isEmpty()) {
            var charFrequency = getCharFrequency(str, defaultChar);
            encodedString = generateEncodedRecursiveString(encodedString, charFrequency, defaultChar);
            charIndex += charFrequency;
            if (charIndex < string.length()) {
                defaultChar = string.charAt(charIndex);
            }
            str = str.substring(charFrequency);
        }
        return encodedString;
    }

    private String generateEncodedRecursiveString(String encodedString , int charFrequency , char defaultChar) {
        if (charFrequency > 9) {
            int f = charFrequency - 9;
            encodedString = encodedString.concat(String.valueOf(9) + defaultChar);
            if (f > 9) {
                encodedString = encodedString.concat(String.valueOf(9) + defaultChar);
                encodedString = generateEncodedRecursiveString(encodedString, f -  9, defaultChar);
            }else {
                encodedString = encodedString.concat(String.valueOf(f) + defaultChar );
            }
        } else {
            encodedString = encodedString.concat(String.valueOf(charFrequency)+defaultChar);
        }
        return encodedString;
    }

    // AAAAB , A
    private int getCharFrequency(String string, char ch) {
        var defaultFrequency = 0;
        for (var i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ch) {
                return i;
            } else {
                defaultFrequency++;
            }
        }
        return defaultFrequency;
    }
}
