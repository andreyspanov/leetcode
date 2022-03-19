package leetcode.leetcode704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expected = 4;
        Assertions.assertEquals(expected, Solution.search(arr, target));
    }

    @Test
    void test2() {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expected = -1;
        Assertions.assertEquals(expected, Solution.search(arr, target));
    }
}
