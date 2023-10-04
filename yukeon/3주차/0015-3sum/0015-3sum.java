class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            int li = i + 1;
            int ri = nums.length - 1;

            while (li < ri) {
                int sum = nums[i] + nums[li] + nums[ri];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[li], nums[ri]));
                    li++;
                    ri--;
                    while (li < ri && nums[li] == nums[li - 1]) li++;
                    while (li < ri && nums[ri] == nums[ri + 1]) ri--;
                }
                else if (sum > 0) ri--;
                else li++;
            }
        }
        return ans;
    }
}