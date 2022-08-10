package com.deepak.strings;

/**
 @author narasimha.s
 Date 1/18/22
 */
public class Reverse {

    public String reverse(final String str) {

        //basic validations and return if I don't have to go through main business logic.
        if (str == null) {
            return null;
        }
        if (str.length() <= 1) {
            return str;
        }

        //declar a char array whose length = length of the actual string
        final char[] reversedCharArray = new char[str.length()];

        //iterate through the string in reverse and insert the values into the char array.
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            reversedCharArray[j] = str.charAt(i);
        }

        //return the reversed char array as string
        return String.valueOf(reversedCharArray);
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse("abcd"));
        System.out.println(new Reverse().reverse(null));
        System.out.println(new Reverse().reverse(""));
        System.out.println(new Reverse().reverse("a"));

    }
}
