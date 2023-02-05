package com.techrevolution.algorithms.easy.generatedocument;

import lombok.extern.slf4j.Slf4j;

/**
 * Created By Hemang Dave
 * Date: 22/11/21
 * Time: 3:49 PM
 */
@Slf4j
public class Solution1 {
	public static void main(String[] args) {
		String characters = "aheaollabbhb";
		String document = "hello";
		log.info("Result is :-- {}", new Solution1().generateDocument(characters, document));
	}

	public boolean generateDocument(String characters, String document) {
		// Write your code here.
		if (document.length() == 0) {
			return true;
		}
		char[] documentArray = document.toCharArray();
		for (char ch : documentArray) {
			var index = characters.indexOf(ch);
			if (index == - 1) return false;
			characters = characters.replaceFirst(String.valueOf(ch), "");
		}
		log.info("Generated string is :-- {}", characters);
		return true;
	}
}
