package leetcode.leetcode557;

class Solution {
    public static String reverseWords(String s) {
        char[] words = s.toCharArray();
        int wordStart = 0;
        for (int i = 0; i < s.length(); i++) {
            if (words[i] == ' ') {
                revers(words, wordStart, i - 1);
                wordStart = i + 1;
            }
        }
        revers(words, wordStart, words.length - 1);
        return String.valueOf(words);
    }

    private static void revers(char[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private static void swap(char[] nums, int i, int j) {
        char t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}