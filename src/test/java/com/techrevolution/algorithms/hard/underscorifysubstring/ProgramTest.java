package com.techrevolution.algorithms.hard.underscorifysubstring;

import org.junit.jupiter.api.Test;

import static com.techrevolution.algorithms.hard.underscorifysubstring.Program.appendUnderscore;
import static com.techrevolution.algorithms.hard.underscorifysubstring.Program.underscorifySubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void TestCase1() {
        String expected = "_test_this is a _testtest_ to see if _testestest_ it works";
        String output =
                underscorifySubstring(
                        "testthis is a testtest to see if testestest it works", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase2() {
        String expected = "this is a _test_ to see if it works";
        String output =
                underscorifySubstring(
                        "this is a test to see if it works", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase3() {
        String expected = "_test_this is a _test_ to see if it works";
        String output =
                underscorifySubstring(
                        "testthis is a test to see if it works", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase4() {
        String expected = "_test_this is a _testest_ to see if _testest_es it works";
        String output =
                underscorifySubstring(
                        "testthis is a testest to see if testestes it works", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase5() {
        String expected = "this is a test to see if it works and test";
        String output =
                underscorifySubstring(
                        "this is a test to see if it works and test", "bfjawkfja");
        assertEquals(expected, output);
    }

    @Test
    void TestCase6() {
        String expected = "_tttttttttttttt_b_ttttt_ctatawta_ttttt_astvb";
        String output =
                underscorifySubstring(
                        "ttttttttttttttbtttttctatawtatttttastvb", "ttt");
        assertEquals(expected, output);
    }

    @Test
    void TestCase7() {
        String expected = "tzttz_ttt_z";
        String output =
                underscorifySubstring(
                        "tzttztttz", "ttt");
        assertEquals(expected, output);
    }

    @Test
    void TestCase8() {
        String expected = "_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_a_b_aa_b_a_b_aaa_bb_a_b_a_b_aa_";
        String output =
                appendUnderscore(
                        "abababababababababababababaababaaabbababaa", "a");
        assertEquals(expected, output);
    }

    @Test
    void TestCase9() {
        String expected = "hemang_test_hemang_test_hemang_testest_";
        String output =
                underscorifySubstring(
                        "hemangtesthemangtesthemangtestest", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase10() {
        String expected = "sh_test_sh_test_sh_testest_";
        String output =
                appendUnderscore(
                        "shtestshtestshtestest", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase11() {
        String expected = "hemang_testesttest_";
        String output =
                appendUnderscore(
                        "hemangtestesttest", "test");
        assertEquals(expected, output);
    }

    @Test
    void TestCase12() {
        String expected = "hemang_test_hemang_test_hemang_testest_hemang";
        String output =
                appendUnderscore(
                        "hemangtesthemangtesthemangtestesthemang", "test");
        assertEquals(expected, output);
    }

}