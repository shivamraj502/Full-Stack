/**
Day 84 – Prefix Sum + HashMap
Problem: Subarray Sum Equals K – LeetCode560
Goal: Learn pattern-based hashing problems.
 */

public class LeetCode560 {
    public static int subArrSum(int [] nums,int k){
        int res =0;
        
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){ res += 1;}
            }
        }return res;
    }
    public static void main(String[] args) {
        // int [] nums = {1,1,1};int k = 2;
        int [] nums = {1,2,3};int k = 3;
        System.out.println(subArrSum(nums,k));
    }
}

/**
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */