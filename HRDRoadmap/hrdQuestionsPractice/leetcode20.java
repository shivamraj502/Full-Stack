// valid parenthesis

public class leetcode20 {
    public static boolean isValid(String s){
        while(true){
        if(s.contains("()")){
            s=s.replace("()", "");
        }else if(s.contains("{}")){
            s=s.replace("{}", "");
        }else if(s.contains("[]")){
            s=s.replace("[]", "");
        }else{
            return s.isEmpty();
        }}
    }
    public static void main(String[] args) {
        String s="{()}";
        System.out.println(isValid(s));
    }
}

/**
Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false
 */