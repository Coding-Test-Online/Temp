class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        // numsRows만큼 행 생성
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int currentRow = 0;
        boolean down = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // currentRow == 0 -> 한 글자 입력 받았으면 그 다음 행으로
            // currentRow == numRows - 1 -> 마지막 열까지 입력했으면 그 다음 행으로
            if (currentRow == 0 || currentRow == numRows - 1) down = !down;

            // down이 true(다음 행으로 내려갈 차례)면 currentRow + 1
            currentRow += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);

        return result.toString();
    }
}