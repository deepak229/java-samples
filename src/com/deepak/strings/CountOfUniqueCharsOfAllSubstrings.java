package com.deepak.strings;

import java.util.HashMap;
import java.util.Map;

/**
 @author narasimha.s
 Date 3/17/22
 */
public class CountOfUniqueCharsOfAllSubstrings {
    final static Map<String, Integer> lenMap = new HashMap<String,Integer>();
    public static int  uniqueLetterString(final String s){
        int i=0, j = 0, len = s.length(), sum = 0, count = 0;
        String sub = null;
        do {
            for(j = i+1; j <= len; j++){
                sub = s.substring(i,j);
                if(lenMap.containsKey(sub)){
                    sum += lenMap.get(sub);
                    continue;
                }
                count = getCount(sub);
                lenMap.put(sub,count);
                sum += count;
            }

            i++;
        } while(i < len);
        return sum;
    }

    private static int getCount(final String s){

        final int[] numArray = new int[128];

        final char[] chars = s.trim().toCharArray();
        int sum = 0;
        for (final char c: chars){
            if(numArray[c] == 0)
                sum++;
            else if(numArray[c] == 1)
                sum--;
            numArray[c]++;
        }
        System.out.println(String.format("%s = %d", s, sum));
        return sum;
    }

    public static void main(String[] args){
        System.out.println(uniqueLetterString("ABA"));
    }
}
