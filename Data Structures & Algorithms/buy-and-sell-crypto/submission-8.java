class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = l + 1;
        while(r < prices.length) {
            if(prices[l] > prices[r]) {
                l = r;
                r = r + 1;
            }
            else{
                max = Math.max(max, prices[r] - prices[l]);
                r = r + 1;
            }
        }
        return max;
    }
}
