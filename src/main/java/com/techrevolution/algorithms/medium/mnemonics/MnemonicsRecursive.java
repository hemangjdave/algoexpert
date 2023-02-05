package com.techrevolution.algorithms.medium.mnemonics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 16/07/22
 * Time: 2:27 PM
 */
public class MnemonicsRecursive {

    private Map<Integer, List<Character>> map;

    public MnemonicsRecursive() {
        this.map = generateMap();
    }

    public static void main(String[] args) {
        System.out.println(new MnemonicsRecursive().phoneNumberMnemonics("1905"));
    }

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        return run(phoneNumber);
    }

    private ArrayList<String> run(String phoneNumber) {
        boolean anyMatch = map.keySet().stream().anyMatch(integer -> phoneNumber.contains(String.valueOf(integer)));
        if (!anyMatch) {
            return new ArrayList<>(Collections.singletonList(phoneNumber));
        }
        ArrayList<String> result = new ArrayList<>();
        for (var i = 0; i < phoneNumber.length(); i++) {
            String currentString = String.valueOf(phoneNumber.charAt(i));
            int currentDigit = Integer.parseInt(currentString);
            result = generateString(currentDigit, phoneNumber, i);
        }
        return result;
    }

    private ArrayList<String> generateString(int key, String phoneNumber, int index) {
        List<Character> characters = map.get(key);
        ArrayList<String> list = new ArrayList<>();
        if (characters != null) {
            if (list.isEmpty()) {
                list.add(replaceString(characters, index, phoneNumber, 0));
                return list;
            } else {
                return multiplyList(list, key, index);
            }
        }
        return list;
    }

    private ArrayList<String> multiplyList(List<String> list, int key, int index) {
        List<Character> characters = map.get(key);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String currentString : list) {
            arrayList.add(replaceString(characters, index, currentString, 0));
        }
        return arrayList;
    }

    private String replaceString(List<Character> list, int index, String phoneNumber, int count) {
        if (count < list.size()) {
            StringBuilder builder = new StringBuilder(phoneNumber);
            builder.deleteCharAt(index);
            builder.insert(index, list.get(count++));
            return replaceString(list, index, builder.toString(), count);
        }
        return "";
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
}
