package com.techrevolution.algorithms.easy.caesarcipher;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Hemang Dave
 * Date: 01/12/21
 * Time: 11:39 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        log.info(caesarCypherEncryptor("abc", 52));
        log.info(caesarCypherEncryptor("xyz", 2));
    }

    // xyz --> zab
    // 97 to 122 a to z
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] chars = str.toCharArray();
        for (var i = 0; i < chars.length; i++) {
            var ch = chars[i];
            ch += (char) key;
            if (ch >= 123) {
                if (key > 26) {
                    var increment = (ch - 123) % 26;
                    ch = (char) (97 + increment);
                } else {
                    ch = (char) (97 + (ch - 123));
                }
            }
            chars[i] = ch;
        }
        return new String(chars);
    }
}
