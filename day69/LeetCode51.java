/**
Day 69 – Backtracking Basics
Concept: Trial & error recursion; undo steps after recursion.
Problem: N-Queens – LeetCode 51
Goal: Learn how to "backtrack" safely.
 */

import java.util.*;
public class LeetCode51 {
    public static void printN(int n){
        for(int i=01;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void printN2(int n){
       if(n==0) return ;
       printN(n-1);
       System.out.print(n +" ");
    }
    public static void printBinN1(int n){       // 0 1
       ArrayList<String> res = new ArrayList<>(); 
       if(n==0) return ;
       printBinN1(n-1);
       System.out.print(n +" ");
    }
    public static void printBinN2(int n , String s){       // 0 1
       if(s.length() == n){
            System.out.println(s);
            return;
       } 
       printBinN2(n,s+"0");
       printBinN2(n,s+"1");
    }
    public static void printBinN3(int n , String s){       // 0 1
       if(s.length() == n){
            System.out.println(s);
            return;
       } 
       printBinN3(n,s+"0");
       printBinN3(n,s+"1");
    }
    public static void printSubseq(String s, String t){       // 0 1
       if(t.length() == s.length()){
            return;
       } 
       printSubseq(s, t);
       
    }
    public static void printSubseq2(String s, int i, String curr){       // 0 1
       if(i == s.length()){
            System.out.println("\"" + curr + "\"");
            return;
       } 
       printSubseq2(s, i+1, curr);
       printSubseq2(s, i+1, curr+s.charAt(i));
    }
    public static void LeetCode78(String s, int i, String curr){       // 0 1
       if(i == s.length()){
            System.out.println("[" + curr + "]");
            return;
       } 
       LeetCode78(s, i+1, curr);
       LeetCode78(s, i+1, curr+s.charAt(i));
    }
   public static List<List<Integer>> LeetCode78b(int [] nums){       // 0 1
       List<List<Integer>> res= new ArrayList<>();
       helper(nums,0,new ArrayList<>(),res);
       return res;
    }
    public static void helper(int [] n,int i, List<Integer> curr, List<List<Integer>> res){
        if(i==n.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        helper(n, i+1, curr, res);
        curr.add(n[i]);
        helper(n, i+1, curr, res);
        curr.remove(curr.size()-1);
    }
    public static List<List<Integer>> LeetCode46a(int [] nums){       // 0 1
       List<List<Integer>> resList= new ArrayList<>();
       helper46(resList,new ArrayList<>(),nums);
       return resList;
    }
    public static void helper46(List<List<Integer>> resList, List<Integer> curr, int [] nums){
      if(curr.size() == nums.length){
         resList.add(new ArrayList<>(curr));
         return;
      }
      for(int n: nums){
         if(curr.contains(n)){
            continue;
         }
         curr.add(n);
         helper46(resList,curr,nums);
         curr.remove(curr.size()-1);
      }
    }
    public static List<String> LetComb(String digits){       
       List<String> resList= new ArrayList<>();

       if(digits.length() == 0){ return resList;}

       String [] map = {
         "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
       };

       helperLC(resList,digits,0,"",map);
       return resList;
    }
    public static void helperLC(List<String> resList,String digits,int i,String curr, String[] map){

      if(i==digits.length()){
         resList.add(curr);
         return;
      }

      String letters = map[digits.charAt(i)-'0'];
      for(int j=0; j<letters.length();j++){
         helperLC(resList,digits,i+1, curr+letters.charAt(j) ,map);
      }
    }
    public static boolean ratNmaze(int [][] arr, int i, int j){       
      if(i == arr.length-1 && j == arr[0].length-1){
         return true;
      }
      
      if(i >= arr.length || j >= arr[0].length){
         return false;
      }

      if(arr[i][j] == 0){
         return false;
      }

      arr[i][j] = 0;

      if(ratNmaze(arr,i+1,j)){
         return true;
      }
      
      if(ratNmaze(arr,i,j+1)){
         return true;
      }

      arr[i][j]=1;

       return false;
    }
    public static List<List<String>> nQueen51(int n){
      List<List<String>> res = new ArrayList<>();
      
      char[][] board = new char[n][n];
      for(int i=0;i<n;i++){
         Arrays.fill(board[i],'.');
      }
      // helper51(res,0,board);

      return res;
    }
    public static void helper51(List<List<String>> res, int row, int [][] board){
      
    }

   public static List<List<String>> NQueen(int n ){
      List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board) Arrays.fill(row, '.');

        helper(0, board, n, result);
        return result;
   }
   public static void helper(int row, char[][] board, int n, List<List<String>> result){
        if(row == n){
            result.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                helper(row+1, board, n, result);
                board[row][col] = '.'; // backtrack
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col, int n){
        // check column (upward)
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // check upper-left diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        // check upper-right diagonal
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
   public static List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row : board){
            res.add(new String(row));
      }
        return res;
   }
   
   public static List<List<String>> NQueen2(int n){
      List<List<String>> solution2 = new ArrayList<>();
      char[][] board = new char[n][n];

      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){ board[i][j] = '.'; }
      }

      helper2(board, 0, n, solution2);
      return solution2;
   }
   public static void helper2(char [][] board, int row, int n, List<List<String>> solution2){
      if(row == n){ solution2.add(construct2(board));return;}

      for(int col=0; col<n;col++){
         if(isSafe2(board, row, col, n)){
            board[row][col] = 'Q';
            helper2(board, row+1, n, solution2);
            board[row][col] = '.';
         }
      }
   }
   public static boolean isSafe2(char [][] board,int row, int col, int n){
      for(int i=row-1;i>=0;i--){
         if(board[i][col] == 'Q') return false;
      }

      for(int i=row-1,  j=col-1; i>=0 && j>=0;i--,j--){
         if(board[i][j] == 'Q')return false;
      }

      for(int i=row-1, j=col+1; i>=0 && j<n;i--,j++){
         if(board[i][j] == 'Q')return false;
      }return true;
   }
   public static List<String> construct2(char [][] board){
      List<String> res = new ArrayList<>();
      for(int i=0;i<board.length;i++){
         String temp = "";
         for(int j=0;j<board[0].length;j++){
            temp += board[i][j];
         }res.add(temp);
      }return res;
   }
   
    public static void main(String[] args) {
      //   int n = 4;
        int n = 3;
      //   System.out.println(nQueen51(n));

      //   List<List<String>> solutions = NQueen(4);
        List<List<String>> solutions = NQueen2(n);
        for(List<String> sol : solutions){
            for(String row : sol) System.out.println(row);
            System.out.println();
        }
    }
}

/**
 * 1️⃣ Print Numbers from 1 to N
 * 2️⃣ Print All Binary Strings of Length N
 * 3️⃣ Print All Subsequences of a String
 * 4️⃣ Subsets (LeetCode78)
 * 5️⃣ Permutations (LeetCode 46)
 * 6️⃣ Letter Combinations of Phone Number
 * 7️⃣ Rat in a Maze
 * 7️⃣ n Queen leetcode 51
 */