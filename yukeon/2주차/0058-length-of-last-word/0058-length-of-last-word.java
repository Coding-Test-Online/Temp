class Solution {
    public int lengthOfLastWord(String s) {
        String[] tmp = s.split(" ");

        for (int i = tmp.length - 1; i >= 0; i--) {
            if (tmp[i].length() != 0) return tmp[i].length();
        }
        return 0;
    }
}