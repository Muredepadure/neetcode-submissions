class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][10];  // row[r][d] = has digit d appeared in row r?
        boolean[][] col = new boolean[9][10];  // col[c][d]
        boolean[][] box = new boolean[9][10];  // box[b][d], b = (r/3)*3 + (c/3)

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue;

                if (ch < '1' || ch > '9') return false; // invalid char
                int d = ch - '0';                        // 1..9
                int b = (r / 3) * 3 + (c / 3);           // 0..8

                if (row[r][d] || col[c][d] || box[b][d]) return false; // duplicate

                row[r][d] = col[c][d] = box[b][d] = true;
            }
        }
        return true;
    }
}
