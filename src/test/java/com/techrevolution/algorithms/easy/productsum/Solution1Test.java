package com.techrevolution.algorithms.easy.productsum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.techrevolution.algorithms.easy.productsum.Solution1.productSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    @Test
    void testProductSum() {
        List<Object> test =
                new ArrayList<>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<>(
                                        Arrays.asList(6, new ArrayList<>(Arrays.asList(-13, 8)), 4))));
        assertEquals(12, productSum(test));
    }

    @Test
    void testProductSum2() {
        List<Object> objectList = Arrays.asList(
                3,
                new ArrayList<>(Arrays.asList(1, new ArrayList<>(Collections.singletonList(2))))
        );
        assertEquals(17, productSum(objectList));
    }

    @Test
    void testProductSum3() {
        List<Object> singleObject = List.of(
                new ArrayList<>(
                        List.of(
                                new ArrayList<>(
                                        List.of(
                                                new ArrayList<>(
                                                        List.of(
                                                                new ArrayList<>(List.of(5))
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        assertEquals(600, productSum(singleObject));
    }
}