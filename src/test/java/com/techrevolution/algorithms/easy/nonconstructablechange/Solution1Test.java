package com.techrevolution.algorithms.easy.nonconstructablechange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    private Solution1 solution1;

    @BeforeEach
    void setUp() {
        solution1 = new Solution1();
    }

    @Test
    void testNonConstructableChange1() {
        assertEquals(1, solution1.nonConstructableChange(new int[]{88}));
    }

    @Test
    void testNonConstructableChange2() {
        assertEquals(1, solution1.nonConstructableChange(new int[0]));
    }

    @Test
    void testNonConstructableChange3() {
        assertEquals(2, solution1.nonConstructableChange(new int[]{1}));
    }

    @Test
    void testNonConstructableChange4() {
        assertEquals(4, solution1.nonConstructableChange(new int[]{1,2,5}));
    }

    @Test
    void testNonConstructableChange5() {
        assertEquals(8, solution1.nonConstructableChange(new int[]{1,2,4}));
    }

    @Test
    void testNonConstructableChange6() {
        assertEquals(7, solution1.nonConstructableChange(new int[]{1,1,1,1,1,1}));
    }

    @Test
    void testNonConstructableChange7() {
        assertEquals(1, solution1.nonConstructableChange(new int[]{2,5}));
    }

    @Test
    void testNonConstructableChange8() {
        assertEquals(20, solution1.nonConstructableChange(new int[]{1 , 1 , 2 , 3 , 5 , 7 , 22}));
    }

    @Test
    void testNonConstructableChange9() {
        assertEquals(87, solution1.nonConstructableChange(new int[]{109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4}));
    }
}