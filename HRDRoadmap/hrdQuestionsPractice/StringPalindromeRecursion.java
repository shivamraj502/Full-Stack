// String Palindrome using Recursion

public class StringPalindromeRecursion {
    public static boolean stringPalindrome(String str, int left, int right){
        
        if((left+1==right) && (str.charAt(left)== str.charAt(right))){
            return true;
        }

        if(left==right){
            return true;
        }
        
        if(str.charAt(left)==str.charAt(right)){
            return stringPalindrome(str, left++, right--);
        }else return false;
    }
    public static void main(String[] args) {
        String str = "bananab";
        int left=0;
        int right=str.length();
        boolean bool = stringPalindrome(str,left,right);
        System.out.println("ispalindrome: "+ bool);
    }
}
