package com.leetcode.interiew.practice.leetcode150.problems;

import com.leetcode.interiew.practice.leetcode150.dataStructure.BinaryTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MaxDepthBinaryTreeTest {

@InjectMocks
MaxDepthBinaryTree maxDepthBinaryTree;
    @Test
    void testMaxDept(){
        BinaryTree tree = new BinaryTree();
        int[] inputValues = {3, 9, 20, 15, 7};  // Like user input or from DB/API
        int[] inputValues2 = {3, 9, 20, 15, 7,4,12,15};  // Like user input or from DB/API
        for (int val : inputValues2) {
            tree.insert(val);
        }
        int depth = maxDepthBinaryTree.maxDept(tree.root);
        System.out.println("depth of tree is "+depth);
        assertEquals(3, depth);
    }
}