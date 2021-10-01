package com.techrevolution.algorithms.easy.classphotos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1Test {

    private Solution1 solution1;
    private List<Integer> redShirtHeights;
    private List<Integer> blueShirtHeights;

    @BeforeEach
    void setUp() {
        solution1 = new Solution1();
    }

    @Test
    void classPhotos1() {
        redShirtHeights = Arrays.asList(5, 8, 1, 3, 4);
        blueShirtHeights = Arrays.asList(6, 9, 2, 4, 5);
        assertTrue(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos2() {
        redShirtHeights = Arrays.asList(6, 9, 2, 4, 5);
        blueShirtHeights = Arrays.asList(5, 8, 1, 3, 4);
        assertTrue(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos3() {
        redShirtHeights = Arrays.asList(6, 9, 2, 4, 5, 1);
        blueShirtHeights = Arrays.asList(5, 8, 1, 3, 4, 9);
        assertFalse(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos4() {
        redShirtHeights = singletonList(6);
        blueShirtHeights = singletonList(6);
        assertFalse(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos5() {
        redShirtHeights = singletonList(126);
        blueShirtHeights = singletonList(125);
        assertTrue(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos6() {
        redShirtHeights = Arrays.asList(1, 2, 3, 4, 5);
        blueShirtHeights = Arrays.asList(2, 3, 4, 5, 6);
        assertTrue(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos7() {
        redShirtHeights = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1);
        blueShirtHeights = Arrays.asList(5, 6, 7, 2, 3, 1, 2, 3);
        assertFalse(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos8() {
        redShirtHeights = Arrays.asList(4, 5);
        blueShirtHeights = Arrays.asList(5, 4);
        assertFalse(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }

    @Test
    void classPhotos9() {
        redShirtHeights = Arrays.asList(5, 6);
        blueShirtHeights = Arrays.asList(5, 4);
        assertTrue(solution1.classPhotos(redShirtHeights, blueShirtHeights));
    }
}