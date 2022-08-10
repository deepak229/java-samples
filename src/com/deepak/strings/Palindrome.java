package com.deepak.strings;

/**
 @author narasimha.s
 Date 1/18/22
 */
public class Palindrome {

    boolean isPalindrome(final String str) {

        if (str == null) {
            return false;
        }
        if (str.length() <= 1) {
            return true;
        }
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome("abcd"));
        System.out.println(new Palindrome().isPalindrome("madam"));
        System.out.println(new Palindrome().isPalindrome("a"));
        System.out.println(new Palindrome().isPalindrome(""));
        System.out.println(new Palindrome().isPalindrome(null));
    }
}
