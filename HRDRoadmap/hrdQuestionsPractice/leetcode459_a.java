public class leetcode459_a {
    public static boolean isValid(String s){
        boolean bool=true;
        int count1=1;
        int [] arr = new int[100];

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){count1++;}
                // System.out.println("count1:"+count1);
                // System.out.println(".");
            }
            // System.out.println("i:"+i);
            arr[i]=count1;
            count1=1;
            // System.out.println(".");
        }

        int k=0;
        for(int i=0;i<s.length();i++){
            // System.out.print(arr[i]+" ");
            if(arr[i]!=arr[k]){bool = false;return bool;}
        }System.out.println();

        return bool;
    }
    public static void main(String[] args) {
        String s = new String("abcabcabcabc");
        System.out.println("isValid: "+isValid(s));
    }
}

/**
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */