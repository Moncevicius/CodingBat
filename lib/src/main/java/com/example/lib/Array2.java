package com.example.lib;

import java.util.Arrays;

public class Array2 {

    /**
     * Exercise 1
     * <p>
     * Return the number of even ints in the given array. Note: the % "mod" operator computes
     * the remainder, e.g. 5 % 2 is 1.
     * <p>
     * countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3
     * countEvens([1, 3, 5]) → 0
     */

    public int countEvens(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;

    }

    /**
     * Exercie 2
     * <p>
     * Given an array length 1 or more of ints, return the difference between the largest and
     * smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
     * methods return the smaller or larger of two values.
     * <p>
     * bigDiff([10, 3, 5, 6]) → 7
     * bigDiff([7, 2, 10, 9]) → 8
     * bigDiff([2, 10, 7, 2]) → 8
     */

    public int bigDiff(int[] nums) {

        int small = nums[0];
        int big = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            }
            if (nums[i] > big) {
                big = nums[i];
            }
        }

        return big - small;

    }

    /**
     * Exercise 3
     * <p>
     * Return the "centered" average of an array of ints, which we'll say is the mean average
     * of the values, except ignoring the largest and smallest values in the array.
     * If there are multiple copies of the smallest value, ignore just one copy, and
     * likewise for the largest value. Use int division to produce the final average.
     * You may assume that the array is length 3 or more.
     * <p>
     * centeredAverage([1, 2, 3, 4, 100]) → 3
     * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
     * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */

    public int centeredAverage(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }

        return sum / (nums.length - 2);

    }

    /**
     * Exercise 4
     * <p>
     * Return the sum of the numbers in the array, returning 0 for an empty array. Except the
     * number 13 is very unlucky, so it does not count and numbers that come immediately
     * after a 13 also do not count.
     * <p>
     * sum13([1, 2, 2, 1]) → 6
     * sum13([1, 1]) → 2
     * sum13([1, 2, 2, 1, 13]) → 6
     */

    public int sum13(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];
        }

        return sum;

    }

    /**
     * Exercise 5
     * <p>
     * Return the sum of the numbers in the array, except ignore sections of numbers
     * starting with a 6 and extending to the next 7 (every 6 will be followed by at least
     * one 7). Return 0 for no numbers.
     * <p>
     * sum67([1, 2, 2]) → 5
     * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     * sum67([1, 1, 6, 7, 2]) → 4
     */

    public int sum67(int[] nums) {

        int sum = 0;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (!found && nums[i] == 6) {
                found = true;
            }
            if (found) {
                if (nums[i] == 7) {
                    found = false;
                    continue;
                }
                continue;
            }
            sum += nums[i];
        }
        return sum;

    }

    /**
     * Exercise 6
     * <p>
     * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
     * <p>
     * has22([1, 2, 2]) → true
     * has22([1, 2, 1, 2]) → false
     * has22([2, 1, 2]) → false
     */

    public boolean has22(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;

    }

    /**
     * Exercise 7
     * <p>
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * <p>
     * lucky13([0, 2, 4]) → true
     * lucky13([1, 2, 3]) → false
     * lucky13([1, 2, 4]) → false
     */

    public boolean lucky13(int[] nums) {

        int one = 0;
        int three = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 3) {
                three++;
            }

        }

        return one == 0 && three == 0;

    }

    /**
     * Exercise 8
     * <p>
     * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
     * <p>
     * sum28([2, 3, 2, 2, 4, 2]) → true
     * sum28([2, 3, 2, 2, 4, 2, 2]) → false
     * sum28([1, 2, 3, 4]) → false
     */

    public boolean sum28(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += 2;
            }
        }

        return sum == 8;

    }

    /**
     * Exercise 9
     * <p>
     * Given an array of ints, return true if the number of 1's is greater than the
     * number of 4's
     * <p>
     * more14([1, 4, 1]) → true
     * more14([1, 4, 1, 4]) → false
     * more14([1, 1]) → true
     */

    public boolean more14(int[] nums) {

        int one = 0;
        int four = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 4) {
                four++;
            }

        }
        return one > four;

    }

    /**
     * Exercise 10
     * <p>
     * Given a number n, create and return a new int array of length n, containing the
     * numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length
     * 0 array. You do not need a separate if-statement for the length-0 case; the for-loop
     * should naturally execute 0 times in that case, so it just works. The syntax to make
     * a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
     * <p>
     * fizzArray(4) → [0, 1, 2, 3]
     * fizzArray(1) → [0]
     * fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     */

    public int[] fizzArray(int n) {

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;

    }

    /**
     * Exercise 11
     * <p>
     * Given an array of ints, return true if every element is a 1 or a 4.
     * <p>
     * only14([1, 4, 1, 4]) → true
     * only14([1, 4, 2, 4]) → false
     * only14([1, 1]) → true
     */

    public boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                continue;
            } else {
                return false;
            }
        }
        return true;

    }

    /**
     * Exercise 12
     * <p>
     * Given a number n, create and return a new string array of length n, containing the
     * strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length
     * 0 array. Note: String.valueOf(xxx) will make the String form of most types.
     * The syntax to make a new string array is: new String[desired_length]
     * (See also: FizzBuzz Code)
     * <p>
     * fizzArray2(4) → ["0", "1", "2", "3"]
     * fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
     * fizzArray2(2) → ["0", "1"]
     */

    public String[] fizzArray2(int n) {

        String[] result = new String[n];

        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(i);
        }

        return result;

    }

    /**
     * Exercise 13
     * <p>
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     * <p>
     * no14([1, 2, 3]) → true
     * no14([1, 2, 3, 4]) → false
     * no14([2, 3, 4]) → true
     */

    public boolean no14(int[] nums) {

        int one = 0;
        int four = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 4) {
                four++;
            }
        }
        return one == 0 || four == 0;
    }

    /**
     * Exercise 14
     * <p>
     * We'll say that a value is "everywhere" in an array if for every pair of adjacent
     * elements in the array, at least one of the pair is that value. Return true if
     * the given value is everywhere in the array.
     * <p>
     * isEverywhere([1, 2, 1, 3], 1) → true
     * isEverywhere([1, 2, 1, 3], 2) → false
     * isEverywhere([1, 2, 1, 3, 4], 1) → false
     */

    public boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                continue;
            } else {
                return false;
            }
        }
        return true;

    }

    /**
     * Exercise 15
     * <p>
     * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next
     * to a 4, but not both.
     * <p>
     * either24([1, 2, 2]) → true
     * either24([4, 4, 1]) → true
     * either24([4, 4, 1, 2, 2]) → false
     */

    public boolean either24(int[] nums) {

        int two = 0;
        int four = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                two++;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                four++;
            }
        }
        return two == 1 ^ four == 1;

    }

    /**
     * Exercise 16
     * <p>
     * Given arrays nums1 and nums2 of the same length, for every element in nums1,
     * consider the corresponding element in nums2 (at the same index). Return the
     * count of the number of times that the two elements differ by 2 or less, but
     * are not equal.
     * <p>
     * matchUp([1, 2, 3], [2, 3, 10]) → 2
     * matchUp([1, 2, 3], [2, 3, 5]) → 3
     * matchUp([1, 2, 3], [2, 3, 3]) → 2
     */

    public int matchUp(int[] nums1, int[] nums2) {

        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }
        return count++;

    }

    /**
     * Exercise 17
     * <p>
     * Given an array of ints, return true if the array contains two 7's next to each other,
     * or there are two 7's separated by one element, such as with {7, 1, 7}.
     * <p>
     * has77([1, 7, 7]) → true
     * has77([1, 7, 1, 7]) → true
     * has77([1, 7, 1, 1, 7]) → false
     */

    public boolean has77(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            }
            if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;

    }

    /**
     * Exercise 18
     * <p>
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere
     * later in the array.
     * <p>
     * has12([1, 3, 2]) → true
     * has12([3, 1, 2]) → true
     * has12([3, 1, 4, 5, 2]) → true
     */

    public boolean has12(int[] nums) {

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (found && nums[i] == 2) {
                return true;
            }
            if (nums[i] == 1) {
                found = true;
            }
        }
        return false;

    }

    /**
     * Exercise 19
     * <p>
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values
     * all next to each other.
     * <p>
     * modThree([2, 1, 3, 5]) → true
     * modThree([2, 1, 2, 5]) → false
     * modThree([2, 4, 2, 5]) → true
     */

    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true;
            }

        }
        return false;
    }

    /**
     * Exercise 20
     * <p>
     * Given an array of ints, return true if the value 3 appears in the array exactly 3
     * times, and no 3's are next to each other.
     * <p>
     * haveThree([3, 1, 3, 1, 3]) → true
     * haveThree([3, 1, 3, 3]) → false
     * haveThree([3, 4, 3, 3, 4]) → false
     */

    public boolean haveThree(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) {
                return false;
            }
            if (nums[i] == 3) {
                count++;
            }

        }
        return count == 3;

    }

    /**
     * Exercise 21
     * <p>
     * Given an array of ints, return true if every 2 that appears in the array is next to
     * another 2.
     * <p>
     * twoTwo([4, 2, 2, 3]) → true
     * twoTwo([2, 2, 4]) → true
     * twoTwo([2, 2, 4, 2]) → false
     */

    public boolean twoTwo(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (nums.length == 1) {
                    return false;
                }
                if (i == 0 && nums.length > 1 && nums[i + 1] != 2) {
                    return false;
                }
                if (i > 0 && i < nums.length - 1) {
                    if (nums[i - 1] == 2 || nums[i + 1] == 2) {
                        continue;
                    } else {
                        return false;
                    }
                }
                if (i == nums.length - 1 && nums.length > 1) {
                    if (nums[i - 1] != 2) {
                        return false;
                    }
                }
            }

        }
        return true;

    }

    /**
     * Exercise 22
     * <p>
     * Return true if the group of N numbers at the start and end of the array are the same.
     * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
     * and false for n=1 and n=3. You may assume that n is in the range 0..nums.length
     * inclusive.
     * <p>
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
     */

    public boolean sameEnds(int[] nums, int len) {
        int end = nums.length - len;

        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[end]) {
                end++;
                continue;
            } else {
                return false;
            }
        }
        return true;

    }

    /**
     * Exercise 23
     * <p>
     * Return true if the array contains, somewhere, three increasing adjacent numbers
     * like .... 4, 5, 6, ... or 23, 24, 25.
     * <p>
     * tripleUp([1, 4, 5, 6, 2]) → true
     * tripleUp([1, 2, 3]) → true
     * tripleUp([1, 2, 4]) → false
     */

    public boolean tripleUp(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) {
                return true;
            }
        }
        return false;

    }

    /**
     * Exercise 24
     * <p>
     * Given start and end numbers, return a new array containing the sequence of integers
     * from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
     * The end number will be greater or equal to the start number. Note that a length-0 array
     * is valid. (See also: FizzBuzz Code)
     * <p>
     * fizzArray3(5, 10) → [5, 6, 7, 8, 9]
     * fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
     * fizzArray3(1, 3) → [1, 2]
     */

    public int[] fizzArray3(int start, int end) {

        int[] result = new int[end - start];

        for (int i = start, j = 0; i < end; i++, j++) {
            result[j] = i;
        }
        return result;

    }

    /**
     * Exercise 25
     * <p>
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * <p>
     * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
     * shiftLeft([1, 2]) → [2, 1]
     * shiftLeft([1]) → [1]
     */

    public int[] shiftLeft(int[] nums) {

        int temp;

        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;

        }
        return nums;

    }

    /**
     * Exercise 26
     * <p>
     * For each multiple of 10 in the given array, change all the values following it to be
     * that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5}
     * yields {2, 10, 10, 10, 20, 20}.
     * <p>
     * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
     * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
     * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */

    public int[] tenRun(int[] nums) {

        boolean found = false;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {

            if (found) {
                if (nums[i] % 10 == 0) {
                    temp = nums[i];
                } else {
                    nums[i] = temp;
                }
            }
            if (!found) {
                if (nums[i] % 10 == 0) {
                    temp = nums[i];
                    found = true;
                }
            }

        }
        return nums;

    }

    /**
     * Exercise 27
     * <p>
     * Given a non-empty array of ints, return a new array containing the elements from the
     * original array that come before the first 4 in the original array. The original array
     * will contain at least one 4. Note that it is valid in java to create an array of
     * length 0.
     * <p>
     * pre4([1, 2, 4, 1]) → [1, 2]
     * pre4([3, 1, 4]) → [3, 1]
     * pre4([1, 4, 4]) → [1]
     */

    public int[] pre4(int[] nums) {

        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                end = i;
                break;
            }
        }
        int[] result = new int[end];

        for (int i = 0; i < end; i++) {
            result[i] = nums[i];
        }

        return result;

    }

    /**
     * Exercise 28
     * <p>
     * Given a non-empty array of ints, return a new array containing the elements from the
     * original array that come after the last 4 in the original array. The original array
     * will contain at least one 4. Note that it is valid in java to create an array of
     * length 0.
     * <p>
     * post4([2, 4, 1, 2]) → [1, 2]
     * post4([4, 1, 4, 2]) → [2]
     * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
     */

    public int[] post4(int[] nums) {

        int start = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                start = i;
                break;
            }
        }

        int[] result = new int[nums.length - 1 - start];

        for (int i = 0; i < result.length; i++) {
            result[i] = nums[start + 1];
            start++;
        }

        return result;

    }

    /**
     * Exercise 29
     * <p>
     * We'll say that an element in an array is "alone" if there are values before and after
     * it, and those values are different from it. Return a version of the given array where
     * every instance of the given value which is alone is replaced by whichever value to
     * its left or right is larger.
     * <p>
     * notAlone([1, 2, 3], 2) → [1, 3, 3]
     * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
     * notAlone([3, 4], 3) → [3, 4]
     */

    public int[] notAlone(int[] nums, int val) {

        //int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] == val) {
                if (nums[i - 1] == val || nums[i + 1] == val) {
                    continue;
                } else {
                    nums[i] = Math.max(nums[i - 1], nums[i + 1]);
                }
            }
        }

        return nums;

    }

    /**
     * Exercise 30
     * <p>
     * Return an array that contains the exact same numbers as the given array, but
     * rearranged so that all the zeros are grouped at the start of the array. The order of
     * the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may
     * modify and return the given array or make a new array.
     * <p>
     * zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
     * zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
     * zeroFront([1, 0]) → [0, 1]
     */

    public int[] zeroFront(int[] nums) {

        int[] result = new int[nums.length];
        int first = 0;
        int second = result.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[first] = 0;
                first++;
            } else {
                result[second] = nums[i];
                second--;
            }
        }

        return result;

    }

    /**
     * Exercise 31
     * <p>
     * Return a version of the given array where all the 10's have been removed. The
     * remaining elements should shift left towards the start of the array as needed,
     * and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields
     * {1, 2, 0, 0}. You may modify and return the given array or make a new array.
     * <p>
     * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
     * withoutTen([10, 2, 10]) → [2, 0, 0]
     * withoutTen([1, 99, 10]) → [1, 99, 0]
     */

    public int[] withoutTen(int[] nums) {

        int[] result = new int[nums.length];
        int first = 0;

        for (int i = 0; i < result.length; i++) {

            if (nums[i] == 10) {
                continue;
            } else {
                result[first] = nums[i];
                first++;
            }
        }
        return result;
    }

    /**
     * Exercise 32
     * <p>
     * Return a version of the given array where each zero value in the array is replaced
     * by the largest odd value to the right of the zero in the array. If there is no odd
     * value to the right of the zero, leave the zero as a zero.
     * <p>
     * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
     * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
     * zeroMax([0, 1, 0]) → [1, 1, 0]
     */

    public int[] zeroMax(int[] nums) {

        int max = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] % 2 != 0) {
                max = Math.max(max, nums[i]);
            }
            if (nums[i] == 0) {
                nums[i] = max;
            }
        }
        return nums;

    }

    /**
     * Exercise 33
     * <p>
     * Return an array that contains the exact same numbers as the given array, but
     * rearranged so that all the even numbers come before all the odd numbers. Other
     * than that, the numbers can be in any order. You may modify and return the given array,
     * or make a new array.
     * <p>
     * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
     * evenOdd([3, 3, 2]) → [2, 3, 3]
     * evenOdd([2, 2, 2]) → [2, 2, 2]
     */

    public int[] evenOdd(int[] nums) {

        int[] result = new int[nums.length];
        int start = 0;
        int end = result.length - 1;

        for (int i = 0; i < result.length; i++) {
            if (nums[i] % 2 == 0) {
                result[start] = nums[i];
                start++;
            } else {
                result[end] = nums[i];
                end--;
            }
        }

        return result;

    }

    /**
     * Exercise 34
     * <p>
     * This is slightly more difficult version of the famous FizzBuzz problem which is
     * sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.)
     * Consider the series of numbers beginning at start and running up to but not
     * including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
     * Return a new String[] array containing the string form of these numbers, except for
     * multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz",
     * and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx)
     * will make the String form of an int or other type. This version is a little more
     * complicated than the usual version since you have to allocate and index into an
     * array instead of just printing, and we vary the start/end instead of just always
     * doing 1..100.
     * <p>
     * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
     * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
     * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
     */

    public String[] fizzBuzz(int start, int end) {

        String[] result = new String[end - start];

        for (int i = 0; i < result.length; i++, start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (start % 5 == 0) {
                result[i] = "Buzz";
            } else if (start % 3 == 0) {
                result[i] = "Fizz";
            } else {
                result[i] = String.valueOf(start);
            }

        }

        return result;

    }

}
