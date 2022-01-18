package com.techrevolution.algorithms.medium.numberofwaystomakechange;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 29/12/21
 * Time: 7:03 PM
 */
public class Program {

    private Program() {
    }

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        // Write your code here.
        if (n == 0) {
            return 1;
        }
        List<Integer> denomList = Arrays.stream(denoms).boxed().toList();
        var numOfWays = 0;
        for (var i = 0; i < denomList.size(); i++) {
            Integer denom = denomList.get(i);
            if (n % denom == 0) {
                numOfWays++;
            } else {
                var j = n / denom;
                if (denomList.contains(j)) {
                    numOfWays++;
                }
            }
        }
        return numOfWays;
    }
}
