package com.techrevolution.algorithms.hard.multistringsearch;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Hemang Dave
 * Date: 25/01/22
 * Time: 3:43 PM
 */
@UtilityClass
public class Program {
    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
        // Write your code here.
        List<Boolean> list = new ArrayList<>();
        for (String string : smallStrings) {
            list.add(bigString.contains(string));
        }
        return list;
    }
}
