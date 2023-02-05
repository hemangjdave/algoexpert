package com.techrevolution.algorithms.easy.twonumbersum;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.util.stream.Collectors.toMap;

@Slf4j
public class Solution1 {
	public static void main(String[] args) {
		int[] array = {3, 5, - 4, 8, 11, 1, - 1, 6};
		var targetedSum = 10;
		log.info(Arrays.toString(twoNumberSum(array, targetedSum)));
	}

	public static int[] twoNumberSum(int[] array, int targetSum) {
		// Write your code here.
		Map<Integer, Integer> collect = Arrays.stream(array)
				.boxed()
				.collect(toMap((integer -> integer), (integer -> targetSum - integer)));

		System.out.println(collect);

		List<Integer> list = collect.values()
				.stream()
				.filter(integer -> ! Objects.equals(collect.get(integer), integer))
				.takeWhile(integer -> collect.get(integer) != null)
				.toList();
		System.out.println(list);

		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(list);
		finalList.addAll(
				list.stream()
						.map(collect::get)
						.toList()
		);
		System.out.println(finalList);

		for (var i = 0; i < array.length; i++) {
			for (var j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == targetSum) {
					return new int[]{array[i], array[j]};
				}
			}
		}
		return new int[0];
	}

	public static void addAllToList(List<Integer> list, List<Integer> list2) {
		System.out.println("list is:--" + list);
		System.out.println("list2 is :--" + list2);
	}

	public static void addIntToList(List<Integer> list, int value) {
		System.out.println("value is:--" + value);
		System.out.println("addToList method :--" + list);
		list.add(value);
	}

}
