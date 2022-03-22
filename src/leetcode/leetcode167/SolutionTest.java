package leetcode.leetcode167;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[] arr = {2, 7, 11, 15};
        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, Solution.twoSum(arr, 9));
    }

    @Test
    void test2() {
        int[] arr = {2, 3, 4};
        int[] expected = {1, 3};
        Assertions.assertArrayEquals(expected, Solution.twoSum(arr, 6));
    }

    @Test
    void test3() {
        int[] arr = {-1, 0};
        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, Solution.twoSum(arr, -1));
    }

    @Test
    void test4() {
        int[] arr = {-1, 0, 2, 3, 5, 13, 14};
        int[] expected = {3, 6};
        Assertions.assertArrayEquals(expected, Solution.twoSum(arr, 15));
    }
}
