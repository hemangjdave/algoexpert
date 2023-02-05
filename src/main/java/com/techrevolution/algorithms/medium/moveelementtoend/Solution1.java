package com.techrevolution.algorithms.medium.moveelementtoend;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 02/12/21
 * Time: 4:59 PM
 */
@Slf4j
public class Solution1 {
	public static void main(String[] args) {
		int[] values = {2, 1, 2, 2, 2, 3, 4, 2};
		List<Integer> collect = Arrays.stream(values).boxed().toList();
		log.info(moveElementToEnd(collect, 2).toString());


		int[] values1 = {2, 1, 2, 2, 2, 3, 4, 2};
		List<Integer> collect1 = Arrays.stream(values1).boxed().toList();
		log.info(moveElementToEndWithStream(collect1, 2).toString());

		values = new int[]{1, 2, 4, 5, 6};
		collect = Arrays.stream(values).boxed().toList();
		log.info(moveElementToEnd(collect, 3).toString());

		values = new int[]{1, 2, 4, 5, 3};
		collect = Arrays.stream(values).boxed().toList();
		log.info(moveElementToEnd(collect, 3).toString());
	}


	public static List<Integer> moveElementToEndWithStream(List<Integer> array, int toMove) {
		List<Integer> finalResult = new ArrayList<>(array);
		finalResult.removeIf(integer -> integer == toMove);
		List<Integer> filteredList = array.stream().filter(integer -> integer == toMove).toList();
		finalResult.addAll(filteredList);
		return finalResult;
	}

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		// Write your code here.
		if (! array.contains(toMove)) {
			return array;
		}
		// 2, 1, 2, 2, 2, 3, 4, 2
		Collections.sort(array);
		// 1 , 2 , 2 , 2, 2 , 2 , 3 , 4
		var firstIndex = 0;
		for (var i = 0; i < array.size(); i++) {
			var value = array.get(i);
			if (value < toMove) {
				firstIndex++;
			} else if (value != toMove) {
				array.set(firstIndex, value);
				array.set(i, toMove);
				firstIndex++;
			}
		}
		return array;
	}
}
