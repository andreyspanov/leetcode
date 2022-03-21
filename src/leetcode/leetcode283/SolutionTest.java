package leetcode.leetcode283;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[] arr = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        Solution.moveZeroes(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    void test2() {
        int[] arr = {0};
        int[] expected = {0};
        Solution.moveZeroes(arr);
        Assertions.assertArrayEquals(expected, arr);
    }
}
