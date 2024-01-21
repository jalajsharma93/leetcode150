package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MergeSortedArrayTest {

    @InjectMocks
    MergeSortedArray mergeSortedArray;
    @Test
    void mergeSortedArray() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n=3;
        int m=3;

        int[] expectedOutPut = {1,2,2,3,5,6};
        assertArrayEquals(expectedOutPut,mergeSortedArray.mergeSortedArray(nums1,m,nums2,n));
    }
}