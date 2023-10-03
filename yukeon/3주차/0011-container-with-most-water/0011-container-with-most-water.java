class Solution {
    public int maxArea(int[] height) {
        if (height.length == 2) return Math.min(height[0], height[1]);

        int li = 0, ri = height.length - 1, ans = 0;

        while (li < ri) {
            int he = Math.min(height[li], height[ri]);
            ans = Math.max(ans, he * (ri - li));

            if (height[li] > height[ri]) {
                // 왼쪽 막대기가 더 길면 오른쪽 막대기를 이동
                // 현재 오른쪽 막대기보다 더 긴 막대기가 나올 때까지
                int curHe = height[ri];
                while (ri > li && curHe >= height[ri]) ri--;
            } else {
                int curHe = height[li];
                while (ri > li && curHe >= height[li]) li++;
            }
        }
        return ans;
    }
}