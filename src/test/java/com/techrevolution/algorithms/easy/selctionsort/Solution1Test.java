package com.techrevolution.algorithms.easy.selctionsort;

import org.junit.jupiter.api.Test;

import static com.techrevolution.algorithms.easy.selctionsort.Solution1.selectionSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1Test {

    @Test
    void testSelectionSort1() {
        assertArrayEquals(new int[]{2, 3, 5, 5, 6, 8, 9}, selectionSort(new int[]{8, 5, 2, 9, 5, 6, 3}));
    }

    @Test
    void testSelectionSort2() {
        assertArrayEquals(new int[]{1}, selectionSort(new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, selectionSort(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, selectionSort(new int[]{2, 1}));
        assertArrayEquals(new int[]{1, 2, 3}, selectionSort(new int[]{1, 3, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, selectionSort(new int[]{3, 1, 2}));
    }

    @Test
    void testSelectionSort3() {
        assertArrayEquals(
                new int[]{-10, -7, -7, -6, -6, -5, -5, -4, -4, -4, -2, -1, 1, 3, 5, 5, 6, 8, 8, 10},
                selectionSort(new int[]{-4, 5, 10, 8, -10, -6, -4, -2, -5, 3, 5, -4, -5, -1, 1, 6, -7, -6, -7, 8})
        );
    }

    @Test
    void testSelectionSort4() {
        assertArrayEquals(
                new int[]{-987, -950, -949, -942, -941, -935, -908, -874, -855, -846, -823, -817, -796, -738, -733, -730, -685, -578, -575, -575, -544, -542, -469, -441, -420, -415, -410, -376, -371, -363, -359, -353, -337, -293, -265, -257, -254, -191, -167, -160, -155, -126, -120, -51, -36, -13, 14, 48, 52, 59, 59, 125, 157, 164, 183, 201, 238, 243, 295, 323, 328, 341, 355, 356, 372, 399, 422, 490, 490, 540, 572, 610, 631, 646, 700, 724, 746, 800, 829, 842, 888, 892, 892, 919, 950, 965, 980, 995},
                selectionSort(new int[]{-823, 164, 48, -987, 323, 399, -293, 183, -908, -376, 14, 980, 965, 842, 422, 829, 59, 724, -415, -733, 356, -855, -155, 52, 328, -544, -371, -160, -942, -51, 700, -363, -353, -359, 238, 892, -730, -575, 892, 490, 490, 995, 572, 888, -935, 919, -191, 646, -120, 125, -817, 341, -575, 372, -874, 243, 610, -36, -685, -337, -13, 295, 800, -950, -949, -257, 631, -542, 201, -796, 157, 950, 540, -846, -265, 746, 355, -578, -441, -254, -941, -738, -469, -167, -420, -126, -410, 59})
        );
    }
}