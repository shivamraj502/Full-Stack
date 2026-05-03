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
    public static int subsets2(int n) { //Count total number of subsets
        int Tsets = 1;
        for(int i=0;i<n;i++){
            Tsets *= 2;
        }
        return Tsets;
    }
    public static int subsets2_b(int n) { //Count total number of subsets
        if(n<0){return -1;}
        if(n==0){return 1;}
        return 2*subsets2_b(n-1);
    }
    public static void main(String[] args) {
        // int nums[] = {1,2,3};
        int n = 3;
        System.out.println(subsets2_b(n));
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