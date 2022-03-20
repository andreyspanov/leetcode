package leetcode.leetcode189;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        Solution.rotate(arr, 3);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    void test2() {
        int[] arr = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};
        Solution.rotate(arr, 2);
        Assertions.assertArrayEquals(expected, arr);
    }
}
