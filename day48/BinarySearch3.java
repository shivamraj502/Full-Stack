/**
Day 48 – Binary Search (Recursive)
Concept: Implement recursive approach and compare performance.
Problem: Recursive Binary Search – GFG
Goal: Strengthen recursion understanding.
 */
public class BinarySearch3 {
    public static int search(int [] nums,int target,int low,int high){
        int mid = low + (high - low)/2;

        if(low>high){return -1;}

        if(nums[mid] == target){
                return mid;
        }else if(nums[mid] > target){
                high = mid -1;
        }else{
                low = mid+1;
        }

        return search(nums, target,low,high);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int target = 1;
        int low=0;
        int high=nums.length-1;
        System.out.println("index: "+ search(nums,target,low,high));
    }
}
