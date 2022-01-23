package com.techrevolution.algorithms.medium.minnumberchars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created By Hemang Dave
 * Date: 22/01/22
 * Time: 10:17 PM
 */
public class Program {
    public char[] minimumCharactersForWords(String[] words) {
        List<Character> characters = new ArrayList<>();
        final Map<Character, Integer> charactersMap = new HashMap<>();
        for (String str : words) {
            char[] chars = str.toCharArray();
            for (char ch : chars) {
                charactersMap.putIfAbsent(ch, 1);
                if (!characters.contains(ch)) {
                    characters.add(ch);
                } else {
                    long count = IntStream.range(0, chars.length).mapToObj(value -> chars[value]).filter(character -> character == ch).count();
                    int frequency = charactersMap.get(ch);
                    if (count > frequency) {
                        characters.add(ch);
                        charactersMap.computeIfPresent(ch, (character, integer) -> integer + 1);
                    }
                }
            }
        }
        // Write your code here.
        char[] result = new char[characters.size()];
        var index = 0;
        for (var c : characters) {
            result[index++] = c;
        }
        return result;
    }

}
