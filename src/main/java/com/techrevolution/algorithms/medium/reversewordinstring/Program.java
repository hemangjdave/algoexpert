package com.techrevolution.algorithms.medium.reversewordinstring;

/**
 * Created By Hemang Dave
 * Date: 22/01/22
 * Time: 11:34 PM
 */
public class Program {
    public String reverseWordsInString(String string) {
        // Write your code here.
        char[] chars = string.toCharArray();
        StringBuilder characterBuilder = new StringBuilder();
        StringBuilder finalString = new StringBuilder();
        for (var i = chars.length - 1; i > 0; i--) {
            if (chars[i] == ' ') {
                finalString.append(chars[i]);
            } else {
                characterBuilder.append(chars[i]);
            }
        }
        return finalString.toString();
    }
}



    /*String[] words = string.split(" ");
    StringBuilder builder = new StringBuilder();
        for (var i = words.length; i > 0; i--) {
                builder.append(words[i - 1]);
                if (i > 1) {
                builder.append(" ");
                }
                }
                return builder.toString();*/
