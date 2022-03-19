package leetcode.leetcode278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        var badVersion = 4;
        var solution = new Solution(badVersion);
        Assertions.assertEquals(badVersion, solution.firstBadVersion(5));
    }

    @Test
    void test2() {
        var badVersion = 1;
        var solution = new Solution(badVersion);
        Assertions.assertEquals(badVersion, solution.firstBadVersion(1));
    }

    @Test
    void test3() {
        var badVersion = 2;
        var solution = new Solution(badVersion);
        Assertions.assertEquals(badVersion, solution.firstBadVersion(2));
    }
}
