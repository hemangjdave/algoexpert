package com.techrevolution.algorithms.easy.findfactors;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created By Hemang Dave
 * Date: 09/08/22
 * Time: 6:30 pm
 */
@Slf4j
public class Program {
	public static void main(String[] args) {
		final List<Integer> factorList = getFactorList();
		log.info(factorList.toString());
		log.info(String.valueOf(factorList.size()));
	}

	private static List<Integer> getFactorList() {
		final int number = 540;
		int mid = number / 2;
		List<Integer> list = new ArrayList<>();
		IntStream.rangeClosed(1, mid)
				.boxed()
				.filter(integer -> number % integer == 0)
				.forEach(list::add);

		return list;
	}
}
