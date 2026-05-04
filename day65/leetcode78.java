/**
Day 65 – Subsets & Power Set
Concept: Recursive tree generation (include/exclude pattern).
Problem: Subsets – LeetCode 78
Goal: Learn binary recursion pattern.
 */

import java.util.ArrayList;
import java.util.List;
public class leetcode78 {
    public static List<List<Integer>> subsets(int[] nums) {
        
        return null;
    }
    public static int subsets1(int n) { //Count total number of subsets
        int Tsets = 1;
        for(int i=0;i<n;i++){
            Tsets *= 2;
        }
        return Tsets;
    }
    public static int subsets1_b(int n) { //Count total number of subsets
        if(n<0){return -1;}
        if(n==0){return 1;}
        return 2*subsets1_b(n-1);
    }
    public static List<List<Character>> subsets2(String s) { //Print all subsets of a string
        if(s == ""){
            return null;
        }
        
        // String pick = out + s.charAt(0);
        // s.pick_back;
        // String notPick = out;
        
        // return subsets2();
        return null;
    }
    public static List<List<Character>> subsets2_b(String s) {

        List<List<Character>> result = new ArrayList<>(); 
        // result = big box → stores all subsets

        helper(s, 0, new ArrayList<>(), result); 
        // start recursion:
        // s = input string
        // 0 = start index
        // [] = current subset (empty)
        // result = where we store answers

        return result; 
        // return all subsets
    }
    public static void helper(String s, int i, List<Character> curr, List<List<Character>> result) {

        if(i == s.length()) { 
            // if we reached end of string
            // means we formed one complete subset

            result.add(new ArrayList<>(curr)); 
            // store copy of current subset
            // (copy needed because curr will change later)

            return; 
            // stop this path
        }

        // ❌ NOT TAKE current character
        helper(s, i + 1, curr, result); 
        // skip s[i]
        // move to next index
        // curr remains same

        // ✅ TAKE current character
        curr.add(s.charAt(i)); 
        // add current character to subset

        helper(s, i + 1, curr, result); 
        // move forward with this character included

        // 🔄 BACKTRACK
        curr.remove(curr.size() - 1); 
        // remove last added character
        // so we can try other combinations
    }
    
    public static void subsets3(int[] arr) {    ////Generate subsets of an array (without storing)
        helper(arr, 0, new ArrayList<>()); // start recursion
    }
    public static void helper(int[] arr, int i, List<Integer> curr) {

        if(i == arr.length) { // reached end → one subset ready
            System.out.print(curr); // print subset
            return;
        }

        // ❌ NOT TAKE
        helper(arr, i + 1, curr); // skip current element

        // ✅ TAKE
        curr.add(arr[i]); // add element
        helper(arr, i + 1, curr); // move forward

        // 🔄 BACKTRACK
        curr.remove(curr.size() - 1); // remove last element        
    }

    public static void subsets4(int[] arr) {    // Generate subsets using include/exclude method
          helper4(arr, 0, new ArrayList<>());
    }
    public static void helper4(int[] arr, int i, List<Integer> curr) {
        if(i == arr.length) { // base case → one subset ready
            System.out.print(curr);
            return;
        }

        // ✅ INCLUDE
        curr.add(arr[i]);
        helper(arr, i + 1, curr);

        // 🔄 BACKTRACK
        curr.remove(curr.size() - 1);

        // ❌ EXCLUDE
        helper4(arr, i + 1, curr);
    }

    public static void main(String[] args) {
        // int n = 3;
        int nums[] = {1,2,3};
        // String s = "ab";
        subsets3(nums);
    }
}


/**
78. Subsets
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */


/**
Here is the ordered list (basic → hardest) with input & output 👇

🟢 1️⃣ Count total number of subsets
👉 Input:
n = 3
👉 Output:
8

🟢 2️⃣ Print all subsets of a string  
👉 Input:
"ab"
👉 Output:
"" "a" "b" "ab"

🟡 3️⃣ Generate subsets of an array (without storing)
👉 Input:
[1,2]
👉 Output:
[][1][2][1,2]

🟡 4️⃣ Generate subsets using include/exclude method
👉 Input:
[1,2]
👉 Output:
[][1][2][1,2]

🔴 5️⃣ Generate subsets using recursion (store result)
👉 Input:
[1,2,3]
👉 Output:
[ [], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]

🎯 Flow
count → print → recursion → include/exclude → store

👉 Now you are fully ready for LeetCode 78 👍
*/