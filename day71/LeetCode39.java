/**
Day 71 – Combination Sum
Concept: Find all combinations summing to target using recursion.
Problem: Combination Sum – LeetCode 39
Goal: Build recursive tree logic efficiently.
 */

import java.util.*;
public class LeetCode39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // helps prune early
        helper(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    public static void helper(int[] candidates, int remaining, int start,
                               List<Integer> current, List<List<Integer>> result){
        if(remaining == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(remaining < 0) return;

        for(int i = start; i < candidates.length; i++){
            if(candidates[i] > remaining) break; // pruning, since sorted

            current.add(candidates[i]);
            helper(candidates, remaining - candidates[i], i, current, result); // i, not i+1 -> reuse allowed
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper2(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    public static void helper2(int[] candidates, int index, int remaining,
                               List<Integer> current, List<List<Integer>> result){
        if(remaining == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(remaining < 0 || index == candidates.length){
            return;
        }

        // Case: INCLUDE candidates[index] (stay at same index -> allows 1x, 2x, 3x... reuse)
        current.add(candidates[index]);
        helper2(candidates, index, remaining - candidates[index], current, result);
        current.remove(current.size() - 1); // backtrack

        // Case: EXCLUDE candidates[index] entirely, move to next index
        helper2(candidates, index + 1, remaining, current, result);
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        // System.out.println(combinationSum(candidates, target));

        System.out.println(combinationSum2(candidates, target));

        // int[] candidates2 = {2,3,5};
        // int target2 = 8;
        // System.out.println(combinationSum(candidates2, target2));

        // int[] candidates3 = {2};
        // int target3 = 1;
        // System.out.println(combinationSum(candidates3, target3));

        // int[] candidates = {1};
        // int target = 7;
        // System.out.println(combinationSum(candidates, target));

        // int[] candidates = {1,-1};       // it is not working for this example
        // int target = 0;
        // System.out.println(combinationSum(candidates, target));

    }
}