class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), 1, n, k);
        return result;
        
    }   
    
    public void dfs(List<List<Integer>> result, ArrayList<Integer> sub, int start, int n, int k) {
        if(sub.size() == k) { 
            result.add(new ArrayList(sub));
            return;
        }
        
        for(int i = start; i <= n && sub.size() < k; i++) {
            sub.add(i);
            dfs(result, sub, i + 1, n, k);
            sub.remove(sub.size() - 1); 
        }
        return;
    }
}