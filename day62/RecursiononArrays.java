/**
Day 62 – RecursiononArrays
Concept: Recursively process arrays (sum, max, search).
Problem: Recursive Sum of Array – GFG
Goal: Practice base + recursive case thinking.
 */
public class RecursiononArrays {
    public static int sum(int [] nums){
        int i=-1;
        if(i==nums.length-1){
            return nums[i];
        }

        return sum(nums);

    }
    public static int sum2(int [] nums,int i){
        
        if(i==nums.length-1){
            return nums[i];
        }

        return nums[i]+sum2(nums,i+1);
        // System.out.println(i);

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        
        System.out.println(sum2(nums,0));
    }
}
