package leetcode.leetcode557;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        String words = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        Assertions.assertEquals(expected, Solution.reverseWords(words));
    }

    @Test
    void test2() {
        String words = "God Ding";
        String expected = "doG gniD";
        Assertions.assertEquals(expected, Solution.reverseWords(words));
    }
}
