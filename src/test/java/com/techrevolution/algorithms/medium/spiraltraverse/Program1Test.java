package com.techrevolution.algorithms.medium.spiraltraverse;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class Program1Test {

    @Test
    void test1() {
        var array = new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7},
        };
        List<Integer> spiralTraverse = Program1.spiralTraverse(array);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(expected, spiralTraverse);
    }


    @Test
    void test2() {
        var array = new int[][]{
                {1, 2, 3, 4},
                {10, 11, 12, 5},
                {9, 8, 7, 6}
        };
        List<Integer> spiralTraverse = Program1.spiralTraverse(array);
        log.info(spiralTraverse.toString());
    }
}