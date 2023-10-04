class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] < n - i) {
                return n - i - 1;
            }
        }
        return n;
    }
}

/**
 * 현재 인용 횟수 vs 전체 논문 - 현재 인덱스(-> 현재 인용 횟수보다 인용 횟수가 많은 논문 )
 * 현재 인용 횟수(H)가 (전체 논문 수 - 현재 인용 수보다 인용 횟수가 많은 논문 수)보다 많으면 해당 X
 */