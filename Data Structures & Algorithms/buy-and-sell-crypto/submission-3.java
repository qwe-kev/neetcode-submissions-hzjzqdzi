class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            int maxEle = Arrays.stream(prices, i + 1, prices.length).max().getAsInt();
            if(prices[i] < maxEle) {
                currentProfit = maxEle - prices[i];
                maxProfit = Math.max(maxProfit, currentProfit);
            }
            else{
                continue;
            }
        }
        return maxProfit;
    }
}
