package com.techrevolution.algorithms.easy.nonrepeatingchar;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Hemang Dave
 * Date: 20/11/21
 * Time: 12:11 AM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(String.valueOf(new Solution1().firstNonRepeatingCharacter("abcdcaf")));
        log.info(String.valueOf(new Solution1().firstNonRepeatingCharacter("faadabcbbebdf")));
        log.info(String.valueOf(new Solution1().firstNonRepeatingCharacter("abcdefghhgfedcba")));
        log.info(String.valueOf(new Solution1().firstNonRepeatingCharacter("abcdefghabcdefghi")));
    }

    public int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        char[] array = string.toCharArray();
        Set<Character> nonUniqueSet = new HashSet<>();
        for (var i = 0; i < array.length; i++) {
            int indexOf = string.indexOf(array[i], i + 1);
            if (indexOf > -1) {
                nonUniqueSet.add(array[i]);
            }
            if (indexOf == -1 && !nonUniqueSet.contains(array[i])) {
                return i;
            }
        }
        return -1;
    }
}
