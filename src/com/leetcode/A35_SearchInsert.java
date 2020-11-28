package com.leetcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 */
public class A35_SearchInsert {

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert_v1(int[] nums, int target) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (target == val) {
                return i;
            }
            if (target > val) {
                index++;
            }
            if (target < val) {
                return index;
            }
        }
        return index;
    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return left;
    }
}
