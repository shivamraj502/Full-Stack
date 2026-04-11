// max Sum Subarray
import java.util.Scanner;

public class maxSumSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int max=0;
        int sum=0;

        System.out.println("enter arr length n:");
        n=in.nextInt();
        int []arr = new int[n];

        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("array: ");
        for(int i=0;i<n;i++){
            System.out.print( arr[i]+" ");
        }System.out.println();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum>max){
                    max = sum;
                }
            }sum =0;
        }System.out.println("max is: "+max);
    }
}
