package leetcode.leetcode704;

/**
 * https://leetcode.com/problems/binary-search/
 * <p>
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
class Solution {

    /**
     * Time complexity : O(log N)
     * Space complexity : O(1)
     */
    public static int search(int[] nums, int target) {
        int pivot, l = 0, r = nums.length - 1;
        while (l <= r) {
            pivot = l + (r - l) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                l = pivot + 1;
            } else {
                r = pivot - 1;
            }
        }
        return -1;
    }
}