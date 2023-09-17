
/**
 * 1번 풀이
 * 시간 복잡도 : O(n)
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        

        for (int i = 0; i < tmp.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < tmp.length; i++) {
            nums[i] = tmp[i];
        }
    }
}