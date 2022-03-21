package leetcode.leetcode283;

/**
 * https://leetcode.com/problems/move-zeroes/
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */

class Solution {

    public static void moveZeroes(int[] nums) {
        int zero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zero == -1) {
                zero = i;
            }
            if (nums[i] != 0 && zero >= 0) {
                nums[zero++] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int lastNonZeroFoundAt = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[lastNonZeroFoundAt++] = num;
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}