class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0);

        return ans;
    }

    public void backtrack(char[][] board, int row) {

        // all queens placed
        if (row == board.length) {

            List<String> temp = new ArrayList<>();

            for (char[] r : board) {
                temp.add(new String(r));
            }

            ans.add(temp);
            return;
        }

        // try every column
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // place queen
                board[row][col] = 'Q';


                backtrack(board, row + 1);

                // backtrack
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board,
                          int row,
                          int col) {

        // check upper column
        for (int i = 0; i < row; i++) {

            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < row; i++) {

            if (board[row][i] == 'Q') {
                return false;
            }
        }
        // upper left diagonal
        int r = row;
        int c = col;
       for(r=row,c=col;r>=0&&c>=0;r--,c--){
            if (board[r][c] == 'Q') {
                return false;
            }}
            for(r=row,c=col;r>=0&&c<board.length;r--,c++){
            if (board[r][c] == 'Q') {
                return false;
            }}
        return true;
    }
}