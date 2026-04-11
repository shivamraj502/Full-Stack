public class ArrangeZeroes {
    public static int[] arrangeZeroes(int[] arr){
        int arr2[]=new int[arr.length];
        int count =0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0 && count<arr.length){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i--;
            }
                count++;
        }

        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }

        return arr2;
    }
    public static void main(String[] args) {
        int[] arr={4, 5, 0, 1, 9, 0, 5, 0};
        int arr2[] = arrangeZeroes(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]);
        }
    }
    
}

/**
Example 1:
Input: 4, 5, 0, 1, 9, 0, 5, 0
Output: 4, 5, 1, 9, 5, 0, 0, 0

Example 2:
Input: 6, 0, 1, 8, 0, 2
Output: 6, 1, 8, 2, 0, 0

Example 3:
Input: 1, 2, 3, 4
Output: 1, 2, 3, 4
 */