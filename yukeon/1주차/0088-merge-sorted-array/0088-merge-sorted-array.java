/**
 * 1번 풀이 : Sort 메서드 사용
 * 시간 복잡도 : O((m+n)log(m+n))
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}

/**
 * 2번 풀이 : Two Pointer
 * 시간 복잡도 : O(m+n)
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -  1;
        int p2 = n - 1;
        int lp = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) nums1[lp--] = nums1[p1--];
            else nums1[lp--] = nums2[p2--];
        }
    }
}