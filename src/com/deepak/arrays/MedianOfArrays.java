package com.deepak.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 @author narasimha.s
 Date 2/21/22
 */
public class MedianOfArrays {

    public double findMedianSortedArrays(final int[] nums1, final int[] nums2) {

        //Arrays.stream(nums1).map(n -> String.valueOf(n)).collect(Collectors.toList())
        final int totalLengh = nums1.length + nums2.length;
        final int[] sortedFinalArray = new int[nums1.length + nums2.length];

        final int medianIndex = totalLengh / 2;
        final boolean evenElements = totalLengh % 2 == 0;

        if(nums1.length == 0 && nums2.length == 0)
            return 0.0;

        if(nums1.length == 0)
            return computeMedian(nums2, medianIndex, evenElements);

        if(nums2.length == 0)
            return computeMedian(nums1, medianIndex, evenElements);

        return 0;
    }

    final double computeMedian(final int[] arr, final int medianIndex, final boolean even){
        if(!even)
            return arr[medianIndex];
        else
            return (arr[medianIndex]+ arr[medianIndex+1])/2;
    }

}
