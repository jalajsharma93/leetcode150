package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RemoveDuplicateFromSortedArrayTest {

    @InjectMocks
    RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray;

    @Test
    void removeDuplicatesFromSortedArrayOne() {
        int input[] = {0,0,1,1,1,2,2,3,3,4};
        int result = 5;
        assertEquals(result,removeDuplicateFromSortedArray.removeDuplicatesFromSortedArrayOne(input));
    }
}