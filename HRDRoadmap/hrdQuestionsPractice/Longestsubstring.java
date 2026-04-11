/**
 * Longest substring without repeating characters.
 * input: abcdefabcbb
 * output: abcdef
 */

import java.util.*;                
public class Longestsubstring {
    public static int longestsubstring(String s){
        Set<Character> set2= new HashSet<>();
        int max=0;
        
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(set2.contains(s.charAt(j))){
                    set2.clear();                
                    break;                       
                }else{
                    set2.add(s.charAt(j));
                    if(set2.size()>max){
                        max=set2.size();
                    }
                }
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        String s = new String("abcdefabcbb");
        int result = longestsubstring(s);
        System.out.println("longest substring length: "+ result);
    }
}
