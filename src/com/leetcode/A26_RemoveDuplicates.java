package com.leetcode;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class A26_RemoveDuplicates {

    /**
     * Over The Spent Time Requirement
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates_V1(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            //current index is i
            for (int j = i; j < nums.length; j++) {
                boolean isDuplicate = false;
                int behind = nums[j];
                for (int k = 0; k < i; k++) {
                    int front = nums[k];
                    if (front == behind) {
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    nums[i] = nums[j];
                    length++;
                    break;
                }

            }

        }
        return length;
    }

    /**
     * remove duplicate numbers in SORTED ARRAY!
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
