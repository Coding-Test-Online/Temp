/**
 * 1번 풀이
 * 시간 복잡도 : O(n)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int pre = - 101;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != pre) {
                nums[idx++] = nums[i];
                pre = nums[i];
            }
        }
        return idx;
    }
}