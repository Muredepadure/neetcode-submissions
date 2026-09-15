class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            System.out.println(buyPrice);
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            } else {
                profit = Math.max(profit, (prices[i] - buyPrice));
            }
        }
        return profit;
    }
}
