//1047. Remove All Adjacent Duplicates In String

public class LeetCode1047 {
    public static String removeDuplicates(String s) {
        String str = "";
        char[] c = s.toCharArray();

        for(int i= 0;i<s.length();i++){
            
        }

        return str;
    }
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(removeDuplicates(s));
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