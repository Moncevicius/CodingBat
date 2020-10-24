package com.example.lib;

public class Recursion1 {

    /**
     * Exercise 1
     * <p>
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     * <p>
     * factorial(1) â†’ 1
     * factorial(2) â†’ 2
     * factorial(3) â†’ 6
     */

    public int factorial(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    /**
     * Exercise 2
     * <p>
     * We have a number of bunnies and each bunny has two big floppy ears. We want to compute
     * the total number of ears across all the bunnies recursively (without loops or
     * multiplication).
     * <p>
     * bunnyEars(0) â†’ 0
     * bunnyEars(1) â†’ 2
     * bunnyEars(2) â†’ 4
     */

    public int bunnyEars(int bunnies) {

        if (bunnies == 0) {
            return 0;
        }
        if (bunnies == 1) {
            return 2;
        }
        return 2 + bunnyEars(bunnies - 1);

    }

    /**
     * Exercise 3
     * <p>
     * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive
     * definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases).
     * Each subsequent value is the sum of the previous two values, so the whole sequence
     * is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method
     * that returns the nth fibonacci number, with n=0 representing the start of the sequence.
     * <p>
     * fibonacci(0) â†’ 0
     * fibonacci(1) â†’ 1
     * fibonacci(2) â†’ 1
     */

    public int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);

    }

    /**
     * Exercise 4
     * <p>
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have
     * the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of
     * "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
     * <p>
     * bunnyEars2(0) â†’ 0
     * bunnyEars2(1) â†’ 2
     * bunnyEars2(2) â†’ 5
     */

    public int bunnyEars2(int bunnies) {

        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        }
        return 2 + bunnyEars2(bunnies - 1);

    }

    /**
     * Exercise 5
     * <p>
     * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2
     * blocks, the next row has 3 blocks, and so on. Compute recursively
     * (no loops or multiplication) the total number of blocks in such a triangle with
     * the given number of rows.
     * <p>
     * triangle(0) â†’ 0
     * triangle(1) â†’ 1
     * triangle(2) â†’ 3
     */

    public int triangle(int rows) {

        if (rows == 0) {
            return 0;
        }
        if (rows == 1) {
            return 1;
        }
        return rows + triangle(rows - 1);

    }

    /**
     * Exercise 6
     * <p>
     * Given a non-negative int n, return the sum of its digits recursively (no loops).
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * <p>
     * sumDigits(126) â†’ 9
     * sumDigits(49) â†’ 13
     * sumDigits(12) â†’ 3
     */

    public int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);

    }

    /**
     * Exercise 7
     * <p>
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields
     * the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
     * rightmost digit (126 / 10 is 12).
     * <p>
     * count7(717) â†’ 2
     * count7(7) â†’ 1
     * count7(123) â†’ 0
     */

    public int count7(int n) {

        if (n == 0 || n == 1) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    /**
     * Exercise 8
     * <p>
     * Given a non-negative int n, compute recursively (no loops) the count of the
     * occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left
     * counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost
     * digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit
     * (126 / 10 is 12).
     * <p>
     * count8(8) â†’ 1
     * count8(818) â†’ 2
     * count8(8818) â†’ 4
     */

    public int count8(int n) {

        if (n == 0 || n == 1) {
            return 0;
        }
        if (n % 100 == 88) {
            return 2 + count8(n / 10);
        }
        if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);

    }

    /**
     * Exercise 9
     * <p>
     * Given base and n that are both 1 or more, compute recursively (no loops) the value of
     * base to the n power, so powerN(3, 2) is 9 (3 squared).
     * <p>
     * powerN(3, 1) â†’ 3
     * powerN(3, 2) â†’ 9
     * powerN(3, 3) â†’ 27
     */

    public int powerN(int base, int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);

    }

    /**
     * Exercise 10
     * <p>
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars
     * in the string.
     * <p>
     * countX("xxhixx") â†’ 4
     * countX("xhixhix") â†’ 3
     * countX("hi") â†’ 0
     */

    public int countX(String str) {

        if (str.length() == 0) {
            return 0;
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));

    }

    /**
     * Exercise 11
     * <p>
     * Given a string, compute recursively (no loops) the number of times lowercase "hi"
     * appears in the string.
     * <p>
     * countHi("xxhixx") â†’ 1
     * countHi("xhixhix") â†’ 2
     * countHi("hi") â†’ 1
     */

    public int countHi(String str) {

        if (str.length() == 0) {
            return 0;
        }
        if (str.length() > 1 && str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));

    }

    /**
     * Exercise 12
     * <p>
     * Given a string, compute recursively (no loops) a new string where all the lowercase
     * 'x' chars have been changed to 'y' chars.
     * <p>
     * changeXY("codex") â†’ "codey"
     * changeXY("xxhixx") â†’ "yyhiyy"
     * changeXY("xhixhix") â†’ "yhiyhiy"
     */

    public String changeXY(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            return 'y' + changeXY(str.substring(1));
        }
        return str.charAt(0) + changeXY(str.substring(1));

    }

    /**
     * Exercise 13
     * <p>
     * Given a string, compute recursively (no loops) a new string where all appearances
     * of "pi" have been replaced by "3.14".
     * <p>
     * changePi("xpix") â†’ "x3.14x"
     * changePi("pipi") â†’ "3.143.14"
     * changePi("pip") â†’ "3.14p"
     */

    public String changePi(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() > 1 && str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));

    }

    /**
     * Exercise 14
     * <p>
     * Given a string, compute recursively a new string where all the 'x' chars have been
     * removed.
     * <p>
     * noX("xaxb") â†’ "ab"
     * noX("abc") â†’ "abc"
     * noX("xx") â†’ ""
     */

    public String noX(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));

    }

    /**
     * Exercise 15
     * <p>
     * Given an array of ints, compute recursively if the array contains a 6. We'll use the
     * convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array. The initial
     * call will pass in index as 0.
     * <p>
     * array6([1, 6, 4], 0) â†’ true
     * array6([1, 4], 0) â†’ false
     * array6([6], 0) â†’ true
     */

    public boolean array6(int[] nums, int index) {

        if (index == nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);

    }

    /**
     * Exercise 16
     * <p>
     * Given an array of ints, compute recursively the number of times that the value 11
     * appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
     * <p>
     * array11([1, 2, 11], 0) â†’ 1
     * array11([11, 11], 0) â†’ 2
     * array11([1, 2, 3, 4], 0) â†’ 0
     */

    public int array11(int[] nums, int index) {

        if (index == nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);

    }

    /**
     * Exercise 17
     * <p>
     * Given an array of ints, compute recursively if the array contains somewhere a
     * value followed in the array by that value times 10. We'll use the convention of
     * considering only the part of the array that begins at the given index. In this
     * way, a recursive call can pass index+1 to move down the array. The initial call
     * will pass in index as 0.
     * <p>
     * array220([1, 2, 20], 0) â†’ true
     * array220([3, 30], 0) â†’ true
     * array220([3], 0) â†’ false
     */

    public boolean array220(int[] nums, int index) {

        if (nums.length == index || nums.length < 2) {
            return false;
        }
        if (index < nums.length - 1 && nums[index] * 10 == nums[index + 1]) {
            return true;
        }
        return array220(nums, index + 1);

    }

    /**
     * Exercise 18
     * <p>
     * Given a string, compute recursively a new string where all the adjacent chars are
     * now separated by a "*".
     * <p>
     * allStar("hello") â†’ "h*e*l*l*o"
     * allStar("abc") â†’ "a*b*c"
     * allStar("ab") â†’ "a*b"
     */

    public String allStar(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(0) + "*" + allStar(str.substring(1));

    }

    /**
     * Exercise 19
     * <p>
     * Given a string, compute recursively a new string where identical chars that are
     * adjacent in the original string are separated from each other by a "*".
     * <p>
     * pairStar("hello") â†’ "hel*lo"
     * pairStar("xxyy") â†’ "x*xy*y"
     * pairStar("aaaa") â†’ "a*a*a*a"
     */

    public String pairStar(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));

    }

    /**
     * Exercise 20
     * <p>
     * Given a string, compute recursively a new string where all the lowercase 'x' chars
     * have been moved to the end of the string.
     * <p>
     * endX("xxre") â†’ "rexx"
     * endX("xxhixx") â†’ "hixxxx"
     * endX("xhixhix") â†’ "hihixxx"
     */

    public String endX(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            return endX(str.substring(1)) + str.charAt(0);
        }
        return str.charAt(0) + endX(str.substring(1));

    }

    /**
     * Exercise 21
     * <p>
     * We'll say that a "pair" in a string is two instances of a char separated by a char.
     * So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2
     * for A and 1 for x. Recursively compute the number of pairs in the given string.
     * <p>
     * countPairs("axa") â†’ 1
     * countPairs("axax") â†’ 2
     * countPairs("axbx") â†’ 1
     */

    public int countPairs(String str) {

        if (str.length() <= 2) {
            return 0;
        }
        if (str.length() > 2 && str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));

    }

    /**
     * Exercise 22
     * <p>
     * Count recursively the total number of "abc" and "aba" substrings that appear in
     * the given string.
     * <p>
     * countAbc("abc") â†’ 1
     * countAbc("abcxxabc") â†’ 2
     * countAbc("abaxxaba") â†’ 2
     */

    public int countAbc(String str) {

        if (str.length() <= 2) {
            return 0;
        }
        if (str.length() > 2 && str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            if (str.charAt(2) == 'c' || str.charAt(2) == 'a') {
                return 1 + countAbc(str.substring(1));
            }
        }
        return countAbc(str.substring(1));

    }

    /**
     * Exercise 23
     * <p>
     * Given a string, compute recursively (no loops) the number of "11" substrings in the
     * string. The "11" substrings should not overlap.
     * <p>
     * count11("11abc11") â†’ 2
     * count11("abc11x11x11") â†’ 3
     * count11("111") â†’ 1
     */

    public int count11(String str) {

        if (str.length() <= 1) {
            return 0;
        }
        if (str.length() > 1 && str.charAt(0) == '1' && str.charAt(1) == '1') {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));

    }

    /**
     * Exercise 24
     * <p>
     * Given a string, return recursively a "cleaned" string where adjacent chars that
     * are the same have been reduced to a single char. So "yyzzza" yields "yza".
     * <p>
     * stringClean("yyzzza") â†’ "yza"
     * stringClean("abbbcdd") â†’ "abcd"
     * stringClean("Hello") â†’ "Helo"
     */

    public String stringClean(String str) {

        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        if (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
            if (str.length() > 2 && str.charAt(2) == str.charAt(1)) {
                return str.charAt(0) + stringClean(str.substring(3));
            }
            return str.charAt(0) + stringClean(str.substring(2));
        }
        return str.charAt(0) + stringClean(str.substring(1));

    }

    /**
     * Exercise 25
     * <p>
     * Given a string, compute recursively the number of times lowercase "hi" appears in
     * the string, however do not count "hi" that have an 'x' immedately before them.
     * <p>
     * countHi2("ahixhi") â†’ 1
     * countHi2("ahibhi") â†’ 2
     * countHi2("xhixhi") â†’ 0
     */

    public int countHi2(String str) {

        if (str.length() <= 1) {
            return 0;
        }
        if (str.length() == 2 && str.equals("hi")) {
            return 1;
        }
        if (str.length() > 2 && str.charAt(1) == 'h' && str.charAt(2) == 'i') {
            if (str.charAt(0) == 'x') {
                return countHi2(str.substring(3));
            } else {
                return 1 + countHi2(str.substring(3));
            }
        }
        if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));

    }

    /**
     * Exercise 26
     * <p>
     * Given a string that contains a single pair of parenthesis, compute recursively a new
     * string made of only of the parenthesis and their contents, so "xyz(abc)123"
     * yields "(abc)".
     * <p>
     * parenBit("xyz(abc)123") â†’ "(abc)"
     * parenBit("x(hello)") â†’ "(hello)"
     * parenBit("(xy)1") â†’ "(xy)"
     */

    public String parenBit(String str) {

        if (str.contains("("))
            return "(" + parenBit(str.substring(str.indexOf('(') + 1));
        if (str.charAt(0) != ')')
            return str.charAt(0) + parenBit(str.substring(1));
        return
                ")";

    }

    /**
     * Exercise 27
     * <p>
     * Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
     * like "(())" or "((()))". Suggestion: check the first and last chars, and then
     * recur on what's inside them.
     * <p>
     * nestParen("(())") â†’ true
     * nestParen("((()))") â†’ true
     * nestParen("(((x))") â†’ false
     */

    public boolean nestParen(String str) {

        if (str.length() == 1) {
            return false;
        }
        if (str.isEmpty()) {
            return true;
        }
        if (str.length() > 2 && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }
        if (str.length() == 2 && str.charAt(0) == '(' && str.charAt(1) == ')') {
            return true;
        }
        return false;

    }

    /**
     * Exercise 28
     * <p>
     * Given a string and a non-empty substring sub, compute recursively the number of
     * times that sub appears in the string, without the sub strings overlapping.
     * <p>
     * strCount("catcowcat", "cat") â†’ 2
     * strCount("catcowcat", "cow") â†’ 1
     * strCount("catcowcat", "dog") â†’ 0
     */

    public int strCount(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);

    }

    /**
     * Exercise 29
     * <p>
     * Given a string and a non-empty substring sub, compute recursively if at least n
     * copies of sub appear in the string somewhere, possibly with overlapping.
     * N will be non-negative.
     * <p>
     * strCopies("catcowcat", "cat", 2) â†’ true
     * strCopies("catcowcat", "cow", 2) â†’ false
     * strCopies("catcowcat", "cow", 1) â†’ true
     */

    public boolean strCopies(String str, String sub, int n) {

        if (n == 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);

    }

    /**
     * Exercise 30
     * <p>
     * Given a string and a non-empty substring sub, compute recursively the largest
     * substring which starts and ends with sub and return its length.
     * <p>
     * strDist("catcowcat", "cat") â†’ 9
     * strDist("catcowcat", "cow") â†’ 3
     * strDist("cccatcowcatxx", "cat") â†’ 9
     */

    public int strDist(String str, String sub) {

        int len = str.length();
        int slen = sub.length();

        if (len < slen)
            return str.length();
        if (!str.substring(0, slen).equals(sub))
            return strDist(str.substring(1), sub);
        if (!str.substring(len - slen).equals(sub))
            return strDist(str.substring(0, len - 1), sub);
        return str.length();

    }


}
