//1047. Remove All Adjacent Duplicates In String

public class LeetCode1047 {
    public static String removeDuplicates(String s) {
        
        StringBuilder stack = new StringBuilder();
        for(Character c : s.toCharArray()){
            if(stack.length()>0 && stack.charAt(stack.length()-1)==c){
                stack.deleteCharAt(stack.length()-1);
            }else{
                stack.append(c);
            }
        }

        return stack.toString();
    }
    public static void main(String[] args) {
        String s = "aaaab";
        System.out.println("output: "+removeDuplicates(s));
    }
}

/**
Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Example 2:
Input: s = "azxxzy"
Output: "ay"

Example 3:
Input:  "aaaa"
Output: ""
 */