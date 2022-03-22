package leetcode.leetcode344;

/**
 * https://leetcode.com/problems/rotate-array/
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
class Solution {
    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}