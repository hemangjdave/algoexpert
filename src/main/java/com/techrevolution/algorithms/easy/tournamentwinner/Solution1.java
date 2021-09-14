package com.techrevolution.algorithms.easy.tournamentwinner;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;

@Slf4j
public class Solution1 {

    private static final IntPredicate intPredicate = (value -> value == 1);
    public static final String PYTHON = "Python";

    public static void main(String[] args) {
        List<List<String>> competitions = List.of(
                List.of("HTML", "C#"),
                List.of("C#", PYTHON),
                List.of(PYTHON, "HTML")
        );
        List<Integer> results = List.of(0, 0, 1);
        log.info(new Solution1().tournamentWinner(competitions, results));

        competitions = List.of(
                List.of("HTML", "Java"),
                List.of("Java", PYTHON),
                List.of(PYTHON, "HTML")
        );
        results = List.of(0, 1, 1);
        log.info(new Solution1().tournamentWinner(competitions, results));
    }

    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        // Write your code here.
        final var map = new HashMap<String, Integer>();
        final var WINNING_POINT = 3;
        var primaryIndex = 0;
        for (int integer : results) {
            List<String> competition = competitions.get(primaryIndex++);
            var winningTeam = intPredicate.test(integer) ? competition.get(0) : competition.get(1);
            if (map.computeIfPresent(winningTeam, ((s, integer1) -> integer1 + WINNING_POINT)) == null)
                map.put(winningTeam, WINNING_POINT);
        }
        return findWiningTeam(map);
    }

    private String findWiningTeam(Map<String, Integer> map) {
        var optionalStringIntegerEntry
                = map.entrySet().stream().max(Map.Entry.comparingByValue());
        return optionalStringIntegerEntry.isPresent() ? optionalStringIntegerEntry.get().getKey() : "";
    }
}
