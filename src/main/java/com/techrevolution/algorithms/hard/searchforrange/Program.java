package com.techrevolution.algorithms.hard.searchforrange;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 12/08/22
 * Time: 10:12 am
 */
@Slf4j
public class Program {
    public static void main(String[] args) {
        int[] array = {0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73};
        var target = 45;
        log.info(Arrays.toString(searchForRange(array, target)));

        int[] array2 = {5, 7, 7, 8, 8, 10};
        log.info(Arrays.toString(searchForRange(array2, 5)));
    }


    public static int[] searchForRange(int[] array, int target) {
        // Write your code here.
        int[] result = new int[2];
        List<Integer> integerList = Arrays.stream(array).boxed().toList();
        int indexOf = integerList.indexOf(target);
        if (indexOf < 0) {
            result[0] = result[1] = - 1;
            return result;
        }
        result[0] = indexOf;
        var lastIndex = integerList.lastIndexOf(target);
        if (lastIndex < 0) {
            result[1] = indexOf;
        } else {
            result[1] = lastIndex;
        }
        return result;
    }

}
