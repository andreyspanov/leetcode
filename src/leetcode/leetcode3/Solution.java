package leetcode.leetcode3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        Map<Character, Integer> map = new HashMap<>();
        int start = 0, max = 0;
        char[] str = s.toCharArray();

        for (int end = 0; end < str.length; end++) {
            Integer previous = map.put(str[end], end);
            if (previous != null) {
                start = Math.max(start, previous + 1);
            }
            max = Math.max(max, end - start + 1);
        }

        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int start = 0, end = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(start++)); //can be replaced with queue.poll
            }
        }

        return max;
    }

}