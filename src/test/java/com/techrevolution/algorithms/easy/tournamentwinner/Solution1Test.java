package com.techrevolution.algorithms.easy.tournamentwinner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    private Solution1 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution1();
    }

    @Test
    void testTournamentWinner1() {
        List<List<String>> competitions = List.of(
                List.of("HTML", "C#"),
                List.of("C#", "Python"),
                List.of("Python", "HTML")
        );
        List<Integer> results = List.of(0, 0, 1);
        assertEquals("Python", solution.tournamentWinner(competitions, results));
    }

    @Test
    void testTournamentWinner2() {
        List<List<String>> competitions = List.of(
                List.of("HTML", "Java"),
                List.of("Java", "Python"),
                List.of("Python", "HTML")
        );
        List<Integer> results = List.of(0, 1, 1);
        assertEquals("Java", solution.tournamentWinner(competitions, results));
    }

    @Test
    void testTournamentWinner3() {
        List<List<String>> competitions = List.of(
                List.of("HTML", "Java"), //Java
                List.of("Java", "Python"),//Java
                List.of("Python", "HTML"),//Python
                List.of("C#", "Python"),//C#
                List.of("Java", "C#"),//C#
                List.of("C#", "HTML")//C#
        );
        List<Integer> results = List.of(0, 1, 1, 1, 0, 1);
        assertEquals("C#", solution.tournamentWinner(competitions, results));
    }

    @Test
    void testTournamentWinner4() {
        List<List<String>> competitions = List.of(
                List.of("HTML", "Java"),//Java
                List.of("Java", "Python"),//Java
                List.of("Python", "HTML"),//Python
                List.of("C#", "Python"),//C#
                List.of("Java", "C#"),//C#
                List.of("C#", "HTML"),//C#
                List.of("SQL", "C#"),//C#
                List.of("HTML", "SQL"),//HTML
                List.of("SQL", "Python"),//SQL
                List.of("SQL", "Java")//Java
        );
        List<Integer> results = List.of(0, 1, 1, 1, 0, 1, 0, 1, 1, 0);
        assertEquals("C#", solution.tournamentWinner(competitions, results));
    }

    @Test
    void testTournamentWinner5() {
        List<List<String>> competitions = List.of(
                List.of("Bulls", "Eagles")//Bulls

        );
        List<Integer> results = List.of(1);
        assertEquals("Bulls", solution.tournamentWinner(competitions, results));
    }

    @Test
    void testTournamentWinner6() {
        List<List<String>> competitions = List.of(
                List.of("AlgoMasters", "FrontPage Freebirds"),//AlgoMasters
                List.of("Runtime Terror", "Static Startup"),//Static Startup
                List.of("WeC#", "Hypertext Assassins"),//Hypertext Assassins
                List.of("AlgoMasters", "WeC#"),//AlgoMasters
                List.of("Static Startup", "Hypertext Assassins"),//Hypertext Assassins
                List.of("Runtime Terror", "FrontPage Freebirds"),//FrontPage Freebirds
                List.of("AlgoMasters", "Runtime Terror"),//AlgoMasters
                List.of("Hypertext Assassins", "FrontPage Freebirds"),//FrontPage Freebirds
                List.of("Static Startup", "WeC#"),//WeC#
                List.of("AlgoMasters", "Static Startup"),//AlgoMasters
                List.of("FrontPage Freebirds", "WeC#"),//WeC#
                List.of("Hypertext Assassins", "Runtime Terror"),//Runtime Terror
                List.of("AlgoMasters", "Hypertext Assassins"),//AlgoMasters
                List.of("WeC#", "Runtime Terror"),//Runtime Terror
                List.of("FrontPage Freebirds", "Static Startup")//Static Startup
        );
        List<Integer> results = List.of(1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0);
        assertEquals("AlgoMasters", solution.tournamentWinner(competitions, results));
    }

    @Test
    void testTournamentWinner7() {
        List<List<String>> competitions = List.of(
                List.of("A", "B") //B
        );
        List<Integer> results = List.of(0);
        assertEquals("B", solution.tournamentWinner(competitions, results));
    }
}