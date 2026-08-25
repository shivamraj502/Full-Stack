/**
Day 70 – Sudoku Solver
Concept: Recursive filling with constraints.
Problem: Sudoku Solver – LeetCode 37
Goal: Learn constraint satisfaction via backtracking.
 */

public class LeetCode37 {
    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    for(char digit = '1'; digit <= '9'; digit++){
                        if(isValid(board, row, col, digit)){
                            board[row][col] = digit;
                            if(solve(board)) return true;
                            board[row][col] = '.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int row, int col, char digit){
        for(int c = 0; c < 9; c++){
            if(board[row][c] == digit) return false;
        }
        for(int r = 0; r < 9; r++){
            if(board[r][col] == digit) return false;
        }
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;
        for(int r = boxRowStart; r < boxRowStart + 3; r++){
            for(int c = boxColStart; c < boxColStart + 3; c++){
                if(board[r][c] == digit) return false;
            }
        }
        return true;
    }

    // Prints board in LeetCode's array-of-arrays string format
    public static void printBoard(char[][] board){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < board.length; i++){
            sb.append("[");
            for(int j = 0; j < board[i].length; j++){
                sb.append("\"").append(board[i][j]).append("\"");
                if(j != board[i].length - 1) sb.append(",");
            }
            sb.append("]");
            if(i != board.length - 1) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        // System.out.print("Input: board = ");
        // printBoard(board);

        solveSudoku(board);

        System.out.print("Output: ");
        printBoard(board);
    }
}