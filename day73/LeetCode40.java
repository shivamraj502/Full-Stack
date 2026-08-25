// Day 73 – Backtracking Optimization
// Concept: Pruning unnecessary recursive calls.
// Problem: Combination Sum II – LeetCode 40
// Goal: Write more efficient recursive code.

// package day73;
import java.util.*;
public class LeetCode40 {
    public static List<List<Integer>> isSum(int [] nums, int t){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        helper(nums,t,0,new ArrayList<>(),res);
        return res;
    }
    public static void helper(int [] nums,int rem,int start, List<Integer> curr, List<List<Integer>> res){
        if(rem == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(rem < 0){ return; }

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i] == nums[i-1]) continue;

            curr.add(nums[i]);
            helper(nums,rem-nums[i],i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }

    public static List<List<Integer>> isSum2(int[] nums, int t) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper2(nums, t, 0, new ArrayList<>(), res);
        return res;
    }

    public static void helper2(int[] nums, int rem, int start, List<Integer> curr, List<List<Integer>> res) {
        if (rem == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (rem < 0)
            return;

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue; // skip duplicates at same level
            curr.add(nums[i]);
            helper2(nums, rem - nums[i], i + 1, curr, res); // i+1: no reuse of same index
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int [] nums = {10,1,2,7,6,1,5};
        int t = 8;
        // List<List<Integer>> res = isSum(nums,t);
        // System.out.println(res);

        List<List<Integer>> res = isSum2(nums, t);
        System.out.println(res);
    }
}

/**
Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 */