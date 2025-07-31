package com.leetcode.interiew.practice.leetcode150.leetCode150;

import com.leetcode.interiew.practice.leetcode150.dataStructure.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
class AddTwoNumberListLeetCode2Test {

    @InjectMocks
    AddTwoNumberListLeetCode2 addTwoNumberListLeetCode2;

    @Test
    public void testAddTwoNumbers_basicCase() {
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});
        ListNode result = addTwoNumberListLeetCode2.addTwoNumberList(l1, l2);
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_zeroCase() {
        ListNode l1 = createList(new int[]{0});
        ListNode l2 = createList(new int[]{0});
        ListNode result = addTwoNumberListLeetCode2.addTwoNumberList(l1, l2);
        assertArrayEquals(new int[]{0}, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_withCarryOver() {
        ListNode l1 = createList(new int[]{9, 9, 9});
        ListNode l2 = createList(new int[]{1});
        ListNode result = addTwoNumberListLeetCode2.addTwoNumberList(l1, l2);
        assertArrayEquals(new int[]{0, 0, 0, 1}, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_unequalLength() {
        ListNode l1 = createList(new int[]{1, 8});
        ListNode l2 = createList(new int[]{0});
        ListNode result = addTwoNumberListLeetCode2.addTwoNumberList(l1, l2);
        assertArrayEquals(new int[]{1, 8}, toArray(result));
    }

    // Helper methods
    private ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}