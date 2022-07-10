package com.techrevolution.algorithms.medium.reversewordinstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 22/01/22
 * Time: 11:34 PM
 */
public class Program {
    public String reverseWordsInString(String string) {
        // Write your code here.
        String[] array = splitWith(string);
        String[] clonedArray = new String[array.length];
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            clonedArray[i] = array[j];
        }
        StringBuilder builder = new StringBuilder();
        Arrays.stream(clonedArray).forEach(builder::append);
        return builder.toString();
    }

    private String[] splitWith(String string) {
        List<String> list = new ArrayList<>();
        char[] chars = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        var pointer = 0;
        boolean shouldAddLastValue = false;
        while (pointer < chars.length) {
            if (!String.valueOf(chars[pointer]).equals(" ")) {
                builder.append(chars[pointer++]);
                shouldAddLastValue = true;
            } else {
                list.add(builder.toString());
                builder = new StringBuilder();
                while (pointer < chars.length && chars[pointer] == ' ') {
                    builder.append(chars[pointer]);
                    pointer++;
                }
                list.add(builder.toString());
                if (pointer < chars.length) {
                    builder = new StringBuilder();
                }
                shouldAddLastValue = false;
            }
        }
        if (shouldAddLastValue)
            list.add(builder.toString());
        return list.toArray(new String[0]);
    }
}
