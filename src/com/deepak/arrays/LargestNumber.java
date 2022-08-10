package com.deepak.arrays;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 @author narasimha.s
 Date 3/29/22
 */
public class LargestNumber {

    public static int largestNumber(final int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        final List<Integer> numObjects = new ArrayList<>(nums.length);
        for(final int i: nums) numObjects.add(i);
        numObjects.sort((a, b) ->
            (b + "" + a).compareTo(a + "" + b)
        );
        final StringBuilder sb = new StringBuilder();
        for(final Integer i: numObjects){
            sb.append(i);
        }
        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        //default, ISO_LOCAL_DATE
        final LocalDate arrival = LocalDate.parse("2015-04-20");
        final LocalDate departure = LocalDate.parse("2016-09-03");

        final Period period = Period.between(arrival, departure);

        System.out.println(period.getYears()*12 + period.getMonths());


    }



}

