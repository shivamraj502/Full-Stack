/**
⚡ WEEK 11 — Hashing (HashMap, HashSet)
Day 76 – Introduction to Hashing
Concept: Hashing, collision, and load factor.
Java Classes: HashMap, HashSet.
Problem: Number of Good Pairs – LeetCode 1512
Goal: Understand key-value concept.
 */

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
    public static void main(String[] args) {
        int []nums = {1,2,3,1,1,3};
        System.out.println("Good Pairs: " + numIdenticalPairs(nums));
    }
}
