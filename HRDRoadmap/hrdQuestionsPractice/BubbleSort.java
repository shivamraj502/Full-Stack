// Day 25 — Sorting Basics
// Concept: Bubble sort, selection sort.
// Problem: Bubble Sort – GFG

// Hint (simple idea)
// Compare neighbor numbers
// If left number is bigger, swap them
// After one full round, the largest number goes to the end
// Repeat until sorted
// Think of bubbles rising to the top

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Before Bubble sort:");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");}
        System.out.println();
        
        bubblesort(arr,n);
    }

    public static void bubblesort(int []arr,int n){
        for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            }
            // System.out.println(Arrays.toString(arr));
        }}

        System.out.println("After Bubble sort:");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");}

    }
}
