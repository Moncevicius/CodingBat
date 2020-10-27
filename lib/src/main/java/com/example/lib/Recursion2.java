package com.example.lib;

public class Recursion2 {

    /**
     * Exercise 1
     * <p>
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target? This is a classic
     * backtracking recursion problem. Once you understand the recursive
     * backtracking strategy in this problem, you can use the same pattern for
     * many problems to search a space of choices. Rather than looking at the
     * whole array, our convention is to consider the part of the array starting
     * at index start and continuing to the end of the array. The caller can
     * specify the whole array simply by passing start as 0. No loops are
     * needed -- the recursive calls progress down the array.
     * <p>
     * groupSum(0, [2, 4, 8], 10) â†’ true
     * groupSum(0, [2, 4, 8], 14) â†’ true
     * groupSum(0, [2, 4, 8], 9) â†’ false
     */

    static boolean groupSum(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        if (groupSum(start + 1, nums, target - nums[start]))
            return true;
        if (groupSum(start + 1, nums, target))
            return true;
        return false;
    }

    /**
     * Exercise 2
     * <p>
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, beginning at the start index, such that the group sums to the given
     * target? However, with the additional constraint that all 6's must be
     * chosen. (No loops needed.)
     * <p>
     * groupSum6(0, [5, 6, 2], 8) â†’ true
     * groupSum6(0, [5, 6, 2], 9) â†’ false
     * groupSum6(0, [5, 6, 2], 7) â†’ false
     */

    static boolean groupSum6(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        if (groupSum6(start + 1, nums, target - nums[start]))
            return true;
        if (nums[start] != 6 && groupSum6(start + 1, nums, target))
            return true;

        return false;
    }

    /**
     * Exercise 3
     * <p>
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target with this additional
     * constraint: If a value in the array is chosen to be in the group, the value
     * immediately following it in the array must not be chosen. (No loops needed.)
     * <p>
     * groupNoAdj(0, [2, 5, 10, 4], 12) â†’ true
     * groupNoAdj(0, [2, 5, 10, 4], 14) â†’ false
     * groupNoAdj(0, [2, 5, 10, 4], 7) â†’ false
     */

    static boolean groupNoAdj(int start, int[] nums, int target) {

        if (start >= nums.length)
            return target == 0;

        if (groupNoAdj(start + 2, nums, target - nums[start]))
            return true;

        if (groupNoAdj(start + 1, nums, target))
            return true;

        return false;
    }


}
