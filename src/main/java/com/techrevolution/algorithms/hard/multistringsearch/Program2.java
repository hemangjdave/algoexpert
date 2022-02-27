package com.techrevolution.algorithms.hard.multistringsearch;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 25/01/22
 * Time: 3:56 PM
 */
@UtilityClass
public class Program2 {
    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
        // Write your code here.
        List<Boolean> list = new ArrayList<>();
        for (String string : smallStrings) {
            list.add(containsString(bigString, string));
        }
        return list;
    }

    private static boolean containsString(String bigString, String smallString) {
        return bigString.contains(smallString);
    }

}
