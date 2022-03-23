package leetcode.leetcode876;

import leetcode.leetcode876.Solution.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));
        Assertions.assertEquals(expected,  Solution.middleNode(list));
    }

    @Test
    void test2() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));
        Assertions.assertEquals(expected,  Solution.middleNode(list));
    }
}
