package com.techrevolution.algorithms.easy.obsculator;

import java.util.stream.IntStream;

import static java.lang.Math.negateExact;

/**
 * Created By Hemang Dave
 * Date: 18/01/23
 * Time: 9:47 pm
 */
public class Generate {
	public static void main(String[] args) {
		System.out.println(getOsculator(7));
		System.out.println(getOsculator(13));
		System.out.println(getOsculator(11));
		System.out.println(getOsculator(1987));
	}

	private static int getOsculator(int number) {
		if (! isPrime(number)) {
			return - 1;
		}
		var multiply = 1;
		var result = 0;
		while (true) {
			result = number * multiply;
			if ((result - 1) % 10 == 0) {
				System.out.printf("multiply is %d%n", multiply);
				return negateExact((result - 1) / 10);
			}
			if ((result + 1) % 10 == 0) {
				System.out.printf("multiply is %d%n", multiply);
				return (result + 1) / 10;
			}
			multiply++;
		}
	}

	private static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, number / 2).noneMatch(value -> number % value == 0);
	}
}
