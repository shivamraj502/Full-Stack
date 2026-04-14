/**
Day 55 – Merge Sort (Divide and Conquer)
Concept: Recursively divide array and merge sorted halves.
Problem: Merge Sort – LeetCode 912
Goal: Understand recursion depth & merging logic.
 */
public class MergeSort2 {
    public static void mergeSort(int arr[],int left,int right){

        int mid=(left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr,left,right);
    }

    public static int[] merge(int[] arr,int left,int right){
        int mid = ( left + right)/2;

        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {5,8,9,88,4};
        int left=0;
        int right=arr.length-1;
        mergeSort(arr,left,right);
    }
}
