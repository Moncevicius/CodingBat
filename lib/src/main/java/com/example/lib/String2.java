package com.example.lib;

public class String2 {

    /**
     * Exercise 1
     * <p>
     * Given a string, return a string where for every char in the original, there are two chars.
     * <p>
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public String doubleChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }

        return result;

    }

    /**
     * Exercise 2
     * <p>
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * <p>
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     */

    public int countHi(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }

        return count;

    }

    /**
     * Exercise 3
     * <p>
     * Return true if the string "cat" and "dog" appear the same number of times in the given
     * string.
     * <p>
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     */

    public boolean catDog(String str) {

        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }

        }

        return cat == dog;

    }

    /**
     * Exercise 4
     * <p>
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     * <p>
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     */

    public int countCode(String str) {

        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }

        }

        return count;

    }

    /**
     * Exercise 5
     * <p>
     * Given two strings, return true if either of the strings appears at the very end
     * of the other string, ignoring upper/lower case differences (in other words, the
     * computation should not be "case sensitive"). Note: str.toLowerCase() returns the
     * lowercase version of a string.
     * <p>
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     */

    public boolean endOther(String a, String b) {

        return a.toLowerCase().endsWith(b.toLowerCase())
                || b.toLowerCase().endsWith(a.toLowerCase());

    }

    /**
     * Exercise 6
     * <p>
     * Return true if the given string contains an appearance of "xyz" where the xyz is not
     * directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
     * <p>
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     */

    public boolean xyzThere(String str) {

        if (str.length() < 3) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.substring(0, 3).equals("xyz")) {
                return true;
            } else if (i > 0 && i < str.length() - 2 && str.charAt(i - 1) != '.'
                    && str.substring(i, i + 3).equals("xyz")) {
                return true;
            }
        }

        return false;

    }

    /**
     * Exercise 7
     * <p>
     * Return true if the given string contains a "bob" string, but where the middle 'o'
     * char can be any char.
     * <p>
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     */

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;

    }

    /**
     * Exercise 8
     * <p>
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there
     * exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
     * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
     * <p>
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("yaaxbb") → false
     */

    public boolean xyBalance(String str) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                x++;
            }
            if (str.charAt(i) == 'y' && x > 0) {
                x = 0;
            }
        }
        return x == 0;

    }

    /**
     * Exercise 9
     * <p>
     * Given two strings, a and b, create a bigger string made of the first char of a, the
     * first char of b, the second char of a, the second char of b, and so on. Any leftover
     * chars go at the end of the result.
     * <p>
     * mixString("abc", "xyz") → "axbycz"
     * mixString("Hi", "There") → "HTihere"
     * mixString("xxxx", "There") → "xTxhxexre"
     */

    public String mixString(String a, String b) {

        String result = "";
        int len = Math.max(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (i < a.length()) {
                result = result + a.charAt(i);
            }
            if (i < b.length()) {
                result = result + b.charAt(i);
            }
        }

        return result;

    }

    /**
     * Exercise 10
     * <p>
     * Given a string and an int n, return a string made of n repetitions of the last n
     * characters of the string. You may assume that n is between 0 and the length of the
     * string, inclusive.
     * <p>
     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     */

    public String repeatEnd(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;

    }

    /**
     * Exercise 11
     * <p>
     * Given a string and an int n, return a string made of the first n characters of
     * the string, followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     * <p>
     * repeatFront("Chocolate", 4) → "ChocChoChC"
     * repeatFront("Chocolate", 3) → "ChoChC"
     * repeatFront("Ice Cream", 2) → "IcI"
     */

    public String repeatFront(String str, int n) {

        String result = "";

        for (int i = 0, j = n; i < n; i++, j--) {
            result += str.substring(0, j);
        }

        return result;

    }

    /**
     * Exercise 12
     * <p>
     * Given two strings, word and a separator sep, return a big string made of count
     * occurrences of the word, separated by the separator string.
     * <p>
     * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
     * repeatSeparator("This", "And", 2) → "ThisAndThis"
     * repeatSeparator("This", "And", 1) → "This"
     */

    public String repeatSeperator(String word, String sep, int count) {

        String result = "";

        for (int i = 0, j = count - 1; i < count; i++, j--) {
            result += word;
            if (j != 0) {
                result += sep;
            }
        }

        return result;

    }

    /**
     * Exercise 13
     * <p>
     * Given a string, consider the prefix string made of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string? Assume that the string
     * is not empty and that N is in the range 1..str.length().
     * <p>
     * prefixAgain("abXYabc", 1) → true
     * prefixAgain("abXYabc", 2) → true
     * prefixAgain("abXYabc", 3) → false
     */

    public boolean prefixAgain(String str, int n) {

        String pre = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(pre)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Exercise 14
     * <p>
     * Given a string, does "xyz" appear in the middle of the string? To define middle,
     * we'll say that the number of chars to the left and right of the "xyz" must differ
     * by at most one. This problem is harder than it looks.
     * <p>
     * xyzMiddle("AAxyzBB") → true
     * xyzMiddle("AxyzBB") → true
     * xyzMiddle("AxyzBBB") → false
     */

    public boolean xyzMiddle(String str) {

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 3).equals("xyz")) {

                int beginning = str.substring(0, i).length();
                int ending = str.substring(i + 3).length();

                if (Math.abs(beginning - ending) <= 1) {
                    return true;
                }

            }

        }

        return false;

    }

    /**
     * Exercise 15
     * <p>
     * A sandwich is two pieces of bread with something in between. Return the string that is
     * between the first and last appearance of "bread" in the given string, or return the
     * empty string "" if there are not two pieces of bread.
     * <p>
     * getSandwich("breadjambread") → "jam"
     * getSandwich("xxbreadjambreadyy") → "jam"
     * getSandwich("xxbreadyy") → ""
     */

    public String getSandwich(String str) {

        int count = 0;
        int last = 0;

        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                count++;
                for (int j = i + 4; j < str.length() - 4; j++) {
                    if (str.substring(j, j + 5).equals("bread")) {
                        count++;
                        last = j;
                    }
                }
                if (count > 1) {
                    return str.substring(i + 5, last);
                }

            }
        }
        return "";

    }

    /**
     * Exercise 16
     * <p>
     * Returns true if for every '*' (star) in the string, if there are chars both immediately
     * before and after the star, they are the same.
     * <p>
     * sameStarChar("xy*yzz") → true
     * sameStarChar("xy*zzz") → false
     * sameStarChar("*xa*az") → true
     */

    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }

        }
        return true;

    }

    /**
     * Exercise 17
     * <p>
     * Given a string, compute a new string by moving the first char to come after the next
     * two chars, so "abc" yields "bca". Repeat this process for each subsequent group
     * of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at
     * the end.
     * <p>
     * oneTwo("abc") → "bca"
     * oneTwo("tca") → "cat"
     * oneTwo("tcagdo") → "catdog"
     */

    public String oneTwo(String str) {

        String result = "";

        for (int i = 0; i < str.length() - 2; i = i + 3) {

            result = result + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);

        }
        return result;

    }

    /**
     * Exercise 18
     * <p>
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z'
     * and ending with 'p'. Return a string where for all such words, the middle letter is
     * gone, so "zipXzap" yields "zpXzp".
     * <p>
     * zipZap("zipXzap") → "zpXzp"
     * zipZap("zopzop") → "zpzp"
     * zipZap("zzzopzop") → "zzzpzp"
     */

    public String zipZap(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i += 2;
            } else {
                result = result + str.charAt(i);
            }

        }

        return result;

    }

    /**
     * Exercise 19
     * <p>
     * Return a version of the given string, where for every star (*) in the string the star
     * and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and
     * "ab**cd" also yields "ad".
     * <p>
     * starOut("ab*cd") → "ad"
     * starOut("ab**cd") → "ad"
     * starOut("sm*eilly") → "silly"
     */

    public String starOut(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*'))
                continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*')
                continue;
            result = result + str.charAt(i);
        }
        return result;
    }

    /**
     * Exercise 20
     * <p>
     * Given a string and a non-empty word string, return a version of the original String
     * where all chars have been replaced by pluses ("+"), except for appearances of
     * the word string which are preserved unchanged.
     * <p>
     * plusOut("12xy34", "xy") → "++xy++"
     * plusOut("12xy34", "1") → "1+++++"
     * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */

    public String plusOut(String str, String word) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - (word.length() - 1)
                    && str.substring(i, i + word.length()).equals(word)) {
                i += word.length() - 1;
                result += word;
            } else {
                result = result + "+";
            }

        }

        return result;

    }

    /**
     * Exercise 21
     * <p>
     * Given a string and a non-empty word string, return a string made of each char just
     * before and just after every appearance of the word in the string. Ignore cases
     * where there is no char before or after the word, and a char may be included
     * twice if it is between two words.
     * <p>
     * wordEnds("abcXY123XYijk", "XY") → "c13i"
     * wordEnds("XY123XY", "XY") → "13"
     * wordEnds("XY1XY", "XY") → "11"
     */

    public String wordEnds(String str, String word) {

        String result = "";
        int loop = word.length();

        if (str.length() == loop) return "";

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - loop && str.substring(i, i + loop).equals(word)) {
                if (i == 0) {
                    result = result + str.charAt(i + loop);
                }
                if (i > 0) {
                    result = result + str.charAt(i - 1) + str.charAt(i + loop);
                }
                i += loop;
            }
            if (i == str.length() - loop && str.substring(i, i + loop).equals(word)) {
                result = result + str.charAt(i - 1);
            }
        }
        return result;


    }

}
