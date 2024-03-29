package com.codekata.leetcode.interview75.first25;

/**
 * The type Pivot index.
 */
public class PivotIndex {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //https://leetcode.com/problems/find-pivot-index/

        int[] nums = {1,7,3,6,5,6};
        System.out.print(pivotIndex(nums));
    }

    /**
     * Pivot index int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int pivotIndex(int[] nums) {
        ///int totalSum = IntStream.of(nums).sum(); //4ms
        int totalSum = 0;
        for (int num : nums) { //1ms
            totalSum += num;
        }
        int sumLeft = 0;
        int sumRight = totalSum;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                sumLeft += nums[i - 1];
            }
            sumRight -= nums[i];
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Pivot index slow int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int pivotIndexSlow(int[] nums) { //378ms
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                sumLeft += nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                sumRight += nums[j];
            }
            if (sumLeft == sumRight) {
                return i;
            }
            sumLeft = 0;
            sumRight = 0;
        }
        return -1;
    }
}

