package com.techrevolution.algorithms.medium.suffixtrieconstruction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Hemang Dave
 * Date: 21/01/22
 * Time: 3:12 PM
 */
class Program {
    // Do not edit the class below except for the
    // populateSuffixTrieFrom and contains methods.
    // Feel free to add new properties and methods
    // to the class.
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            // Write your code here.
        }

        public boolean contains(String str) {
            // Write your code here.
            return false;
        }
    }
}

