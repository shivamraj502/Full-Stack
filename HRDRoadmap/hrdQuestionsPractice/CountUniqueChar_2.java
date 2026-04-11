public class CountUniqueChar_2 {
    public static int countUniqueChar(String s){
    boolean bool=true;
    int count = 0;
    int len = s.length();
    
        for(int i=0;i<s.length();i++){
            for(int j=0;j<len;j++){
                System.out.print(".");
                // if(s.charAt(i)==s.charAt(j))
                
            }System.out.println();
            len--;

            
        }return count;
    }
    public static void main(String[] args) {
        String s="programming";
        System.out.println("Output: "+ countUniqueChar(s));
    }
    
}


/**
Count Unique Characters in a String
Question: Count how many unique characters are in a string.

Example:
Input: programming
Output: 8
 */