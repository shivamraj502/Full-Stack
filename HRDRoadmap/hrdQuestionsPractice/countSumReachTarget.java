// sum must be greater than k(target)
import java.util.Scanner;

public class countSumReachTarget {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n,count=0,count2=0;
        int target=3;
        int sum=0;

        System.out.println("target is: "+ target);
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
ṇ
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum>target){
                    count++;
                    // System.out.println(count);
                }count2++;
            }sum =0;
        }System.out.println("total count is: "+count);
        // System.out.println("total count2 is: "+count2);
    }
}