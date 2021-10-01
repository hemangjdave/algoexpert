package com.techrevolution.algorithms.easy.tendembycycle;

import lombok.extern.slf4j.Slf4j;

import static java.lang.String.valueOf;
import static java.util.Arrays.sort;

/**
 * Created by Hemang Dave.
 * Date: 01/10/21
 * Time: 11:19 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        log.info(valueOf(new Solution1().tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true)));
        log.info(valueOf(new Solution1().tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false)));
    }

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        sort(redShirtSpeeds);
        sort(blueShirtSpeeds);
        var sumOfSpeed = 0;
        var redSpeed = 0;
        var blueSpeed = 0;
        for (var i = 0; i < redShirtSpeeds.length; i++) {
            redSpeed = redShirtSpeeds[i];
            if (fastest) {
                blueSpeed = blueShirtSpeeds[blueShirtSpeeds.length - i - 1];
            } else {
                blueSpeed = blueShirtSpeeds[i];
            }
            var resultSpeed = Math.max(redSpeed, blueSpeed);
            sumOfSpeed += resultSpeed;
        }
        return sumOfSpeed;
    }
}
