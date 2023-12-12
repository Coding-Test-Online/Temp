class Solution {
    public String[] letters;
    public List<String> result;
    
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<String>();
        letters = new String[]{"", "", "abc", "def", "ghi", "kjl", "mno", "pqrs", "tuv", "wxyz"};
        
        if (digits.length() > 0) {
            dfs(0, new StringBuilder(), digits.toCharArray());
        } 
        return result;
    }
    
    public void dfs(int pick, StringBuilder sb, char[] order) {
        if (pick == order.length) {
            result.add(sb.toString());
            return;
        }
        
        char[] charArr = letters[Character.getNumericValue(order[pick])].toCharArray();
      
        for (int i = 0; i < charArr.length; i++) {
            sb.append(charArr[i]);
            dfs(pick + 1, sb, order);
            sb.delete(sb.length() - 1, sb.length());
        }
    }
}