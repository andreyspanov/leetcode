package leetcode.leetcode189;

/**
 * https://leetcode.com/problems/rotate-array/
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
class Solution {

    // O(n) time cost, O(1) space cost
    public static void rotate(int[] nums, int k) {
        if (nums.length < 2 || k % nums.length == 0) return;
        k %= nums.length;
        reverse(nums, 0, nums.length - k);
        reverse(nums, nums.length - k, nums.length);
        reverse(nums, 0, nums.length);
    }

    private static void reverse(int[] nums, int l, int r) {
        r--;
        int tmp;
        while (l < r) {
            tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }

    // O(n) time cost, O(k % nums.length) space cost
    public static void rotate2(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }

        k %= nums.length;
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = nums[nums.length - k + i];
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}