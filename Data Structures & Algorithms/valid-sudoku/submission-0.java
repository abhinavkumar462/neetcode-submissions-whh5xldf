class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> set = new HashSet<>();

        // Row check
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (!set.add(c)) return false;
            }
        }

        // Column check
        for (int j = 0; j < 9; j++) {
            set.clear();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (!set.add(c)) return false;
            }
        }

        // Block check
        for (int block = 0; block < 9; block++) {
            set.clear();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (block / 3) * 3 + i;
                    int col = (block % 3) * 3 + j;

                    char c = board[row][col];
                    if (c == '.') continue;
                    if (!set.add(c)) return false;
                }
            }
        }

        return true;
    }
}