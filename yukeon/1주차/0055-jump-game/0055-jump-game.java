class Solution {
    public boolean canJump(int[] nums) {
        // step 1. 현재 인덱스에서 갈 수 있는 최대값 계산

        // step 2. 최대값이 배열의 끝인 경우 true를 반환

        // step 3. 최대값이 현재 인덱스 위치(== 0)이면 false
        if (nums.length == 1) return true;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            end = Math.max(end, i + nums[i]);

            if (end == i) return false;
            else if (end >= nums.length - 1) return true; 
        }
        return true;
    }
}