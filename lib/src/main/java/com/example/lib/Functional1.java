package com.example.lib;

import java.util.List;

public class Functional1 {

    /**
     * Exercise 1
     * <p>
     * Given a list of integers, return a list where each integer is multiplied by 2.
     * <p>
     * doubling([1, 2, 3]) â†’ [2, 4, 6]
     * doubling([6, 8, 6, 8, -1]) â†’ [12, 16, 12, 16, -2]
     * doubling([]) â†’ []
     */

    public List<Integer> doubling(List<Integer> nums) {

        nums.replaceAll(n -> n * 2);
        return nums;

    }

    /**
     * Exercise 2
     * <p>
     * Given a list of integers, return a list where each integer is multiplied with itself.
     * <p>
     * square([1, 2, 3]) â†’ [1, 4, 9]
     * square([6, 8, -6, -8, 1]) â†’ [36, 64, 36, 64, 1]
     * square([]) â†’ []
     */

    public List<Integer> square(List<Integer> nums) {

        nums.replaceAll(n -> n * n);
        return nums;

    }

    /**
     * Exercise 3
     * <p>
     * Given a list of strings, return a list where each string has "*" added at its end.
     * <p>
     * addStar(["a", "bb", "ccc"]) â†’ ["a*", "bb*", "ccc*"]
     * addStar(["hello", "there"]) â†’ ["hello*", "there*"]
     * addStar(["*"]) â†’ ["**"]
     */

    public List<String> addStar(List<String> strings) {

        strings.replaceAll(n -> n + "*");
        return strings;

    }

    /**
     * Exercise 4
     * <p>
     * Given a list of strings, return a list where each string is replaced by 3 copies of
     * the string concatenated together.
     * <p>
     * copies3(["a", "bb", "ccc"]) â†’ ["aaa", "bbbbbb", "ccccccccc"]
     * copies3(["24", "a", ""]) â†’ ["242424", "aaa", ""]
     * copies3(["hello", "there"]) â†’ ["hellohellohello", "theretherethere"]
     */

    public List<String> copies3(List<String> strings) {

        strings.replaceAll(n -> n + n + n);
        return strings;

    }

    /**
     * Exercise 5
     * <p>
     * Given a list of strings, return a list where each string has "y" added at its start
     * and end.
     * <p>
     * moreY(["a", "b", "c"]) â†’ ["yay", "yby", "ycy"]
     * moreY(["hello", "there"]) â†’ ["yhelloy", "ytherey"]
     * moreY(["yay"]) â†’ ["yyayy"]
     */

    public List<String> moreY(List<String> strings) {

        strings.replaceAll(n -> "y" + n + "y");
        return strings;

    }

    /**
     * Exercise 6
     * <p>
     * Given a list of integers, return a list where each integer is added to 1 and the
     * result is multiplied by 10.
     * <p>
     * math1([1, 2, 3]) â†’ [20, 30, 40]
     * math1([6, 8, 6, 8, 1]) â†’ [70, 90, 70, 90, 20]
     * math1([10]) â†’ [110]
     */

    public List<Integer> math1(List<Integer> nums) {

        nums.replaceAll(n -> (n + 1) * 10);
        return nums;

    }

    /**
     * Exercise 7
     * <p>
     * Given a list of non-negative integers, return an integer list of the rightmost
     * digits. (Note: use %)
     * <p>
     * rightDigit([1, 22, 93]) â†’ [1, 2, 3]
     * rightDigit([16, 8, 886, 8, 1]) â†’ [6, 8, 6, 8, 1]
     * rightDigit([10, 0]) â†’ [0, 0]
     */

    public List<Integer> rightDigit(List<Integer> nums) {

        nums.replaceAll(n -> n % 10);
        return nums;

    }

    /**
     * Exercise 8
     * <p>
     * Given a list of strings, return a list where each string is converted to lower
     * case (Note: String toLowerCase() method).
     * <p>
     * lower(["Hello", "Hi"]) â†’ ["hello", "hi"]
     * lower(["AAA", "BBB", "ccc"]) â†’ ["aaa", "bbb", "ccc"]
     * lower(["KitteN", "ChocolaTE"]) â†’ ["kitten", "chocolate"]
     */

    public List<String> lower(List<String> strings) {

        strings.replaceAll(n -> n.toLowerCase());
        return strings;

    }

    /**
     * Exercise 9
     * <p>
     * Given a list of strings, return a list where each string has all its "x" removed.
     * <p>
     * noX(["ax", "bb", "cx"]) â†’ ["a", "bb", "c"]
     * noX(["xxax", "xbxbx", "xxcx"]) â†’ ["a", "bb", "c"]
     * noX(["x"]) â†’ [""]
     */

    public List<String> noX(List<String> strings) {

        strings.replaceAll(n -> n.replaceAll("x", ""));
        return strings;

    }



}
