/* Check if the given chessboard is valid or not
https://www.geeksforgeeks.org/dsa/check-if-the-given-chessboard-is-validor-not/ */

public class chessboardisvalidornot {
    public static boolean isValid(int n,int [][] c){
        boolean bool=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(i>0 && j==0){
                    if(c[i-1][0]==c[i][0]){return !bool;}
                }
                if(c[i][j]==c[i][j+1]){return !bool;}
            }
        }

        return bool;
    }
    public static void main(String[] args) {
        
        int n = 2;
        int [][]c = {
            { 1, 0 },
            {0, 0}};
        System.out.println("isValid: "+isValid(n, c));
    }
}

/**
Input : n = 2, C = [ [ 1, 0 ], [ 0, 1 ] ]
Output : Yes
Explanation: All adjacent cells are painted differently hence a valid chessboard. 

Input : n = 2,  C = [ [ 1, 0 ], [ 0, 0 ]]  
Output : No
Explanation: All adjacent cells are not painted differently hence not a valid chessboard. 

The first chessboard is valid, whereas the second is invalid.
 */