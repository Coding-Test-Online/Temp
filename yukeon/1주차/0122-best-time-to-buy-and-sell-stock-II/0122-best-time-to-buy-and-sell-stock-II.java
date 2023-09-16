class Solution {
    public int maxProfit(int[] prices) {
        int cur = prices[0];
        int ans = 0;

        for(int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - cur;

            if (tmp < 0) cur = prices[i];
            else ans = Math.max(ans, tmp);
        }
        return ans;
    }
}