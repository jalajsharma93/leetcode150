package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

//This is leetcode150 proplem 27
@ExtendWith(MockitoExtension.class)
class RemoveElementTest {

    @InjectMocks
    RemoveElement removeElement;

    @Test
    public void removeElementTest(){
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = 5;
        assertEquals(result,removeElement.removeElement(nums,val));
    }

}