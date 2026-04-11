import java.util.*;
public class leetcode128_c {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        int maxLen = 1;     // at least 1 if there's one number
        int currentLen = 1;

        // Step 2: Walk once through sorted array
        for (int i = 1; i < nums.length; i++) {

            // Skip duplicates
            if (nums[i] == nums[i-1]) {
                continue;
            }

            // If next number is consecutive
            if (nums[i] == nums[i-1] + 1) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } 
            // Break in sequence → reset count
            else {
                currentLen = 1;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int []nums = {1,2,6,7,7,8,8};           //Output: 3
        System.out.println("Output: "+ longestConsecutive(nums));
    }
}

/**
Example 1:

Input: nums = [100,4,200,1,3,2]     
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]         
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3

Example 4:

Input: nums = [1,2,6,7,8]
Output: 3


 */
