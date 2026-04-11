public class TotalSubstringsLengthKOneVowel {
    public static int countSubstrings(String s,int k){
        int count=0;
        for(int i=0;i<s.length()-k+1;i++){
            int temp=0;
            for(int j=i;j<k+i;j++){
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    temp++;}
            }
            if(temp==1){count++;}
        }

        return count;
    }
    public static void main(String[] args) {
        String s="abecidofugxyz";
        int k=5;
        System.out.println("Total Substrings: "+ countSubstrings(s,k));
    }
    
}
