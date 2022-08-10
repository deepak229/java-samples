package com.deepak.strings;

import java.util.Arrays;

/**
 @author narasimha.s
 Date 3/23/22
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Integer[] chars = new Integer[128];
        for(int i=0; i<128;i++) chars[i] = -1;
        int left = 0;
        int right = 0;

        int res = 0;

        while (right < s.length()) {
            final StringBuilder b = new StringBuilder();
            char r = s.charAt(right);

            b.append(String.format("left = %d ,right = %d r=%s(%d) ", left, right, r, (int) r));

            Integer index = chars[r];
            b.append(String.format("index = %d ", index));
            if (index != null && index >= left && index < right) {
                left = index + 1;

                b.append(String.format("new left = %d ", left));
            }

            res = Math.max(res, right - left + 1);
            b.append(String.format("res = %d ", res));
            chars[r] = right;
            right++;
            b.append(String.format("new right = %d ", right));
            System.out.println(b.toString());
            System.out.println(Arrays.toString(chars));
        }

        return res;
    }

    public static void main(String[] args) {
        final String s = "abcdeabmdkloiuyt";

        System.out.println(lengthOfLongestSubstring(s));
    }
}