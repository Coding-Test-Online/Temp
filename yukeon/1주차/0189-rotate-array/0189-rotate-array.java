class Solution {
    public void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = nums[(i + k) % nums.length];
        }

        for (int i = 0; i < tmp.length; i++) {
            nums[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution());
     }
}