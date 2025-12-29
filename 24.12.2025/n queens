class Solution {
    List<List<String>> res = new ArrayList<>();
    boolean[] col, d1, d2;

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        d1 = new boolean[2*n];
        d2 = new boolean[2*n];
        backtrack(0, new char[n][n]);
        return res;
    }

    void backtrack(int r, char[][] board) {
        if (r == board.length) {
            List<String> list = new ArrayList<>();
            for (char[] row : board)
                list.add(new String(row).replace('\0', '.'));
            res.add(list);
            return;
        }
        for (int c = 0; c < board.length; c++) {
            if (col[c] || d1[r+c] || d2[r-c+board.length]) continue;
            col[c] = d1[r+c] = d2[r-c+board.length] = true;
            board[r][c] = 'Q';
            backtrack(r+1, board);
            board[r][c] = '\0';
            col[c] = d1[r+c] = d2[r-c+board.length] = false;
        }
    }
}
