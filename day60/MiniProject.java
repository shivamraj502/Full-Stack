/**
Day 60 – MiniProject #8
Task: Build a Sorting Visualizer (Console-based)
Input array, choose sorting method, display each pass.
Goal: Reinforce understanding by simulating sorting steps.
 */

import java.util.Scanner;
public class MiniProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sorting Visualizer (Console) ===\n");

        // Take array input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Show menu
        System.out.println("\nChoose Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("\nOriginal Array:");
        printArray(arr);

        System.out.println("\nSorting Process:\n");

        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                selectionSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            case 4:
                mergeSort(arr);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nSorting Completed!");
        System.out.println("Final Sorted Array:");
        printArray(arr);

        sc.close();
    }

    // ==================== Bubble Sort ====================
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArray(arr);
            }
            System.out.println("-------------------");
        }
    }

    // ==================== Selection Sort ====================
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            printArray(arr);
            System.out.println("-------------------");
        }
    }

    // ==================== Insertion Sort ====================
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            System.out.println("Pass " + i + " (Inserting " + key + "):");

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);
            }
            arr[j + 1] = key;
            printArray(arr);
            System.out.println("-------------------");
        }
    }

    // ==================== Merge Sort with Visualization ====================
    public static void mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // Recursively sort left and right halves
        mergeSortHelper(arr, left, mid);
        mergeSortHelper(arr, mid + 1, right);

        // Merge the sorted halves
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        System.out.println("Merging: [" + left + " to " + mid + "] and [" + (mid+1) + " to " + right + "]");

        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }

        printArray(arr);   // Show array after each merge
        System.out.println("-------------------");
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}