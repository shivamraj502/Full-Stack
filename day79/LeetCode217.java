/**
Day 79 – HashSet Applications
Concept: Uniqueness, duplicates detection.
Problem: Contains Duplicate – LeetCode 217
Goal: Learn O(1) average lookup.
 */

import java.util.*;
public class LeetCode217 {
    public static boolean isDup(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) return true;
            }
        }return false;
    }
    public static boolean isDup2(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }return !(set.size()==nums.length);
    }
    public static void main(String[] args) {
        // int [] nums = {1,2,3,1};
        // int [] nums = {1,2,3,4};
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(isDup2(nums));
    }
}

/**

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */