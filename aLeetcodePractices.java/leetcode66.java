/* Plus One */
public class leetcode66 {
    public static int[] plusOne(int[] digits) {
        int sum=0;int n9=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){n9+=1;}
            sum=sum*10+digits[i];
        }sum+=1;

        if(n9 == digits.length){
        int [] temp = new int[digits.length+1];
        for(int i=(digits.length);i>=0;i--){
            temp[i]=sum%10;
            sum/=10;
        }return temp;
        
        }else{
        int [] temp = new int[digits.length];
        for(int i=(digits.length-1);i>=0;i--){
            temp[i]=sum%10;
            sum/=10;
        }return temp;
        }

    }
    public static int[] plusOne2(int[] digits) {
        int sum=0;int n9=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){n9+=1;}
            sum=sum*10+digits[i];
        }sum+=1;

        if(n9 == digits.length){
        int [] temp = new int[digits.length+1];
        for(int i=(digits.length);i>=0;i--){
            temp[i]=sum%10;
            sum/=10;
        }return temp;
        
        }else{
        int [] temp = new int[digits.length];
        for(int i=(digits.length-1);i>=0;i--){
            if(i!=digits.length-1){temp[i]=digits[i]; }
            else if(i==(digits.length-1) && digits[i]==9) {temp[i]=0;digits[i-1]=digits[i-1]+1;}
            else{temp[i]=digits[i]+1;}
        }return temp;
        }
    }
    public static int[] plusOne3(int[] digits) {
        int sum=0;int n9=0;
        
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){n9 += 1;}
            sum=sum*10+digits[i];
        }sum+=1;

        if(n9 == digits.length){
        int [] temp = new int[digits.length+1];
        for(int i=(digits.length);i>=0;i--){
            temp[i] = sum%10;
            sum /= 10;
        }return temp;
        
        }else{
        int [] temp = new int[digits.length];
        for(int i=(digits.length-1);i>=0;i--){

                if(i==digits.length-1 && digits[digits.length-1]==9){
                    for(int j=digits.length-1;j>=0;j--){
                        // System.out.print(".");
                        if(digits[j]==9){
                        temp[j]=0;
                        i--;
                        }else{
                            temp[j]=digits[j]+1;
                            // i--;
                            break;
                        }
                    }System.out.println();
                
            }else{
                if(i==digits.length-1){temp[i]=digits[i]+1;}
                else temp[i]=digits[i];}
        }return temp;
        }

    }
    public static int[] plusOne4(int[] digits) {
        //int sum=0;
        int n9=0;
        
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){n9 += 1;}
            //sum=sum*10+digits[i];
        }//sum+=1;

        if(n9 == digits.length){
        int [] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
        
        }else{
        int [] temp = new int[digits.length];
        for(int i=(digits.length-1);i>=0;i--){

                if(i==digits.length-1 && digits[digits.length-1]==9){
                    for(int j=digits.length-1;j>=0;j--){
                        // System.out.print(".");
                        if(digits[j]==9){
                        temp[j]=0;
                        i--;
                        }else{
                            temp[j]=digits[j]+1;
                            // i--;
                            break;
                        }
                    }System.out.println();
                
            }else{
                if(i==digits.length-1){temp[i]=digits[i]+1;}
                else temp[i]=digits[i];}
        }return temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {9,9,9,9,9,9};
        arr = plusOne3(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/**
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

Ex 4: 9,8,7,6,5,4,3,2,1,0
Ex 5: 8,9,9,9,9
Ex 6: 9,9,8,9,9
 */