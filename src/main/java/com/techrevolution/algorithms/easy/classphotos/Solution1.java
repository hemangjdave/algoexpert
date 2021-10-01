package com.techrevolution.algorithms.easy.classphotos;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 01/10/21
 * Time: 4:59 PM
 */
@Slf4j
public class Solution1 {
    public static void main(String[] args) {
        List<Integer> redShirtHeights = Arrays.asList(3, 5, 6, 8, 2);
        List<Integer> blueShirtHeights = Arrays.asList(2, 4, 7, 5, 1);
        log.info(new Solution1().classPhotos(redShirtHeights, blueShirtHeights) + "");
    }

    public boolean classPhotos(List<Integer> redShirtHeights, List<Integer> blueShirtHeights) {
        // Write your code here.
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        // Write your code here.
        var redShirtHeight = redShirtHeights.get(0);
        var blueShirtHeight = blueShirtHeights.get(0);
        var isBlueShirtTeamInBackRow = redShirtHeight < blueShirtHeight;
        for (var i = 0; i < redShirtHeights.size(); i++) {
            redShirtHeight = redShirtHeights.get(i);
            blueShirtHeight = blueShirtHeights.get(i);
            if (isBlueShirtTeamInBackRow) {
                if (redShirtHeight >= blueShirtHeight) {
                    return false;
                }
            } else {
                if (blueShirtHeight >= redShirtHeight) {
                    return false;
                }
            }
        }
        return true;
    }
}
