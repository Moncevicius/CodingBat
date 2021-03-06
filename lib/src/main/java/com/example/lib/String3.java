package com.example.lib;


public class String3 {

    /**
     * Exercise 1
     * <p>
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
     * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
     * We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char
     * is an alphabetic letter.)
     * <p>
     * countYZ("fez day") → 2
     * countYZ("day fez") → 2
     * countYZ("day fyyyz") → 2
     */

    public int countYZ(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z')
                    && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
            if (i == str.length() - 1 && (str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z')) {
                count++;
            }

        }

        return count;

    }

    /**
     * Exercise 2
     * <p>
     * Given two strings, base and remove, return a version of the base string where all
     * instances of the remove string have been removed (not case sensitive). You may assume
     * that the remove string is length 1 or more. Remove only non-overlapping instances,
     * so with "xxx" removing "xx" leaves "x".
     * <p>
     * withoutString("Hello there", "llo") → "He there"
     * withoutString("Hello there", "e") → "Hllo thr"
     * withoutString("Hello there", "x") → "Hello there"
     */

    public String withoutString(String base, String remove) {

        String result = "";
        int len = remove.length();

        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - len
                    && base.toLowerCase().substring(i, i + len).equals(remove.toLowerCase())) {
                i += len - 1;
                continue;
            }
            result = result + base.charAt(i);

        }

        return result;

    }

    /**
     * Exercise 3
     * <p>
     * Given a string, return true if the number of appearances of "is" anywhere in the
     * string is equal to the number of appearances of "not" anywhere in the string
     * (case sensitive).
     * <p>
     * equalIsNot("This is not") → false
     * equalIsNot("This is notnot") → true
     * equalIsNot("noisxxnotyynotxisi") → true
     */

    public boolean equalIsNot(String str) {

        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.substring(i, i + 2).equals("is")) {
                countOne++;
            }
            if (i < str.length() - 2 && str.substring(i, i + 3).equals("not")) {
                countTwo++;
            }

        }

        return countOne == countTwo;

    }

    /**
     * Exercise 4
     * <p>
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
     * immediately to its left or right. Return true if all the g's in the given
     * string are happy.
     * <p>
     * gHappy("xxggxx") → true
     * gHappy("xxgxx") → false
     * gHappy("xxggyygxx") → false
     */

    public boolean gHappy(String str) {

        if (str.length() == 1) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 & str.charAt(i) == 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
            if (i > 0 && i < str.length() - 1 && str.charAt(i) == 'g') {
                if (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g') {
                    continue;
                } else {
                    return false;
                }
            }
            if (i == str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i - 1) != 'g') {
                return false;
            }

        }
        return true;


    }

    /**
     * Exercise 5
     * <p>
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * <p>
     * countTriple("abcXXXabc") → 1
     * countTriple("xxxabyyyycd") → 3
     * countTriple("a") → 0
     */

    public int countTriple(String str) {

        int count = 0;
        int check = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1, k = 0; k < 2 && j < str.length(); j++, k++) {
                if (str.charAt(i) == str.charAt(j)) {
                    check++;
                }
                if (check == 2) {
                    count++;
                }
            }
            check = 0;


        }

        return count;

    }

    /**
     * Exercise 6
     * <p>
     * Given a string, return the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters. Return 0 if there are no digits in the string.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     * <p>
     * sumDigits("aa1bc2d3") → 6
     * sumDigits("aa11b33") → 8
     * sumDigits("Chocolate") → 0
     */

    public int sumDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }

        }

        return sum;

    }

    /**
     * Exercise 7
     * <p>
     * Given a string, return the longest substring that appears at both the beginning and
     * end of the string without overlapping. For example, sameEnds("abXab") is "ab".
     * <p>
     * sameEnds("abXYab") → "ab"
     * sameEnds("xx") → "x"
     * sameEnds("xxx") → "x"
     */

    public String sameEnds(String string) {

        int mid = string.length() / 2;
        int end = string.length();
        String result = "";

        for (int i = 1; i <= mid; i++) {
            if (string.substring(0, i).equals(string.substring(end - i))) {
                if (result.length() < string.substring(0, i).length()) {
                    result = string.substring(0, i);
                }
            }

        }
        return result;

    }

    /**
     * Exercise 8
     * <p>
     * Given a string, look for a mirror image (backwards) string at both the beginning and
     * end of the given string. In other words, zero or more characters at the very
     * begining of the given string, and at the very end of the string in reverse order
     * (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
     * <p>
     * mirrorEnds("abXYZba") → "ab"
     * mirrorEnds("abca") → "a"
     * mirrorEnds("aba") → "aba"
     */

    public String mirrorEnds(String string) {

        String result = "";
        int end = string.length() - 1;

        for (int i = 0; i < string.length(); i++, end--) {
            if (string.charAt(i) == string.charAt(end)) {
                result = result + string.charAt(i);
            } else {
                break;
            }
        }
        return result;

    }

    /**
     * Exercise 9
     * <p>
     * Given a string, return the length of the largest "block" in the string. A block is a
     * run of adjacent chars that are the same.
     * <p>
     * maxBlock("hoopla") → 2
     * maxBlock("abbCCCddBBBxx") → 3
     * maxBlock("") → 0
     */

    public int maxBlock(String str) {

        int count = 1;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (max < count) {
                max = count;
            }
            count = 1;

        }
        return max;
    }

    /**
     * Exercise 10
     * <p>
     * Given a string, return the sum of the numbers appearing in the string, ignoring all
     * other characters. A number is a series of 1 or more digit chars in a row.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     * <p>
     * sumNumbers("abc123xyz") → 123
     * sumNumbers("aa11b33") → 44
     * sumNumbers("7 11") → 18
     */

    public int sumNumbers(String str) {

        String number = "0";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                number += str.charAt(i);
            } else {
                sum = sum + Integer.parseInt(number);
                number = "0";
            }
        }
        sum = sum + Integer.parseInt(number);
        return sum;

    }

    /**
     * Exercise 11
     * <p>
     * Given a string, return a string where every appearance of the lowercase word "is"
     * has been replaced with "is not". The word "is" should not be immediately preceeded or
     * followed by a letter -- so for example the "is" in "this" does not count.
     * (Note: Character.isLetter(char) tests if a char is a letter.)
     * <p>
     * notReplace("is test") → "is not test"
     * notReplace("is-is") → "is not-is not"
     * notReplace("This is right") → "This is not right"
     */

    public String notReplace(String str) {

        String result = "";
        if (str.equals("is")) {
            return "is not";
        }

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 && str.length() >= 2) {
                if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's' &&
                        !Character.isLetter(str.charAt(i + 2))) {
                    result += "is not";
                    i++;
                    continue;
                }
            }

            if (i > 0 && i < str.length() - 2) {
                if (!Character.isLetter(str.charAt(i - 1)) && str.charAt(i) == 'i'
                        && str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i + 2))) {
                    result += "is not";
                    i++;
                    continue;
                }
            }

            if (i == str.length() - 2) {
                if (!Character.isLetter(str.charAt(i - 1)) && str.charAt(i) == 'i'
                        && str.charAt(i + 1) == 's') {
                    result += "is not";
                    i++;
                    continue;
                }
            }

            result = result + str.charAt(i);

        }

        return result;
    }

}

