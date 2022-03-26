package leetcode.leetcode733;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        int[][] arr = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] expected ={{2,2,2},{2,2,0},{2,0,1}};
        Assertions.assertArrayEquals(expected, Solution.floodFill(arr, 1, 1, 2));
    }

    @Test
    void test2() {
        int[][] arr = {{0,0,0},{0,0,0}};
        int[][] expected ={{2,2,2},{2,2,2}};
        Assertions.assertArrayEquals(expected, Solution.floodFill(arr, 0, 0, 2));
    }

    @Test
    void test3() {
        int[][] arr = {{0,0,0},{0,1,1}};
        int[][] expected ={{0,0,0},{0,1,1}};
        Assertions.assertArrayEquals(expected, Solution.floodFill(arr, 1, 1, 1));
    }
}
