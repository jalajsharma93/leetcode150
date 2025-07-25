package com.leetcode.interiew.practice.leetcode150.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;

    // Level-order insertion (binary tree, not BST)
    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr.left == null) {
                curr.left = newNode;
                return;
            } else {
                queue.offer(curr.left);
            }

            if (curr.right == null) {
                curr.right = newNode;
                return;
            } else {
                queue.offer(curr.right);
            }
        }
    }
}

