class Solution {
    List<String> res = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {
        Trie root = new Trie();
        for(String w:words) root.insert(w);
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                dfs(board,i,j,root);
        return res;
    }

    void dfs(char[][] b,int i,int j,Trie t){
        if(i<0||j<0||i==b.length||j==b[0].length||b[i][j]=='#') return;
        char c=b[i][j];
        if(t.next[c-'a']==null) return;
        t=t.next[c-'a'];
        if(t.word!=null){
            res.add(t.word);
            t.word=null;
        }
        b[i][j]='#';
        dfs(b,i+1,j,t); dfs(b,i-1,j,t);
        dfs(b,i,j+1,t); dfs(b,i,j-1,t);
        b[i][j]=c;
    }

    class Trie{
        Trie[] next=new Trie[26];
        String word;
        void insert(String w){
            Trie t=this;
            for(char c:w.toCharArray()){
                if(t.next[c-'a']==null) t.next[c-'a']=new Trie();
                t=t.next[c-'a'];
            }
            t.word=w;
        }
    }
}
