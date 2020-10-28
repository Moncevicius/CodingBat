package com.example.lib;

import java.util.List;

public class Functional2 {

    /**
     * Exercise 1
     * <p>
     * Given a list of integers, return a list of the integers, omitting any
     * that are less than 0.
     * <p>
     * noNeg([1, -2]) â†’ [1]
     * noNeg([-3, -3, 3, 3]) â†’ [3, 3]
     * noNeg([-1, -1, -1]) â†’ []
     */

    public List<Integer> noNeg(List<Integer> nums) {

        nums.removeIf(n -> n < 0);
        return nums;

    }

    /**
     * Exercise 2
     * <p>
     * Given a list of non-negative integers, return a list of those numbers except
     * omitting any that end with 9. (Note: % by 10)
     * <p>
     * no9([1, 2, 19]) â†’ [1, 2]
     * no9([9, 19, 29, 3]) â†’ [3]
     * no9([1, 2, 3]) â†’ [1, 2, 3]
     */

    public List<Integer> no9(List<Integer> nums) {

        nums.removeIf(n -> n % 10 == 9);
        return nums;

    }

    /**
     * Exercise 3
     * <p>
     * Given a list of integers, return a list of those numbers, omitting any that are
     * between 13 and 19 inclusive.
     * <p>
     * noTeen([12, 13, 19, 20]) â†’ [12, 20]
     * noTeen([1, 14, 1]) â†’ [1, 1]
     * noTeen([15]) â†’ []
     */

    public List<Integer> noTeen(List<Integer> nums) {

        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;

    }

    /**
     * Exercise 4
     * <p>
     * Given a list of strings, return a list of the strings, omitting any string that
     * contains a "z". (Note: the str.contains(x) method returns a boolean)
     * <p>
     * noZ(["aaa", "bbb", "aza"]) â†’ ["aaa", "bbb"]
     * noZ(["hziz", "hzello", "hi"]) â†’ ["hi"]
     * noZ(["hello", "howz", "are", "youz"]) â†’ ["hello", "are"]
     */

    public List<String> noZ(List<String> strings) {

        strings.removeIf(n -> n.contains("z"));
        return strings;

    }

    /**
     * Exercise 5
     * <p>
     * Given a list of strings, return a list of the strings, omitting any string length
     * 4 or more.
     * <p>
     * noLong(["this", "not", "too", "long"]) â†’ ["not", "too"]
     * noLong(["a", "bbb", "cccc"]) â†’ ["a", "bbb"]
     * noLong(["cccc", "cccc", "cccc"]) â†’ []
     */

    public List<String> noLong(List<String> strings) {

        strings.removeIf(n -> n.length() >= 4);
        return strings;

    }

    /**
     * Exercise 6
     * <p>
     * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
     * <p>
     * no34(["a", "bb", "ccc"]) â†’ ["a", "bb"]
     * no34(["a", "bb", "ccc", "dddd"]) â†’ ["a", "bb"]
     * no34(["ccc", "dddd", "apple"]) â†’ ["apple"]
     */

    public List<String> no34(List<String> strings) {

        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;

    }

    /**
     * Exercise 7
     * <p>
     * Given a list of strings, return a list where each string has "y" added at its end,
     * omitting any resulting strings that contain "yy" as a substring anywhere.
     * <p>
     * noYY(["a", "b", "c"]) â†’ ["ay", "by", "cy"]
     * noYY(["a", "b", "cy"]) â†’ ["ay", "by"]
     * noYY(["xx", "ya", "zz"]) â†’ ["xxy", "yay", "zzy"]
     */

    public List<String> noYY(List<String> strings) {

        strings.replaceAll(n -> n + 'y');
        strings.removeIf(n -> n.contains("yy"));
        return strings;

    }

    /**
     * Exercise 8
     * <p>
     * Given a list of non-negative integers, return a list of those numbers multiplied by 2,
     * omitting any of the resulting numbers that end in 2.
     * <p>
     * two2([1, 2, 3]) â†’ [4, 6]
     * two2([2, 6, 11]) â†’ [4]
     * two2([0]) â†’ [0]
     */

    public List<Integer> two2(List<Integer> nums) {

        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;

    }

    /**
     * Exercise 9
     * <p>
     * Given a list of integers, return a list of those numbers squared and the product
     * added to 10, omitting any of the resulting numbers that end in 5 or 6.
     * <p>
     * square56([3, 1, 4]) â†’ [19, 11]
     * square56([1]) â†’ [11]
     * square56([2]) â†’ [14]
     */

    public List<Integer> square56(List<Integer> nums) {

        nums.replaceAll(n -> (n * n) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;

    }


}
