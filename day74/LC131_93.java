/**
Day 74 – Backtracking Practice
Problems:
Palindrome Partitioning – LeetCode 131
Restore IP Addresses – LeetCode 93
Goal: Get comfortable with recursion + string splitting.
*/

import java.util.*;
public class LC131_93 {
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), result);
        return result;
    }

    public static void helper(String s, int start, List<String> current, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int end = start; end < s.length(); end++){
            String piece = s.substring(start, end+1);
            if(isPalindrome(piece)){
                current.add(piece);
                helper(s, end+1, current, result);
                current.remove(current.size()-1); // backtrack
            }
        }
    }

    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("aab"));
        // System.out.println(partition("a"));
        // System.out.println(partition("aabb"));
    }
}

/**

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]
 */