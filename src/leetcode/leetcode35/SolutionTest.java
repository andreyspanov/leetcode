package leetcode.leetcode35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[] arr = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        Assertions.assertEquals(expected, Solution.searchInsert(arr, target));
    }

    @Test
    void test2() {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        Assertions.assertEquals(expected, Solution.searchInsert(arr, target));
    }

    @Test
    void test3() {
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        Assertions.assertEquals(expected, Solution.searchInsert(arr, target));
    }

    @Test
    void test4() {
        int[] arr = {1};
        int target = 0;
        int expected = 0;
        Assertions.assertEquals(expected, Solution.searchInsert(arr, target));
    }
}
