package com.leetcode.interiew.practice.leetcode150.leetCode150;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class BestTimeToBuySellStockLeetCode121Test {

    @InjectMocks
    BestTimeToBuySellStockLeetCode121 bestTimeToBuySellStockLeetCode121;

    @Test
    void maxProfitTest() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5; // Buy at 1 and sell at 6
        int result = bestTimeToBuySellStockLeetCode121.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    void maxProfitTestWithNoProfit() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0; // No profit can be made
        int result = bestTimeToBuySellStockLeetCode121.maxProfit(prices);
        assertEquals(expected, result);
    }
}