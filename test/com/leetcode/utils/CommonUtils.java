package com.leetcode.utils;

public class CommonUtils {

    public static int[] getCertainLengthArray(int[] nums, int length) {
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }

}
