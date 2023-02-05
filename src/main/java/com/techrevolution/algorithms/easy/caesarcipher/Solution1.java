package com.techrevolution.algorithms.easy.caesarcipher;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 01/12/21
 * Time: 11:39 PM
 */
@Slf4j
public class Solution1 {
	public static void main(String[] args) {
		log.info(caesarCypherEncryptor("abc", 52));
		log.info(caesarCypherEncryptorWithStream("abc", 52));
		log.info(caesarCypherEncryptor("xyz", 2));
		log.info(caesarCypherEncryptorWithStream("xyz", 2));
	}

	public static String caesarCypherEncryptorWithStream(String str, int key) {
		List<Character> characters
				= str.chars().mapToObj(value -> (char) value).toList();
		StringBuilder builder
				= characters.stream()
				.map(character -> (char) (character + key))
				.map(character -> getChar(character, key))
				.reduce(
						new StringBuilder(),
						(StringBuilder::append),
						(stringBuilder, stringBuilder2) -> stringBuilder2 = stringBuilder);
		return builder.toString();

	}

	public static char getChar(char ch, int key) {
		if (ch >= 123) {
			if (key > 26) {
				var increment = (ch - 123) % 26;
				ch = (char) (97 + increment);
			} else {
				ch = (char) (97 + (ch - 123));
			}
		}
		return ch;
	}

	// xyz --> zab
	// 97 to 122 a to z
	public static String caesarCypherEncryptor(String str, int key) {
		// Write your code here.
		char[] chars = str.toCharArray();
		for (var i = 0; i < chars.length; i++) {
			var ch = chars[i];
			ch += (char) key;
			chars[i] = getChar(ch, key);
		}
		return new String(chars);
	}
}
