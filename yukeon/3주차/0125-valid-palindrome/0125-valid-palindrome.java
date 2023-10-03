class Solution {
    public boolean isPalindrome(String s) {
        char[] chr = s.toUpperCase().toCharArray();
        int li = 0;
        int ri = chr.length - 1;

        while (li <= ri) {
            if (!Character.isLetterOrDigit(chr[li])) li++;
            else if (!Character.isLetterOrDigit(chr[ri])) ri--;
            else if(chr[li++] != chr[ri--]) return false;
        }
        return true;
    }
}