class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1) return 0;
        int profit = 0;
        int minCost = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - minCost > profit){
                profit = prices[i] - minCost;
            } else if(minCost > prices[i]){
                minCost = prices[i];
            }
        }
        return profit;
    }
}
