class Solution {
     public int maxProfit(int[] prices) {
        int minPurchase = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i =0; i< prices.length -1 ; i++) {
            minPurchase = Math.min(minPurchase,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i+1] - minPurchase);
        }
        return maxProfit;
    }
}
