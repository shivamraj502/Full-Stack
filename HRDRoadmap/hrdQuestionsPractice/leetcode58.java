public class leetcode58 {
    public static int len(String s){
        int l=0,n=s.length();
        for(int i=n-1;i>=0;i--){

            if(s.charAt(n-1) ==' '){
                if(l == 0 && s.charAt(i)==' '){
                    System.out.println("l1: "+l);
                    continue;
                }else if(s.charAt(i)!=' '){
                    System.out.println("l2: "+l);
                    l++;
                }else return l;

            }else if(s.charAt(n-1) != ' '){ 
            System.out.println(s.charAt(i));
            if(s.charAt(i)==' '){return l;}
            l++;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        String s = " hello world  ";
        int res = len(s);
        System.out.println("Length of last String is: "+ res);
    }
}


/**
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */