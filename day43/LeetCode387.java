/**
Day 43 – Queue Applications
Concept: Sliding window, first non-repeating character.
Problem: First Unique Character – LeetCode 387
Goal: Use queue for problem-solving.
 */

public class LeetCode387 {
    public static int firstUniqChar(String s) {
        // if(s.length()==1){return 0;}
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.length()==1 ||s.charAt(i)==s.charAt(j)){count++;}
            }
            if(count==1){return i;}
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String s = "lovelevetcotddecez";
        System.out.println("s: "+s);
        System.out.println(firstUniqChar(s));
    }
}

/**
387. First Unique Character in a String
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */