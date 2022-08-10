package com.deepak.strings;

/**
 @author narasimha.s
 Date 3/29/22
 */
public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        final StringBuilder[] builders = new StringBuilder[numRows];
        for(int i =0;i<numRows;i++){
            builders[i] = new StringBuilder(s.length()/2);
        }
        if(s.length() <= numRows ||numRows == 1){
            return s;
        }

        final char[] charArray = s.toCharArray();
        int i = 0,counter = 0;
        boolean reversed = false;
        for (final char c : charArray) {
            builders[i].append(c);
            counter++;
            if (counter == numRows) {
                counter = 1;
                reversed = !reversed;
            }
            if(!reversed){
                i++;
            }
            else{
                i--;
            }
        }

        for(int k=1;k<numRows;k++){
            builders[0].append(builders[k]);
        }
        return builders[0].toString();
    }
    public static void main(String[] args) {
        System.out.println(convert("abcd",2));
    }
}
