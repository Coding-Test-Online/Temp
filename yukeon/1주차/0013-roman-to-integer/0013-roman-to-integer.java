class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        int ans = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (i + 1 < s.length() && (tmp == 'I' || tmp == 'X' || tmp == 'C')) {
                char next = s.charAt(i+1);
                if (tmp == 'I' && next == 'V') {
                    ans += 4;
                    i++;
                    continue;
                } else if (tmp == 'I' && next == 'X') {
                    ans += 9;
                    i++;
                    continue;
                } else if (tmp == 'C' && next == 'D') {
                    ans += 400;
                    i++;
                    continue;
                } else if (tmp == 'C' && next == 'M') {
                    ans += 900;
                    i++;
                    continue;
                } else if (tmp == 'X' && next == 'L') {
                    ans += 40;
                    i++;
                    continue;
                } else if (tmp == 'X' && next == 'C') {
                    ans += 90;
                    i++;
                    continue;
                }
            }
            ans += map.get(tmp);
        }
        return ans;
    }
}