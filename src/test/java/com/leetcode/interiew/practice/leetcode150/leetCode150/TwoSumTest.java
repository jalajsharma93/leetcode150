package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class TwoSumTest {

    @InjectMocks
    TwoSum twoSum;

    @Test
    void twoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
    @Test
    void twoSumTestWithNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}