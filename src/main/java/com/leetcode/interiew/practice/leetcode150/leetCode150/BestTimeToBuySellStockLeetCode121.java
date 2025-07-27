package com.leetcode.interiew.practice.leetcode150.leetCode150;

public class BestTimeToBuySellStockLeetCode121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // Not enough data to make a profit
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if the current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate profit if selling at current price
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}
