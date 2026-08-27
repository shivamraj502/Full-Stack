/**
Day 78 – Frequency Counting
Concept: Counting characters/elements using HashMap.
Problem: Valid Anagram – LeetCode 242
Goal: Use maps for frequency-based problems.
 */

import java.util.Arrays;
public class LeetCode242 {
    public static boolean isAnag(String s, String t){
        char [] ch = s.toCharArray();
        char [] ch2 = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        if(ch.length == ch2.length){ 
        for(int i=0;i<ch.length;i++){
            if(ch[i] != ch2[i]) return false;
            // System.out.println(ch[i]+" "+ch2[i]);
        }}else return false;

        return true;
    }
    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println(isAnag(s,t));
    }
}

/**
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */