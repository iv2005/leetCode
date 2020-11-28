package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class A35_SearchInsertTestCase {

    @Test
    public void testSearchInsert_NumArray2() {
        final int[] numArray = new int[]{1, 2, 3};
        int index = A35_SearchInsert.searchInsert(numArray, 2);
        Assert.assertEquals(1, index);
    }

    @Test
    public void testSearchInsert_NumArray1() {
        final int[] numArray = new int[]{1, 2, 3};
        int index = A35_SearchInsert.searchInsert(numArray, 0);
        Assert.assertEquals(0, index);
    }

    @Test
    public void testSearchInsert_NumArray3() {
        final int[] numArray = new int[]{1, 2, 3};
        int index = A35_SearchInsert.searchInsert(numArray, 4);
        Assert.assertEquals(3, index);
    }
}
