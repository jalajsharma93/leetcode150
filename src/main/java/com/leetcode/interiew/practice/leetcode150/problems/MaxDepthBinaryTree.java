package com.leetcode.interiew.practice.leetcode150.problems;

import com.leetcode.interiew.practice.leetcode150.dataStructure.TreeNode;

public class MaxDepthBinaryTree {
    public int maxDept(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDept(root.left);
        int right = maxDept(root.right);

        return Math.max(left,right)+1;

    }
}
