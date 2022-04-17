package com.techrevolution.algorithms.medium.groupanagrams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    void TestCase1() {
        List<String> words =
                new ArrayList<>(
                        Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<>(Arrays.asList("act", "tac", "cat")));
        expected.add(new ArrayList<>(List.of("foo")));
        List<List<String>> output = Program.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    void TestCase2() {
        List<String> words =
                new ArrayList<>(
                        Arrays.asList("abc", "dabd", "bca", "cab", "ddba"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("abc", "bca", "cab")));
        expected.add(new ArrayList<>(Arrays.asList("dabd", "ddba")));
        List<List<String>> output = Program.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    void TestCase3() {
        List<String> words =
                new ArrayList<>(
                        Arrays.asList("cinema", "a", "flop", "iceman", "meacyne", "lofp", "olfp"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of("a")));
        expected.add(new ArrayList<>(List.of("meacyne")));
        expected.add(new ArrayList<>(Arrays.asList("cinema", "iceman")));
        expected.add(new ArrayList<>(Arrays.asList("flop", "lofp", "olfp")));
        List<List<String>> output = Program.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    void TestCase4() {
        List<String> words =
                new ArrayList<>(
                        Arrays.asList("bob", "boo"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of("boo")));
        expected.add(new ArrayList<>(List.of("bob")));
        List<List<String>> output = Program.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;
        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }
        return true;
    }

}