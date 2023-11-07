class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[1] - o2[1]);
        int ans = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            int[] curPoint = points[i];
            if (!(end >= curPoint[0] && end <= curPoint[1])) {
                ans++;
                end = curPoint[1];
            }
        }
        return ans;
    }
}