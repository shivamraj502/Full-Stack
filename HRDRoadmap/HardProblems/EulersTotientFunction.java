public class EulersTotientFunction {
    public static void gcd(int n,int m){
        int min,max,count=0,gcd=0;
        if(n>m){max=n;min=m;}
        else {max=m;min=n;}

        for(int i=1;i<min;i++){
            if(max%i==0){gcd=i;count++;}
        }System.out.println("gcd: "+ gcd);
    }
    public static void primefactors(int n){       
        int count=0;
        int size=-1;
        int length=n-1;
        int arr[]=new int[n];

        System.out.println("length: "+length);
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n;j++){

            if(i%j==0){count++;}
            }

            if(count==2){size++;arr[size]=i; }
            count=0;

        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        for(int i=0;i<size;i++){
        for(int j=1;j<n;j++){
            if(arr[i]%j==0){
                System.out.println("arr:"+arr[i]);
                System.out.println("divide:"+j%arr[i]);
                length--;}
            }
        }System.out.println("length: "+length);

    }
    public static void euler(int n){       
        
        System.out.println();
    }
    public static void main(String[] args) {
        int n=11;
        euler(n);

        // int m=10;
        // gcd(n, m);
        primefactors(n);
    }
}

/**
Euler's Totient Function
Examples:
Input: n = 11
Output: 10
Explanation: From 1 to 11, 1,2,3,4,5,6,7,8,9,10 are relatively prime to 11.

Input: n = 16
Output:  8
Explanation: From 1 to 16, 1,3,5,7,9,11,13,15  are relatively prime to 16.
 */
