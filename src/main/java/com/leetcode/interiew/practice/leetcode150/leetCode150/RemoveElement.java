package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
//This is leetcode150 proplem 27

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
