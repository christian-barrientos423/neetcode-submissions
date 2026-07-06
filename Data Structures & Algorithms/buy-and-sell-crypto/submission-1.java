class Solution {
     public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int lowestBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int profit = currentPrice - lowestBuy;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (currentPrice < lowestBuy) {
                lowestBuy = currentPrice;
            }
        }
        return maxProfit;
    }
}
