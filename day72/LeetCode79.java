// Day 72 – Word Search
// Concept: Grid traversal recursion with visited matrix.
// Problem: Word Search – LeetCode 79
// Goal: Understand recursion on 2D arrays.

// package day72;
public class LeetCode79 {
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int row, int col, int index){
        if(index == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }

        if(board[row][col] != word.charAt(index)){
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#'; // mark visited

        boolean found = dfs(board, word, row+1, col, index+1) ||
                         dfs(board, word, row-1, col, index+1) ||
                         dfs(board, word, row, col+1, index+1) ||
                         dfs(board, word, row, col-1, index+1);

        board[row][col] = temp; // backtrack (restore)

        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        System.out.println(exist(board, "ABCCED")); // true
        System.out.println(exist(board, "SEE"));     // true
        System.out.println(exist(board, "ABCB"));    // false
    }
}