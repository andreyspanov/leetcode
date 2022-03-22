package leetcode.leetcode167;

/**
 * https://leetcode.com/problems/move-zeroes/
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */

class Solution {

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            }

            if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[0];
    }
}