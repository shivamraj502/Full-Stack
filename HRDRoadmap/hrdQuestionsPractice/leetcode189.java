public class leetcode189 {
    public static void rotate(int []nums,int k){                // VERY IMPORTANT TO ROTATE K TIMES: k=k%nums.length;
        k=k%nums.length;

        for(int l= 0;l<nums.length/2;l++){
            int temp = nums[l];
            nums[l] = nums[nums.length-l-1];
            nums[nums.length-l-1] = temp;
        }
        
        for(int l= 0;l<k/2;l++){
            int temp = nums[l];
            nums[l] = nums[k-l-1];
            nums[k-l-1] = temp;
        }
        
        for(int l= k, m=0;l<(k+(nums.length-k)/2);l++,m++){
            int temp = nums[l];                       // 1 2 3 4 5 
            nums[l] = nums[nums.length-m-1];           // 0 1 2 3 4 
            nums[nums.length-m-1] = temp;             // k=2
        }       
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []nums={1,2,3};
        int k=2;
        rotate(nums, k);
    }
}

/**
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */