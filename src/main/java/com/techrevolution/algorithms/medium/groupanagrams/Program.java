package com.techrevolution.algorithms.medium.groupanagrams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 16/04/22
 * Time: 9:35 PM
 */
@Slf4j
public class Program {

    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        List<List<String>> anagramList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (var i = 0; i < words.size(); ) {
            String word = words.get(i);
            list.add(word);
            for (var j = i + 1; j < words.size(); j++) {
                String secondWord = words.get(j);
                if (word.length() == secondWord.length() && isStringEquals(word, secondWord)) {
                    list.add(secondWord);
                }
            }
            list.forEach(words::remove);
            anagramList.add(list);
            list = new ArrayList<>();
        }
        log.info(anagramList.toString());
        return anagramList;
    }

    private static boolean isStringEquals(String str1, String str2) {
        int count = 0;
        while (true) {
            char[] chars = str1.toCharArray();
            char c = chars[count];
            int indexOf = str2.indexOf(c);
            if (indexOf == -1) {
                return false;
            }
            str2 = str2.replaceFirst(str2.charAt(indexOf) + "", " ");
            str1 = str1.replaceFirst(str1.charAt(count) + "", " ");
            count++;
            if (count == str1.length()) {
                return true;
            }
        }
    }
}
