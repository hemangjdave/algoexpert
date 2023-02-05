package com.techrevolution.algorithms.medium.minswap;

import org.junit.jupiter.api.Test;

import static com.techrevolution.algorithms.medium.minswap.Program.minSwap;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ProgramTest {

    @Test
    void testMinSwap1() {
        String input = "001";
        assertEquals(1, minSwap(input));
    }

    @Test
    void testMinSwap2() {
        String input = "011";
        assertEquals(1, minSwap(input));
    }

    @Test
    void testMinSwap3() {
        String input = "0101";
        assertEquals(1, minSwap(input));
    }

    @Test
    void testMinSwap4() {
        String input = "0100";
        assertEquals(- 1, minSwap(input));
    }

    @Test
    void testMinSwap5() {
        String input = "01010";
        assertEquals(0, minSwap(input));
    }

    @Test
    void testMinSwap6() {
        String input = "10100110101210101010110";
        assertEquals(2, minSwap(input));
    }

    @Test
    void testMinSwap7() {
        String input = "0011";
        assertEquals(2, minSwap(input));
    }

    @Test
    void testMinSwap8() {
        String input = "aabcc";
        //abacb
        //abcab
        //abcba
        assertEquals(4, minSwap(input));
    }

    @Test
    void testMinSwap9() {
        String input = "aabcb";
        assertEquals(3, minSwap(input));
    }

    @Test
    void testMinSwap10() {
        String input = "adbcdbad";
        assertEquals(- 1, minSwap(input));
    }
}