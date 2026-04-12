/**
Day 51 – Mini Project #7
Task: Implement Search Toolkit in Java
Functions: linear, binary (iterative + recursive), min/max, first/last occurrence.
Goal: Consolidate searching knowledge.
 */

public class implementSearch {

    // 1. Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 2. Binary Search - Iterative
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // 3. Binary Search - Recursive
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high);
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1);
        }
    }

    // 4. Find Minimum in Array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 5. Find Maximum in Array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 6. First Occurrence of Target (in sorted array)
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;      // Store result and search left for first occurrence
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // 7. Last Occurrence of Target (in sorted array)
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;      // Store result and search right for last occurrence
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Main method to test all functions
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 7, 9, 11};
        int target = 5;

        System.out.println("Linear Search: " + linearSearch(arr, target));
        System.out.println("Binary Search Iterative: " + binarySearchIterative(arr, target));
        System.out.println("Binary Search Recursive: " + binarySearchRecursive(arr, target, 0, arr.length-1));
        
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Maximum: " + findMax(arr));
        
        System.out.println("First Occurrence of " + target + ": " + firstOccurrence(arr, target));
        System.out.println("Last Occurrence of " + target + ": " + lastOccurrence(arr, target));
    }
}
