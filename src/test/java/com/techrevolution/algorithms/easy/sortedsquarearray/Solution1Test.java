package com.techrevolution.algorithms.easy.sortedsquarearray;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Slf4j
class Solution1Test {

    @Test
    void testSortedSquaredArray1() {
        int[] array = {1, 2, 3, 5, 6, 8, 9};
        array = Solution1.sortedSquaredArray(array);
        log.info(Arrays.toString(array));
        assertArrayEquals(new int[]{1, 4, 9, 25, 36, 64, 81}, array);
    }

    @Test
    void testSortedSquaredArray2() {
        int[] array = {0};
        array = Solution1.sortedSquaredArray(array);
        log.info(Arrays.toString(array));
        assertArrayEquals(new int[]{0}, array);
    }

    @Test
    void testSortedSquaredArray3() {
        int[] array = {-2, -1};
        array = Solution1.sortedSquaredArray(array);
        log.info(Arrays.toString(array));
        assertArrayEquals(new int[]{1, 4}, array);
    }

    @Test
    void testSortedSquaredArray4() {
        int[] array = {-10, -5, 0, 5, 10};
        array = Solution1.sortedSquaredArray(array);
        log.info(Arrays.toString(array));
        assertArrayEquals(new int[]{0, 25, 25, 100, 100}, array);
    }

}