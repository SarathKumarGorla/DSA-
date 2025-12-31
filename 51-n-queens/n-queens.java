class Solution {
        boolean check(int row, int col, List<StringBuilder> board, int n){

        // check left row
        for (int c = 0; c < col; c++) {
            if (board.get(row).charAt(c) == 'Q') {
                return false;
            }
        }

        // check upper-left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
        }

        // check lower-left diagonal
        for (int r = row, c = col; r < n && c >= 0; r++, c--) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
        }

        return true;
    }
     // ✅ Backtracking remains the same
    void gen(int col, List<StringBuilder> board, int n, List<List<String>> ans) {

        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (StringBuilder sb : board) {
                temp.add(sb.toString());
            }
            ans.add(temp);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (check(row, col, board, n)) {
                board.get(row).setCharAt(col, 'Q');
                gen(col + 1, board, n, ans);
                board.get(row).setCharAt(col, '.'); // backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        // ✅ FIX: each row must be a different StringBuilder
        List<StringBuilder> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(new StringBuilder(".".repeat(n)));
        }

        gen(0, board, n, ans);
        return ans; // ✅ FIX: return ans, not board
    }
}