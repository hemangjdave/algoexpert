package com.techrevolution.algorithms.easy.reversedstring;


import java.util.stream.Stream;

/**
 * Created By Hemang Dave
 * Date: 12/11/22
 * Time: 11:36 am
 */
public class Program {
	public static void main(String[] args) {
		long divisor = 1000;
		long startTime = System.nanoTime();
		System.out.println(getReversedStringRecursively("Hemang Dave"));
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) / divisor);
	}

	public static String getReversedString(String str) {
		StringBuilder collect = Stream.iterate(str.length() - 1, integer -> integer - 1)
				.limit(str.length())
				.map(str::charAt)
				.collect(StringBuilder::new, StringBuilder::append,
						(stringBuilder, stringBuilder2) -> stringBuilder2 = stringBuilder);
		return collect.toString();
	}

	public static String getReversedStringRecursively(String str) {
		if (str.isEmpty()) {
			return str;
		}
		char firstChar = str.charAt(0);
		String subString = str.substring(1);
		return getReversedStringRecursively(subString) + firstChar;
	}
}
