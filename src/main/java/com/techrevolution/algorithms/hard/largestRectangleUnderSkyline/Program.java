package com.techrevolution.algorithms.hard.largestRectangleUnderSkyline;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created By Hemang Dave
 * Date: 26/04/22
 * Time: 8:18 PM
 */
public class Program {
    public int largestRectangleUnderSkyline(ArrayList<Integer> buildings) {
        // Write your code here.
        if (buildings.isEmpty()) {
            return 0;
        }
        if (buildings.size() == 1) {
            return buildings.get(0);
        }
        Deque<Integer> deque = new ArrayDeque<>();
        var finalArea = 0;
        for (var i = 0; i < buildings.size(); i++) {
            var currentBuildingHeight = buildings.get(i);
            var currentMaxHeight = currentBuildingHeight;
            Iterator<Integer> integerIterator = deque.descendingIterator();
            while (integerIterator.hasNext()) {
                int buildingHeight = integerIterator.next();
                if (currentBuildingHeight > buildingHeight) {
                    break;
                }
                currentMaxHeight = currentMaxHeight + currentBuildingHeight;
            }
            for (var j = i+1; j < buildings.size(); j++) {
                if (currentBuildingHeight > buildings.get(j)) {
                    break;
                }
                currentMaxHeight = currentMaxHeight + Math.min(buildings.get(j), currentBuildingHeight);
            }
            if (currentMaxHeight > finalArea) {
                finalArea = currentMaxHeight;
            }

            deque.addLast(currentBuildingHeight);
        }
        return finalArea;
    }
}
