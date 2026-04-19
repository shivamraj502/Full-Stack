/**
Day 63 – Recursion on Strings
Concept: Reverse string, check palindrome, remove duplicates recursively.
Problem: Reverse String Recursively – GFG
Goal: Work with character-level recursion.
 */
public class ReverseStrings {
    public static String rev(String s,int i){
        if(i==s.length()-1){
            return "."+s.charAt(i);
        }

        return rev(s,i+1);
    }
    public static String rev2(String s,int i){
        if(i==s.length()-1){
            return ""+s.charAt(s.length() - i -1);
        }

        return rev2(s,i+1) + s.charAt(s.length() - i -1);
    }
    public static String rev3(String s,int i){
        if(i==s.length()-1){
            return ""+s.charAt( i );
        }

        return rev3(s,i+1) + s.charAt(i);
    }
    public static void main(String[] args) {
        String s = "hello google";
        System.out.println(rev3(s,0));
    }
}
