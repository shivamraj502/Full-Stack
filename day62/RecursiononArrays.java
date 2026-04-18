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
    public static int max(int [] nums,int i){
        int max=nums[0];
        if(nums[i]>nums[i-1]){
            return nums[i];
        }

        return max(nums,i+1);
    }
    public static int max2(int [] nums,int i){
        
        if(i==nums.length-1){
            return nums[i];
        }

        int maxVal=max2(nums,i+1);

        // System.out.println(nums[i]);

        if(nums[i] > maxVal){
            return nums[i];
        }else{
            return maxVal;
        }
    }
    public static int search(int [] nums,int i){
        
        if(i==nums.length-1){
            return nums[i];
        }

        return nums[i]+sum2(nums,i+1);
        // System.out.println(i);

    }
    public static boolean search2(int [] nums,int i, int t){
        
        if(i==nums.length-1){
            return nums[i]==t;
        }

        return search2(nums,i+1,t);
        // System.out.println(i);

    }
    public static boolean search3(int [] nums,int i, int t){
        
        if(i==nums.length-1){
            return nums[i]==t;
        }

        if(nums[i] == t){
            return true;
        }

        return search3(nums,i+1,t);
        // System.out.println(i);

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        
        // System.out.println("sum: "+sum2(nums,0));
        // System.out.println("max: "+max2(nums,0));
        System.out.println("search: "+search3(nums,0,5));
    }
}
