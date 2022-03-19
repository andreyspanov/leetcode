package leetcode.leetcode278;

/**
 * https://leetcode.com/problems/first-bad-version/discuss/71386/An-clear-way-to-use-binary-search
 * <p>
 * You are a product manager and currently leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check. Since each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 */

class Solution {
    private final int firstBadVersion;

    public Solution(int firstBadVersion) {
        this.firstBadVersion = firstBadVersion;
    }

    /**
     * Time complexity : O(log N)
     * Space complexity : O(1)
     */
    public int firstBadVersion(int n) {
        int mid, l = 1, r = n;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }
}