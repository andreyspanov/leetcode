package leetcode.leetcode977;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        Assertions.assertArrayEquals(expected, Solution.sortedSquares(arr));
    }

    @Test
    void test2() {
        int[] arr = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        Assertions.assertArrayEquals(expected, Solution.sortedSquares(arr));
    }

    @Test
    void test3() {
        int[] arr = {-5, -3, -2, -1};
        int[] expected = {1, 4, 9, 25};
        Assertions.assertArrayEquals(expected, Solution.sortedSquares(arr));
    }
}
