public class leetcode128_b {
    public static int longestConsecutive(int []nums){
        if(nums.length==0){return 0;}
        int max=0;
        int count=0;
        // int min=nums[0];

        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }System.out.println();

        for(int i=0;i<nums.length-1;i++){
            int min=nums[i];
            // System.out.print("i"+i);
            for(int j=0;j<nums.length;j++){
            
            if(nums[j]>min && nums[j]-min == 1){
                count++;
                min=nums[j];
                // System.out.print("count"+count);
                // System.out.print("mn"+min);
                // System.out.print("j"+j);
            }

            } //System.out.println();
            if(count>max){max=count;count=0;}
            else{count=0;}
        }

        return max+1;
    }
    public static void main(String[] args) {
        int []nums = {1,2,6,7,8};
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