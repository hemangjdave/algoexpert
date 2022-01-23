package com.techrevolution.algorithms.medium.arrayofproducts;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created By Hemang Dave
 * Date: 08/12/21
 * Time: 10:22 PM
 */
@Slf4j
public class Solution1 {

    public static void main(String[] args) {
        log.info(Arrays.toString(new Solution1().arrayOfProducts(new int[]{5, 1, 4, 2})));
    }

    public int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] arrayOfProduct = new int[array.length];
        var sum = 1;
        for (var i = 0; i < array.length; i++) {
            for (var j = 0; j < array.length; j++) {
                if (i != j) {
                    sum = sum * array[j];
                }
            }
            arrayOfProduct[i] = sum;
            sum = 1;
        }
        return arrayOfProduct;
    }
}
