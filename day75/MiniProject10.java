/**
Day 75 – Mini Project #10
Task: Build a Word Puzzle Solver using backtracking on a character grid.
Goal: Combine recursion and pathfinding together. 
 */

public class MiniProject10{
    public static boolean isExist(char[][] grid, String word){
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(dfs(grid, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] grid, String word, int row, int col, int index){
        if(index == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return false;
        }

        if(grid[row][col] != word.charAt(index)){
            return false;
        }

        char temp = grid[row][col];
        grid[row][col] = '#'; // mark visited

        boolean found = dfs(grid, word, row+1, col, index+1) ||
                         dfs(grid, word, row-1, col, index+1) ||
                         dfs(grid, word, row, col+1, index+1) ||
                         dfs(grid, word, row, col-1, index+1);

        grid[row][col] = temp; // backtrack (restore)

        return found;
    }

    public static void main(String[] args) {
        char[][] grid = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";

        if (isExist(grid, word)) {
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }
    }
}

// it can go up,down,left,right;
// if found print exist, if not found print not exist