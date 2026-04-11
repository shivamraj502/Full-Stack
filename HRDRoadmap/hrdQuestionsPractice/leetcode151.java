// 151. Reverse Words in a String

public class leetcode151 {
    public static String rev(String s){
        // int len = s.length();
        // s=s.trim();

        String str[] = s.trim().split("\\s+");         // New method for me is split("\\s+")
        int len2 = str.length;

        for(int i=0;i<len2/2;i++){
            String temp=str[i];
            str[i] = str[len2-i-1];
            str[len2-i-1] = temp;
        }

        // for(int i=0;i<len2;i++){
        //     System.out.print(str[i]+" ");
        // }System.out.println();

        String ans = String.join(" ", str);         // New for me this method
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "a good   example";
        String res =rev(s);
        System.out.println("reverse words: "+res);
    }
}


/**
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 
 */