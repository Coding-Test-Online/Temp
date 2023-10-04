class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int li = 0;
        int ri = numbers.length - 1;
        int[] ans = new int[2];

        while (li < ri) {
            int sum = numbers[li] + numbers[ri];

            if (sum == target) {
                ans[0] = li + 1;
                ans[1] = ri + 1;
                return ans;
            }

            if (sum > target) ri--;
            else li++;
        }
        return ans;
    }
}