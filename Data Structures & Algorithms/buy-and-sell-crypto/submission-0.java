class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = 100;
        int maxProfit = 0;

        for (int price: prices) {
            minBuy = Math.min(minBuy, price);

            int profit = price - minBuy;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}
