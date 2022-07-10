package com.techrevolution.algorithms.medium.sunsetviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 05/05/22
 * Time: 12:08 AM
 */
public class Program {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        // EAST ==> right
        // WEST ==> left
        ArrayList<Integer> indicesList = new ArrayList<>();
        Map<Integer, Integer> buildingsMap = new HashMap<>();
        if ("EAST".equals(direction)) {
            for (var i = 0; i < buildings.length; i++) {

            }
        }



        indicesList.sort(Comparator.naturalOrder());
        return indicesList;
    }
}
