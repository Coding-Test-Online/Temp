class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.split(" ");

        for (int i = tmp.length - 1; i >= 0; i--) {
            if (!tmp[i].equals(" ") && !tmp[i].isEmpty()) {
                sb.append(tmp[i]).append(" ");
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}