package leetcode.leetcode977;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * <p>
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */
class Solution {

    public static int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] arr = new int[nums.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int l2 = nums[l] * nums[l];
            int r2 = nums[r] * nums[r];
            if (l2 < r2) {
                arr[i] = r2;
                r--;
            } else {
                arr[i] = l2;
                l++;
            }
        }
        return arr;
    }
}