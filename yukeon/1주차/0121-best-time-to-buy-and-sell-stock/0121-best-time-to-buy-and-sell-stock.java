class Solution {
    public int maxProfit(int[] prices) {
        int cur = prices[0];
        int ans = 0;
        int len = prices.length;

        for (int i = 1; i < len; i++) {
            if (cur < prices[i]) {
                ans += prices[i] - cur;
            }
            cur = prices[i];
        }
        return ans;
    }
}