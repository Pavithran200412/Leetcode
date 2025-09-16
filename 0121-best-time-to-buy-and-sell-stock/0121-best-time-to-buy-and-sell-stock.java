class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] profit = new int[n];  
        int minPrice = prices[0];   

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit[i] = Math.max(profit[i - 1], prices[i] - minPrice);
        }
        return profit[n - 1];
    }
}
