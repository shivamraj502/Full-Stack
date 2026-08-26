/**
Day 77 – HashMap Operations
Concept: put(), get(), containsKey(), remove().
Problem: Two Sum – LeetCode 1
Goal: Use map to reduce time complexity from O(n²) to O(n).
 */

public class LC1 {
    public static int[] twoSum(int[] nums, int t) {
        int [] res = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==t){ res[0]=i;res[1]=j;}
            }
        }return res;
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15}; int t=9;
        // int [] nums = {3,2,4}; int t=6;
        // int [] nums = {3,3}; int t=6;
        int [] res =twoSum(nums, t);
        for(int n : res){System.out.print(n+" ");}
    }
}

/**
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */