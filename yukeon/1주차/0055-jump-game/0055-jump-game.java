class Solution {
    public boolean canJump(int[] nums) {
        int end = 0;
        for (int i = 0; i < nums.length; i++){
            int step = nums[i];
            end = Math.max(i + step, end);
            if (end >= nums.length - 1){
                return true;
            }
            else if (end == i) return false;
        }
        return true;
    }
}