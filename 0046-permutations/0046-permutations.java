class Solution {
    List<List<Integer>> answer;
    int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        this.answer = new ArrayList<>();
        this.nums = nums;
        
        dfs(new ArrayList<>());
        return answer;
    }
    
    private void dfs(List<Integer> cur) {
        if (cur.size() == nums.length) {
            answer.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!cur.contains(nums[i])) {
                cur.add(nums[i]);
                dfs(cur);
                cur.remove((Integer) nums[i]);
            }
        }
    }
}