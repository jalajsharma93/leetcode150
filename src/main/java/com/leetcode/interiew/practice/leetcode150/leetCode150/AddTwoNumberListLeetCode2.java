package com.leetcode.interiew.practice.leetcode150.leetCode150;

import com.leetcode.interiew.practice.leetcode150.dataStructure.ListNode;

public class AddTwoNumberListLeetCode2 {
    public ListNode addTwoNumberList(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        int carry = 0;

        while (l1!=null || l2!=null || carry > 0){
            int val1 = (l1!=null) ? l1.val : 0;
            int val2 = (l2!=null) ? l2.val : 0;

            int total = val1 + val2 + carry;
            carry = total/10;

            current.next = new ListNode(total%10);

            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }

            current = current.next;
        }
        return dummyHead.next;
    }
}
