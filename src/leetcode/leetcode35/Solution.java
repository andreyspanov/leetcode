package leetcode.leetcode35;

/**
 * https://leetcode.com/problems/search-insert-position/
 * <p>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */

class Solution {

    /**
     * Time complexity : O(log N)
     * Space complexity : O(1)
     */
    public static int searchInsert(int[] nums, int target) {
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
        return l;
    }

}