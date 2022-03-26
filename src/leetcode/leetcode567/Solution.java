package leetcode.leetcode567;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length() || s2.length() == 0) {
            return false;
        } else if (s1.length() == 0) {
            return true;
        }

        int arraySize = 'z' - 'a' + 1;
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        int s1Length = s1.length(), s2Length = s2.length();

        for (int i = 0; i < s1Length; i++) {
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }

        for (int i = s1Length; i < s2Length; i++) {
            if (Arrays.equals(array1, array2)) {
                return true;
            }
            array2[s2.charAt(i) - 'a']++;
            array2[s2.charAt(i - s1Length) - 'a']--;
        }

        return Arrays.equals(array1, array2);
    }

    public static boolean checkInclusion2(String s1, String s2) {
        if (s1.length() > s2.length() || s2.length() == 0) {
            return false;
        } else if (s1.length() == 0) {
            return true;
        }

        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Map.merge(s1.charAt(i), 1, Integer::sum);
            s2Map.merge(s2.charAt(i), 1, Integer::sum);
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (s1Map.equals(s2Map)) {
                return true;
            }
            s2Map.merge(s2.charAt(i), 1, Integer::sum);
            s2Map.merge(s2.charAt(i - s1.length()), 1, (o, n) -> o - n);
            s2Map.remove(s2.charAt(i - s1.length()), 0);
        }

        return s1Map.equals(s2Map);
    }

}