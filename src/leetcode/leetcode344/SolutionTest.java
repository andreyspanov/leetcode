package leetcode.leetcode344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        Solution.reverseString(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    void test2() {
        char[] arr = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        Solution.reverseString(arr);
        Assertions.assertArrayEquals(expected, arr);
    }
}
