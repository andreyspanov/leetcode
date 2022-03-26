package leetcode.leetcode567;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Assertions.assertTrue(Solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void test2() {
        Assertions.assertFalse(Solution.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void test3() {
        Assertions.assertTrue(Solution.checkInclusion("adc", "dcda"));
    }
}
