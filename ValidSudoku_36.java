// 36. Valid Sudoku

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> rowDigit = new ArrayList<>();
        List<HashSet<Character>> colDigit = new ArrayList<>();
        List<HashSet<Character>> squareDigit = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rowDigit.add(new HashSet<Character> ('.'));
            colDigit.add(new HashSet<Character> ('.'));
            squareDigit.add(new HashSet<Character> ('.'));
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowDigit.get(i).contains(board[i][j])) {
                        return false;
                    }
                    if (colDigit.get(j).contains(board[i][j])) {
                        return false;
                    }
                    if (squareDigit.get((i/3) * 3 + (j/3)).contains(board[i][j])) {
                        return false;
                    }
                    rowDigit.get(i).add(board[i][j]);
                    colDigit.get(j).add(board[i][j]);
                    squareDigit.get((i/3) * 3 + (j/3)).add(board[i][j]);
                }
            }
        }
        return true;
    }
}
