package leetcode.leetcode3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void test3() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
    }


    @Test
    void test4() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("dvdf"));
    }
}
