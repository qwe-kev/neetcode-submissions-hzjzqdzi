class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[i] < prices[j]) {
                    currentProfit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, currentProfit);
                }
                else{
                    continue;
                }
                
            }
        }
        return maxProfit;
    }
}
