package com.leetcode;

public class A27_RemoveElement {

    public static int removeElement_V2(int[] nums, int val) {
        int j = nums.length - 1;
        int i = 0;
        int length = 0;
        for (i = 0; i <= j; i++) {
            if (nums[i] == val) {
                //find the last value that not equal val
                for (int k = j; k > i; k--) {
                    if (nums[k] != val) {
                        nums[i] = nums[k];
                        nums[k] = val;
                        length++;
                        j--;
                        break;
                    }
                }
            } else {
                length++;
            }
        }
        return length;

    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
