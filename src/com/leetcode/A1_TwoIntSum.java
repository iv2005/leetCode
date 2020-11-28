package com.leetcode;

import java.util.*;

public class A1_TwoIntSum {

    /**
     * @param nums
     * @param target
     * @return
     */
    protected static int[] twoIntSumIndex(int[] nums, int target) {
        Map indexMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(i, nums[i]);
        }
        List indexList = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> res = new ArrayList();
            indexList.add(i);
            res.add(i);
            int tmp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (tmp == nums[j]) {
                    res.add(j);
                    return res.stream().mapToInt(Integer::valueOf).toArray();
                }
            }
        }
        return new int[]{};
    }

    /**
     * new Version answer.
     * time complex O(n2)
     *
     * @param nums
     * @param target
     * @return
     */
    protected static int[] twoIntSumIndex_V2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Hash method
     * time complex O(n)
     * @param nums
     * @param target
     * @return
     */
    protected static int[] twoIntSumIndex_V3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
