/**
WEEK 12 — Hashing + Practice Integration
Day 83 – Sliding Window with HashMap
Problem: Longest Substring Without Repeating Characters – LeetCode3
Goal: Use HashMap for window management.
 */

import java.util.*;
public class LeetCode3 {
    public static String longestSub(String s){
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int m =0;

        for(int i=0;i<s.length();i++){
            temp.setLength(0);
            for(int j=i;j<s.length();j++){
                
                temp.append(s.charAt(j));
                if( (!isDup(temp.toString())) && temp.length() > m){

                    if(m < temp.length()){
                        m = temp.length();
                        res = new StringBuilder(temp);      // res = temp;                     // MISTAKES 
                    }
                }
            }
        }return res.toString();         // return m;
    }
    public static int longestSub2(String s){
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int m =0;

        for(int i=0;i<s.length();i++){
            temp.setLength(0);
            for(int j=i;j<s.length();j++){
                
                temp.append(s.charAt(j));
                if( (!isDup(temp.toString())) && temp.length() > m){

                    if(m < temp.length()){
                        m = temp.length();
                        res = new StringBuilder(temp);      // res = temp;                     // MISTAKES 
                    }
                }
            }
        }return m;//return res.toString();         
    }
    public static int longestSub3(String s){
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
        }return max;      
    }
    public static int longestSub4(String s){
            HashMap<Character,Integer> map = new HashMap<>();
            int left =0;
            int max =0;

            for(int right=0;right<s.length();right++){
                if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))>=left){
                    left = map.get(s.charAt(right))+1;
                }
                map.put(s.charAt(right), right);
                max = Math.max(max, right-left+1);
            }return max;
    }
    public static boolean isDup(String s){
        char [] temp = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char c : temp){
            set.add(c);
        }
        return !(set.size() == s.length());
    }

    public static void main(String[] args) {
        // String s = "abcda";
        String s = "pwwkew";
        System.out.println("longest: "+ longestSub4(s));
    }
}

/**
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
 */