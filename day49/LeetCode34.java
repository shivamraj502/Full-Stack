/**
Day 49 – Applications of Binary Search
Concept: Variants (lower bound, upper bound, first/last occurrence).
Problem: First and Last Position in Sorted Array – LeetCode34
Goal: Learn how to tweak binary search conditions.
 */
public class LeetCode34 {
    public static int[] searchRange(int[] nums, int target) {
        int [] result={-1,-1};
        int left=-1;
        int right=-1;
        for(int i=0;i<nums.length;i++){
            if(left<0 && nums[i]==target){left=i;result[0]=i;result[1]=i;}
            else if(left>=0 && nums[i]==target){right=i;result[1]=i;}
        }

        return result;
    }
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10};
        int target = 10;
        int res[] = searchRange(nums,target);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

/***
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */