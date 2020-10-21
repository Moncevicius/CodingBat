package com.example.lib;

public class Array3 {

    /**
     * Exercise 1
     *
     * Consider the leftmost and righmost appearances of some value in an array. We'll say that
     * the "span" is the number of elements between the two inclusive. A single value has a
     * span of 1. Returns the largest span found in the given array.
     * (Efficiency is not a priority.)
     *
     * maxSpan([1, 2, 1, 1, 3]) â†’ 4
     * maxSpan([1, 4, 2, 1, 4, 1, 4]) â†’ 6
     * maxSpan([1, 4, 2, 1, 4, 4, 4]) â†’ 6
     */

    public int maxSpam(int[] nums){

        int end = 0;
        int max = 0;

        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){

                if(nums[i] == nums[j]){
                    end = j;
                }

            }
            if(max < (end - i) + 1){
                max = (end - i) + 1;
            }
            end = 0;
        }
        return max;

    }

    /**
     * Exercise 2
     *
     * Return an array that contains exactly the same numbers as the given array, but
     * rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
     * but every other number may move. The array contains the same number of 3's and 4's,
     * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
     *
     * fix34([1, 3, 1, 4]) â†’ [1, 3, 4, 1]
     * fix34([1, 3, 1, 4, 4, 3, 1]) â†’ [1, 3, 4, 1, 1, 3, 4]
     * fix34([3, 2, 2, 4]) â†’ [3, 4, 2, 2]
     */

    public int[] fix34(int[] nums){

        for(int i=0 ; i < nums.length; i++){
            if(nums[i] == 3){
                if(nums[i+1] != 4) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if(nums[j] == 4){
                            nums[j] = nums[i+1];
                            nums[i+1] = 4;
                            continue;
                        }
                    }
                }else{
                    continue;
                }
            }
        }

        return nums;

    }

    /**
     * Exercise 3
     *
     * (This is a slightly harder version of the fix34 problem.) Return an array that contains
     * exactly the same numbers as the given array, but rearranged so that every 4 is
     * immediately followed by a 5. Do not move the 4's, but every other number may move.
     * The array contains the same number of 4's and 5's, and every 4 has a number after
     * it that is not a 4. In this version, 5's may appear anywhere in the original array.
     *
     * fix45([5, 4, 9, 4, 9, 5]) â†’ [9, 4, 5, 4, 5, 9]
     * fix45([1, 4, 1, 5]) â†’ [1, 4, 5, 1]
     * fix45([1, 4, 1, 5, 5, 4, 1]) â†’ [1, 4, 5, 1, 1, 4, 5]
     */

    public int[] fix45(int[] nums){

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        if(j > 0 && nums[j-1] == 4){
                            continue;
                        }
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 5;
                        break;
                    }

                }
            }
        }
        return nums;

    }

    /**
     * Exercise 4
     *
     * Given a non-empty array, return true if there is a place to split the array so that the
     * sum of the numbers on one side is equal to the sum of the numbers on the other side.
     *
     * canBalance([1, 1, 1, 2, 1]) â†’ true
     * canBalance([2, 1, 1, 2, 1]) â†’ false
     * canBalance([10, 10]) â†’ true
     */

    public boolean canBalance(int[] nums){

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i < nums.length; i++){
            sum1 += nums[i];
            for(int j=i+1; j < nums.length; j++){

                sum2 += nums[j];

            }
            if(sum1 == sum2){
                return true;
            }
            sum2 = 0;
        }
        return false;

    }

    /**
     * Exercise 5
     *
     * Given two arrays of ints sorted in increasing order, outer and inner, return true if
     * all of the numbers in inner appear in outer. The best solution makes only a single
     * "linear" pass of both arrays, taking advantage of the fact that both arrays are
     * already in sorted order.
     *
     * linearIn([1, 2, 4, 6], [2, 4]) â†’ true
     * linearIn([1, 2, 4, 6], [2, 3, 4]) â†’ false
     * linearIn([1, 2, 4, 4, 6], [2, 4]) â†’ true
     */

    public boolean linearIn(int[] outer, int[] inner){

        int second = 0;

        for(int i=0; i < outer.length; i++){
            if(second != inner.length && outer[i] == inner[second])
                second++;
        }
        return second == inner.length;

    }

    /**
     * Exercise 6
     *
     * Given n>=0, create an array length n*n with the following pattern, shown here for n=3
     * : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
     *
     * squareUp(3) â†’ [0, 0, 1, 0, 2, 1, 3, 2, 1]
     * squareUp(2) â†’ [0, 1, 2, 1]
     * squareUp(4) â†’ [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */

    public int[] squareUp(int n){

        int[] result = new int[n * n];

        if(n == 0){
            return result;
        }

        int temp = n;
        for(int i=result.length; i >= 0; i=i-n){
            for(int j=1; j <= temp; j++){
                result[i-j] = j;
            }
            temp--;
        }

        return result;

    }

    /**
     * Exercise 7
     *
     * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,
     * ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the
     * array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
     *
     * seriesUp(3) â†’ [1, 1, 2, 1, 2, 3]
     * seriesUp(4) â†’ [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
     * seriesUp(2) â†’ [1, 1, 2]
     */

    public int[] seriesUp(int n){

        int[] result = new int[n * ( n + 1 ) / 2];
        int start = 1;
        int finish = 1;

        if(n == 0){
            return result;
        }

        for(int i=0; i < result.length; i++){
            result[i] = start;
            if(start == finish){
                start = 1;
                finish++;
                continue;
            }
            start++;
        }

        return result;

    }

    /**
     * Exercise 8
     *
     * We'll say that a "mirror" section in an array is a group of contiguous elements
     * such that somewhere in the array, the same group appears in reverse order. For
     * example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
     * (the {1, 2, 3} part). Return the size of the largest mirror section found in
     * the given array.
     *
     * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) â†’ 3
     * maxMirror([1, 2, 1, 4]) â†’ 3
     * maxMirror([7, 1, 2, 9, 7, 2, 1]) â†’ 2
     */

    public int maxMirror(int[] nums){

        int count = 0;
        int max = 0;

        for(int i=0; i < nums.length; i++){
            int temp = i;
            for(int j=nums.length-1; j >= 0 && temp < nums.length; j--){
                if(count > 0 && nums[temp] != nums[j]){
                    if(max < count){
                        max = count;
                    }
                    count = 0;
                    continue;
                }
                if(nums[temp] == nums[j]){
                    count++;
                    temp++;
                }
            }
            if(max < count){
                max = count;
            }
            count = 0;
        }
        return max;

    }

    /**
     * Exercise 9
     *
     * Say that a "clump" in an array is a series of 2 or more adjacent elements of the
     * same value. Return the number of clumps in the given array.
     *
     * countClumps([1, 2, 2, 3, 4, 4]) â†’ 2
     * countClumps([1, 1, 2, 1, 1]) â†’ 2
     * countClumps([1, 1, 1, 1, 1]) â†’ 1
     */

    public int countClumps(int[] nums){

        int count = 0;
        int temp = 0;
        boolean found = false;

        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    found = true;
                    temp = j;
                }else{
                    break;
                }
            }
            if(found){
                count++;
                i = temp;
                found = false;
            }
        }
        return count;
    }


}
