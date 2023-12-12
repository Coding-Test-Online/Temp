class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        dfs(answer, nums, new ArrayList<>());
        return answer;
    }
    
    private void dfs(List<List<Integer>> answer, int[] nums, List<Integer> cur) {
        if (cur.size() == nums.length) {
            answer.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!cur.contains(num)) {
                cur.add(num);
                dfs(answer, nums, cur);
                cur.remove((Integer) num);
            }
        }
    }
}