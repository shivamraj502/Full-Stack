public class CountSubstringsLengthKStrictlyIncr {
    public static int countSubstrings(String s,int k){
        int count=0;
        
        for(int i=0;i<=s.length()-k;i++){
            int count2=0;
            for(int j=i;j<i+k-1;j++){
                if(s.charAt(j)<s.charAt(j+1)){count2++;}
            }
            if(count2==k-1){count++;}
        }

        return count;
    }
    public static void main(String[] args) {
        String s="abcde";
        int k=4;
        System.out.println("total substrings: "+ countSubstrings(s,k));
    }
}
