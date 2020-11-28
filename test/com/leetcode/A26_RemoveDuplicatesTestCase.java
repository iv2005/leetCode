package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static com.leetcode.utils.CommonUtils.getCertainLengthArray;

public class A26_RemoveDuplicatesTestCase {


    @Test
    public void testRemoveDuplicates_NumArray1() {
        final int[] numArray = new int[]{3, 3};
        int length = A26_RemoveDuplicates.removeDuplicates(numArray);
        Assert.assertEquals(1, length);
        Assert.assertArrayEquals(new int[]{3}, getCertainLengthArray(numArray, length));
    }


    @Test
    public void testRemoveDuplicates_NumArray2() {
        final int[] numArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = A26_RemoveDuplicates.removeDuplicates(numArray);
        Assert.assertEquals(5, length);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, getCertainLengthArray(numArray, length));
    }


//    /**
//     * this test case is only for unsorted array.
//     */
//    @Test
//    public void testRemoveDuplicates_NumArray3() {
//        final int[] numArray = new int[]{3, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int length = A26_RemoveDuplicates.removeDuplicates(numArray);
//        Assert.assertEquals(5, length);
//        Assert.assertArrayEquals(new int[]{3,0,1,2,4}, getCertainLengthArray(numArray, length));
//    }
}
