class Solution {

    Set<String> result = new HashSet<>();
    char[][] board;
    boolean[][] visited;

    int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, 1, -1};

    int m, n;

    public List<String> findWords(char[][] board, String[] words) {
        Trie root = build(words);
        this.board = board;
        
        this.m = board.length;
        this.n = board[0].length;

        this.visited = new boolean[this.m][this.n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String word = "";
                DFS(i, j, word, root);
            }
        }
        
        return new ArrayList<>(result);
    }

    private void DFS(int x, int y, String word, Trie trie) {
        char key = board[x][y];
        Trie node = trie.children.get(key);

        if (node == null) return;

        word += String.valueOf(key);

        visited[x][y] = true;

        if (node.isEndOfWord) result.add(word);

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newX < m &&
            newY >= 0 && newY < n &&
            !visited[newX][newY]) {
                DFS(newX, newY, word, node);
            }
        }

        visited[x][y] = false;
    }



    private Trie build(String[] words) { 
        Trie root = new Trie();

        for (String word : words) {
            Trie node = root;
            
            for (int i = 0; i < word.length(); i++) {
                
                char key = word.charAt(i);
                Trie child = node.children.get(key);

                if (child == null) {
                    child = new Trie();
                    node.children.put(key, child);
                }
                node = child;
            }

            node.isEndOfWord = true;
        }

        return root;
    }
}

class Trie {
    Map<Character, Trie> children;
    boolean isEndOfWord;

    public Trie() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }

}