/**
⚡ WEEK 11 — Hashing (HashMap, HashSet)
Day 76 – Introduction to Hashing
Concept: Hashing, collision, and load factor.
Java Classes: HashMap, HashSet.
Problem: Number of Good Pairs – LeetCode 1512
Goal: Understand key-value concept.
 */

import java.util.*;
public class LeetCode1512 {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }// for(int i : set){ System.out.println(i); }

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){ count++; }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,1,1,3};
        // System.out.println("Good Pairs: " + numIdenticalPairs(nums));
        System.out.println("Good Pairs: " + numIdenticalPairs2(nums));
    }
}

/**
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0
 */