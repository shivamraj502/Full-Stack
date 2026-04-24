import java.util.*;
public class leetcode217 {
    public static boolean isDup(int [] nums){
        boolean bool = true;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){ 
        set.add(nums[i]);
        }
        
        if(set.size()==nums.length){bool=false;}

        return bool;
    }
    public static boolean isDup2(int[] nums) {
        // boolean bool = true;
        Set<Integer> set = new HashSet<>();

        for(int num : nums){ 
        set.add(num);
        }
        
        if(set.size()==nums.length){return false;}

        return true;
    }
    public static void main(String[] args) {
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