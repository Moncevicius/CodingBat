package com.example.lib;

public class Warmup2 {

    /**
     * Exercise 1
     *
     * Given a string and a non-negative int n, return a larger string that is n copies of
     * the original string.
     *
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n){

        String result = "";

        for(int i=0; i < n; i++){
            result += str;
        }
        return result;

    }

    /**
     * Exercise 2
     *
     * Given a string and a non-negative int n, we'll say that the front of the string is
     * the first 3 chars, or whatever is there if the string is less than length 3.
     * Return n copies of the front;
     *
     * frontTimes("Chocolate", 2) → "ChoCho"
     * frontTimes("Chocolate", 3) → "ChoChoCho"
     * frontTimes("Abc", 3) → "AbcAbcAbc"
     */

    public String frontTimes(String str, int n){

        String front = "", result = "";

        if(str.length() < 3){
            front = str;
        }else{
            front = str.substring(0, 3);
        }

        for(int i=0; i < n; i++){
            result += front;
        }

        return result;
    }

    /**
     * Exercise 3
     *
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed,
     * so "xxx" contains 2 "xx".
     *
     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     */

    public int countXX(String str){

        int count = 0;

        for(int i=0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")) count++;
        }

        return count;

    }

    /**
     * Exercise 4
     *
     * Given a string, return true if the first instance of "x" in the string is immediately
     * followed by another "x".
     *
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     */

    public boolean doubleX(String str){

        for(int i=0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                return true;
            }
            if(str.charAt(i) == 'x' && str.charAt(i+1) != 'x'){
                return false;
            }
        }
        return false;

    }

    /**
     * Exercise 5
     *
     * Given a string, return a new string made of every other char starting with the first,
     * so "Hello" yields "Hlo".
     *
     * stringBits("Hello") → "Hlo"
     * stringBits("Hi") → "H"
     * stringBits("Heeololeo") → "Hello"
     */

    public String stringBits(String str){

        String result = "";

        for(int i=0; i < str.length(); i=i+2){
            result += str.charAt(i);
        }

        return result;

    }

    /**
     * Exercise 6
     *
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     *
     * stringSplosion("Code") → "CCoCodCode"
     * stringSplosion("abc") → "aababc"
     * stringSplosion("ab") → "aab"
     */

    public String stringSplosion(String str){

        String result = "";

        for(int i=0; i <= str.length(); i++){
            result += str.substring(0, i);
        }

        return result;

    }

    /**
     * Exercise 7
     *
     * Given a string, return the count of the number of times that a substring length 2
     * appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields
     * 1 (we won't count the end substring).
     *
     * last2("hixxhi") → 1
     * last2("xaxxaxaxx") → 1
     * last2("axxxaaxx") → 2
     */

    public int last2(String str){

        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        int count = 0;

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) count++;
        }

        return count;

    }

    /**
     * Exercise 8
     *
     * Given an array of ints, return the number of 9's in the array.
     *
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public int arrayCount9(int[] nums){

        int count = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 9) count++;
        }

        return count;

    }

    /**
     * Exercise 9
     *
     * Given an array of ints, return true if one of the first 4 elements in the array is
     * a 9. The array length may be less than 4.
     *
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */

    public boolean arrayFront9(int[] nums){

        for(int i=0; i < nums.length && i < 4; i++){
            if(nums[i] == 9) return true;
        }
        return false;

    }

    /**
     * Exercise 10
     *
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in
     * the array somewhere.
     *
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */

    public boolean array123(int[] nums){

        for(int i=0 ; i < nums.length-2; i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
        }
        return false;

    }

    /**
     * Exercise 11
     *
     * Given 2 strings, a and b, return the number of the positions where they contain the
     * same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
     * and "az" substrings appear in the same place in both strings.
     *
     * stringMatch("xxcaazz", "xxbaaz") → 3
     * stringMatch("abc", "abc") → 2
     * stringMatch("abc", "axc") → 0
     */

    public int stringMatch(String a, String b){
        int count = 0;

        for(int i=0; i < a.length()-1; i++){
            if(i < a.length()-1 && i < b.length()-1) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) count++;
            }
        }

        return count;

    }

    /**
     * Exercise 12
     *
     * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
     *
     * stringX("xxHxix") → "xHix"
     * stringX("abxxxcd") → "abcd"
     * stringX("xabxxxcdx") → "xabcdx"
     */

    public String stringX(String str){

        if(str.length() <= 2){
            return str;
        }

        String result = ""+str.charAt(0);

        for(int i=1; i < str.length()-1; i++){
            if(str.charAt(i) != 'x') result += str.charAt(i);
        }

        return result + str.charAt(str.length()-1);

    }

    /**
     * Exercise 13
     *
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so
     * "kittens" yields "kien".
     *
     * altPairs("kitten") → "kien"
     * altPairs("Chocolate") → "Chole"
     * altPairs("CodingHorror") → "Congrr"
     */

    public String altPairs(String str){

        String result = "";

        for(int i=0; i < str.length(); i=i+4){
            result = result + str.charAt(i);

            if(i < str.length()-1){
                result += str.charAt(i+1);
            }
        }

        return result;

    }

    /**
     * Exercise 14
     *
     * Suppose the string "yak" is unlucky. Given a string, return a version where all the
     * "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
     *
     * stringYak("yakpak") → "pak"
     * stringYak("pakyak") → "pak"
     * stringYak("yak123ya") → "123ya"
     */

    public String stringYak(String str){

        String result = "";

        for(int i=0; i < str.length(); i++){

            if(i < str.length()-2 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                i=i+2;
                continue;
            }
            result += str.charAt(i);

        }
        return result;

    }

    /**
     * Exercise 15
     *
     * Given an array of ints, return the number of times that two 6's are next to
     * each other in the array. Also count instances where the second "6" is actually a 7.
     *
     * array667([6, 6, 2]) → 1
     * array667([6, 6, 2, 6]) → 1
     * array667([6, 7, 2, 6]) → 1
     */

    public int array667(int[] nums){

        int count = 0;

        for(int i=0; i < nums.length-1; i++){
            if(nums[i] == 6){
                if(nums[i+1] == 6 || nums[i+1] == 7) count++;
            }
        }

        return count;

    }

    /**
     * Exercise 16
     *
     * Given an array of ints, we'll say that a triple is a value appearing 3 times in a
     * row in the array. Return true if the array does not contain any triples.
     *
     * noTriples([1, 1, 2, 2, 1]) → true
     * noTriples([1, 1, 2, 2, 2, 1]) → false
     * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */

    public boolean noTriples(int[] nums){

        for(int i=0; i < nums.length-2; i++){
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]) return false;
        }
        return true;

    }

    /**
     * Exercise 17
     *
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
     * followed by the value plus 5, followed by the value minus 1. Additionally
     * the 271 counts even if the "1" differs by 2 or less from the correct value.
     *
     * has271([1, 2, 7, 1]) → true
     * has271([1, 2, 8, 1]) → false
     * has271([2, 7, 1]) → true
     */

    public boolean has271(int[] nums){

        

    }

}
