/**
Day 65 – Subsets & Power Set
Concept: Recursive tree generation (include/exclude pattern).
Problem: Subsets – LeetCode 78
Goal: Learn binary recursion pattern.
 */

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
    public static void subsets2_b(String s) { //Print all subsets of a string
        if(s == ""){
            System.out.println("[]");
        }
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(".");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        // int n = 3;
        // int nums[] = {1,2,3};
        String s = "ab";
        subsets2_b(s);
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