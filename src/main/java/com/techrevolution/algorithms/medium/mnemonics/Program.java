package com.techrevolution.algorithms.medium.mnemonics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 16/07/22
 * Time: 2:23 AM
 */
public class Program {
    public static void main(String[] args) {
//        System.out.println(new Program().phoneNumberMnemonics("1905"));
        System.out.println(new Program().phoneNumberMnemonics("444"));
//        System.out.println(new Program().phoneNumberMnemonics("002"));
    }

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        return run(phoneNumber);
    }

    private Map<Integer, List<Character>> generateMap() {
        Map<Integer, List<Character>> phoneNumbers = new HashMap<>();
        phoneNumbers.put(2, Arrays.asList('a', 'b', 'c'));
        phoneNumbers.put(3, Arrays.asList('d', 'e', 'f'));
        phoneNumbers.put(4, Arrays.asList('g', 'h', 'i'));
        phoneNumbers.put(5, Arrays.asList('j', 'k', 'l'));
        phoneNumbers.put(6, Arrays.asList('o', 'n', 'm'));
        phoneNumbers.put(7, Arrays.asList('p', 'q', 'r', 's'));
        phoneNumbers.put(8, Arrays.asList('u', 't', 'v'));
        phoneNumbers.put(9, Arrays.asList('y', 'w', 'x', 'z'));
        return phoneNumbers;
    }

    private ArrayList<String> run(String phoneNumber) {
        Map<Integer, List<Character>> map = generateMap();
        ArrayList<String> result = new ArrayList<>();
        boolean anyMatch = map.keySet().stream().anyMatch(integer -> phoneNumber.contains(String.valueOf(integer)));
        if (!anyMatch) {
            result.add(phoneNumber);
            return result;
        }

        ArrayList<String> sublist = new ArrayList<>();
        for (var i = 0; i < phoneNumber.length(); i++) {
            int currentNumber = Integer.parseInt(phoneNumber.substring(i, i + 1));
            List<Character> characters = map.get(currentNumber);
            if (characters != null) {
                if (sublist.isEmpty()) {
                    sublist = generateList(phoneNumber, characters, i);
                } else {
                    result = multiplyList(result.isEmpty()?sublist:result, characters, i);
                }
            }
        }
        return result.isEmpty() ? sublist : result;
    }

    private ArrayList<String> multiplyList(List<String> list, List<Character> characters, int index) {
        ArrayList<String> mainList = new ArrayList<>();
        for (String s : list) {
            for (char c : characters) {
                mainList.add(generateReplacedString(index, s, c));
            }
        }
        return mainList;
    }

    private String generateReplacedString(int index, String s, char c) {
        StringBuilder builder = new StringBuilder(s);
        builder.deleteCharAt(index);
        builder.insert(index, c);
        return builder.toString();
    }

    private ArrayList<String> generateList(String phoneNumber, List<Character> characters, int index) {
        ArrayList<String> list = new ArrayList<>();
        for (char c : characters) {
            list.add(generateReplacedString(index, phoneNumber, c));
        }
        return list;
    }
}
