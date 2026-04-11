public class leetcode128_a {
    public static int longestConsecutive(int []nums){
        if(nums.length==0){return 0;}
        int min=nums[0];
        int max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){min=nums[i];}
        }//System.out.println("min:"+min);
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
            if(nums[j]>min && nums[j]-min == 1){
                max++;
                min=nums[j];
                // System.out.print("max"+max);
                // System.out.print("min"+min);
            }
            }System.out.println();
        }

        return max+1;
    }
    public static void main(String[] args) {
        int []nums = {1,0,1,2};
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