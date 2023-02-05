package com.techrevolution.algorithms.easy.countduplicatechars;

import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

/**
 * Created By Hemang Dave
 * Date: 04/09/22
 * Time: 5:51 pm
 */
public class Program {

	private Program() {
	}

	public static void main(String[] args) {
		System.out.println(countDuplicates("aabcdeafbcdaeffghijgij"));
	}

	public static Map<Character, Long> countDuplicates(String str) {
		return str.chars()
				.mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(identity(), counting()));
	}
}
