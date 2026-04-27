import java.util.List;

/**
Day 65 – Subsets & Power Set
Concept: Recursive tree generation (include/exclude pattern).
Problem: Subsets – LeetCode 78
Goal: Learn binary recursion pattern.
 */
public class leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
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