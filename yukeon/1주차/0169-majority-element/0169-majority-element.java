/**
 * 1번 풀이
 * 시간 복잡도 : O(nlogN)
 */
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

/**
 * 2번 풀이
 * 시간 복잡도 : O(n)
 */
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1;
        int ans = nums[0];
        int goal = (nums.length % 2 == 0) ? nums.length / 2 : (nums.length / 2) + 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ans) cnt++;
            else cnt--;

            if (cnt >= goal) return ans;

            if (cnt < 1) {
                ans = nums[i];
                cnt = 1;
            }
        }
        return ans;
    }
}