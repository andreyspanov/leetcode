package leetcode.leetcode19;

import leetcode.leetcode19.Solution.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
        Assertions.assertEquals(expected, Solution.removeNthFromEnd(list, 3));
    }

    @Test
    void test2() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        Assertions.assertEquals(expected, Solution.removeNthFromEnd(list, 1));
    }


    @Test
    void test3() {
        ListNode list = new ListNode(1);
        ListNode expected = null;
        Assertions.assertEquals(expected, Solution.removeNthFromEnd(list, 1));
    }

    @Test
    void test4() {
        ListNode list = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2);
        Assertions.assertEquals(expected, Solution.removeNthFromEnd(list, 2));
    }

    @Test
    void test5() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expected = new ListNode(1, new ListNode(3));
        Assertions.assertEquals(expected, Solution.removeNthFromEnd(list, 2));
    }
}
