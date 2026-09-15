class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                // if(board[i][j] <= '0' && board[i][j] >'9') return false;
                if(board[i][j] > '0' && board[i][j] <='9' && !set.add(board[i][j])) {
                    return false;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                // if(board[j][i] <= '0' && board[j][i] >'9') return false;
                if(board[j][i] > '0' && board[j][i] <='9' && !set.add(board[j][i])) {
                    return false;
                }
            }
        }

        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
