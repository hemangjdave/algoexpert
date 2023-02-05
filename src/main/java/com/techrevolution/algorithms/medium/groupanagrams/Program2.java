package com.techrevolution.algorithms.medium.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 08/07/22
 * Time: 10:15 PM
 */
public class Program2 {
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        List<String> sortedList = new ArrayList<>();

        words.forEach(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            sortedList.add(new String(chars));
        });
        Map<String, List<String>> map = new HashMap<>();
        for (var i = 0; i < sortedList.size(); i++) {
            String currentSortedString = sortedList.get(i);
            List<String> stringList = map.get(currentSortedString);
            if (stringList == null) {
                map.put(currentSortedString, new ArrayList<>(Collections.singletonList(words.get(i))));
            } else {
                stringList.add(words.get(i));
            }
        }
        List<List<String>> returnList = new ArrayList<>();
        map.forEach((key, value) -> returnList.add(value));
        return returnList;
    }
}
