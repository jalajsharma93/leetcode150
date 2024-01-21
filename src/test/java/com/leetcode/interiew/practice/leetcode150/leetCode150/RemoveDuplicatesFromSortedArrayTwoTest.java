package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RemoveDuplicatesFromSortedArrayTwoTest {

    @InjectMocks
    RemoveDuplicatesFromSortedArrayTwo removeDuplicatesFromSortedArrayTwo;
    @Test
    void removeDuplicatesFromSortedArrayTwo() {
        int[] input= {1,1,1,2,2,3};
        int result = 5;
        assertEquals(result,removeDuplicatesFromSortedArrayTwo.removeDuplicatesFromSortedArrayTwo(input));
    }
}