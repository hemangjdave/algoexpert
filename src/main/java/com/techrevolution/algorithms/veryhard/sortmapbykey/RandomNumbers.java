package com.techrevolution.algorithms.veryhard.sortmapbykey;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created By Hemang Dave
 * Date: 22/09/22
 * Time: 7:20 pm
 */
public class RandomNumbers {

    private static final Random random = new Random();

    public static void main(String[] args) {
        printNumbers(1, 100, 10);
        printNumbers(10, 90, 8);
        printEvenNumbers();
    }

    private static void printEvenNumbers() {
        List<Integer> list = new ArrayList<>();
        for (var i = 0; i < 20; i++) {
            list.add(random.nextInt(1, 100));
        }
        System.out.println("Generated list is:--" + list);

        list.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
    }

    static void printNumbers(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (count != c) {
            int nextInt = random.nextInt(a, b);
            if (! set.contains(nextInt)) {
                set.add(nextInt);
                count++;
            }
        }
        System.out.println(set);
    }
}
