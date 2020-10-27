package com.example.lib;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    /**
     * Exercise 1
     * <p>
     * Given an array of strings, return a Map<String, Integer> containing a key for every
     * different string in the array, always with the value 0. For example the string
     * "hello" makes the pair "hello":0. We'll do more complicated counting later,
     * but for this problem the value is simply 0.
     * <p>
     * word0(["a", "b", "a", "b"]) â†’ {"a": 0, "b": 0}
     * word0(["a", "b", "a", "c", "b"]) â†’ {"a": 0, "b": 0, "c": 0}
     * word0(["c", "b", "a"]) â†’ {"a": 0, "b": 0, "c": 0}
     */

    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;

    }

    /**
     * Exercise 2
     * <p>
     * Given an array of strings, return a Map<String, Integer> containing a key for every
     * different string in the array, and the value is that string's length.
     * <p>
     * wordLen(["a", "bb", "a", "bb"]) â†’ {"bb": 2, "a": 1}
     * wordLen(["this", "and", "that", "and"]) â†’ {"that": 4, "and": 3, "this": 4}
     * wordLen(["code", "code", "code", "bug"]) â†’ {"code": 4, "bug": 3}
     */

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }
        return map;

    }

    /**
     * Exercise 3
     * <p>
     * Given an array of non-empty strings, create and return a Map<String, String> as
     * follows: for each string add its first character as a key with its last character
     * as the value.
     * <p>
     * pairs(["code", "bug"]) â†’ {"b": "g", "c": "e"}
     * pairs(["man", "moon", "main"]) â†’ {"m": "n"}
     * pairs(["man", "moon", "good", "night"]) â†’ {"g": "d", "m": "n", "n": "t"}
     */

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put("" + strings[i].charAt(0), "" + strings[i].charAt(strings[i].length() - 1));
        }
        return map;

    }

    /**
     * Exercise 4
     * <p>
     * The classic word-count algorithm: given an array of strings, return a Map<String,
     * Integer> with a key for each different string, with the value the number of times
     * that string appears in the array.
     * <p>
     * wordCount(["a", "b", "a", "c", "b"]) â†’ {"a": 2, "b": 2, "c": 1}
     * wordCount(["c", "b", "a"]) â†’ {"a": 1, "b": 1, "c": 1}
     * wordCount(["c", "c", "c", "c"]) â†’ {"c": 4}
     */

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }

        }

        return map;

    }

    /**
     * Exercise 5
     * <p>
     * Given an array of non-empty strings, return a Map<String, String> with a key for
     * every different first character seen, with the value of all the strings starting with
     * that character appended together in the order they appear in the array.
     * <p>
     * firstChar(["salt", "tea", "soda", "toast"]) â†’ {"s": "saltsoda", "t": "teatoast"}
     * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) â†’ {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
     * firstChar([]) â†’ {}
     */

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (String test : strings) {
            String temp = Character.toString(test.charAt(0));

            if (!map.containsKey(temp))
                map.put(temp, "");

            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + test);
            }

        }
        return map;

    }

    /**
     * Exercise 6
     * <p>
     * Loop over the given array of strings to build a result string like this: when a
     * string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the
     * result. Return the empty string if no string appears a 2nd time.
     * <p>
     * wordAppend(["a", "b", "a"]) â†’ "a"
     * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) â†’ "aa"
     * wordAppend(["a", "", "a"]) â†’ "a"
     */

    public String wordAppend(String[] strings) {

        String result = "";
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (map.containsKey(strings[i])) {
                map.remove(strings[i]);
                result += strings[i];
            } else {
                map.put(strings[i], "");
            }

        }

        return result;

    }

    /**
     * Exercise 7
     * <p>
     * Given an array of strings, return a Map<String, Boolean> where each different
     * string is a key and its value is true if that string appears 2 or more times in
     * the array.
     * <p>
     * wordMultiple(["a", "b", "a", "c", "b"]) â†’ {"a": true, "b": true, "c": false}
     * wordMultiple(["c", "b", "a"]) â†’ {"a": false, "b": false, "c": false}
     * wordMultiple(["c", "c", "c", "c"]) â†’ {"c": true}
     */

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (map.containsKey(strings[i])) {
                map.put(strings[i], true);
            } else {
                map.put(strings[i], false);
            }

        }

        return map;

    }

    /**
     * Exercise 8
     * <p>
     * We'll say that 2 strings "match" if they are non-empty and their first chars are the
     * same. Loop over and then return the given array of non-empty strings as follows:
     * if a string matches an earlier string in the array, swap the 2 strings in the
     * array. When a position in the array has been swapped, it no longer matches anything.
     * Using a map, this can be solved making just one pass over the array. More difficult
     * than it looks.
     * <p>
     * allSwap(["ab", "ac"]) â†’ ["ac", "ab"]
     * allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) â†’
     * ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
     * allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) â†’
     * ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
     */

    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String temp = Character.toString(strings[i].charAt(0));
            String swap = "";

            if (!map.containsKey(temp)) {
                map.put(temp, i);
                continue;
            }
            if (map.containsKey(temp)) {
                swap = strings[i];
                strings[i] = strings[map.get(temp)];
                strings[map.get(temp)] = swap;
                map.remove(temp);
            }
        }
        return strings;

    }

    /**
     * Exercise 9
     * <p>
     * We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
     * Loop over and then return the given array of non-empty strings as follows: if a string
     * matches an earlier string in the array, swap the 2 strings in the array. A particular
     * first char can only cause 1 swap, so once a char has caused a swap, its later swaps
     * are disabled. Using a map, this can be solved making just one pass over the array.
     * More difficult than it looks.
     * <p>
     * firstSwap(["ab", "ac"]) â†’ ["ac", "ab"]
     * firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) â†’
     * ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
     * firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) â†’
     * ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
     */

    public String[] firstSwap(String[] strings) {

        String test = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String temp = Character.toString(strings[i].charAt(0));
            String swap = "";

            if (!map.containsKey(temp)) {
                map.put(temp, i);
                continue;
            }
            if (map.containsKey(temp) && !test.contains(temp)) {
                test += temp;
                swap = strings[i];
                strings[i] = strings[map.get(temp)];
                strings[map.get(temp)] = swap;
                map.remove(temp);
            }
        }
        return strings;

    }


}
