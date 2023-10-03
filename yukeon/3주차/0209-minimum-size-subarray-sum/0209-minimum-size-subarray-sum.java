class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int ans = nums.length + 1;
        int sum = 0;

        while (p2 < nums.length) {
            sum += nums[p2];
            while (sum >= target) {
                ans = Math.min(p2 - p1 + 1, ans);
                sum -= nums[p1++];
            }
            p2++;
        }
        return ans == nums.length + 1 ? 0 : ans;
    }
}