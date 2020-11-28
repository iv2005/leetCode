package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.leetcode.utils.CommonUtils.getCertainLengthArray;

public class A27_RemoveElementTestCase {


    @Test
    public void testRemoveElement_NumArray2() {
        final int[] numArray = new int[]{1, 2, 3};
        int length = A27_RemoveElement.removeElement(numArray, 2);
        Assert.assertEquals(2, length);
        int[] resArray = getCertainLengthArray(numArray, length);
        Arrays.sort(resArray);
        Assert.assertArrayEquals(new int[]{1, 3}, resArray);
    }

    @Test
    public void testRemoveElement_NumArray3() {
        final int[] numArray = new int[]{1, 2, 2};
        int length = A27_RemoveElement.removeElement(numArray, 2);
        Assert.assertEquals(1, length);
        int[] resArray = getCertainLengthArray(numArray, length);
        Arrays.sort(resArray);
        Assert.assertArrayEquals(new int[]{1}, resArray);
    }

    @Test
    public void testRemoveElement_NumArray4() {
        final int[] numArray = new int[]{2, 2, 2};
        int length = A27_RemoveElement.removeElement(numArray, 2);
        Assert.assertEquals(0, length);
        int[] resArray = getCertainLengthArray(numArray, length);
        Arrays.sort(resArray);
        Assert.assertArrayEquals(new int[]{}, resArray);
    }

    @Test
    public void testRemoveElement_NumArray5() {
        final int[] numArray = new int[]{3, 2, 2, 3};
        int length = A27_RemoveElement.removeElement(numArray, 3);
        Assert.assertEquals(2, length);
        int[] resArray = getCertainLengthArray(numArray, length);
        Arrays.sort(resArray);
        Assert.assertArrayEquals(new int[]{2,2}, resArray);
    }

    @Test
    public void testRemoveElement_NumArray6() {
        final int[] numArray = new int[]{2};
        int length = A27_RemoveElement.removeElement(numArray, 3);
        Assert.assertEquals(1, length);
        int[] resArray = getCertainLengthArray(numArray, length);
        Arrays.sort(resArray);
        Assert.assertArrayEquals(new int[]{2}, resArray);
    }

    @Test
    public void testRemoveElement_NumArray7() {
        final int[] numArray = new int[]{2};
        int length = A27_RemoveElement.removeElement(numArray, 2);
        Assert.assertEquals(0, length);
        int[] resArray = getCertainLengthArray(numArray, length);
        Arrays.sort(resArray);
        Assert.assertArrayEquals(new int[]{}, resArray);
    }
}
