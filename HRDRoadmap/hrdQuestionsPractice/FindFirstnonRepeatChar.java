public class FindFirstnonRepeatChar {
    public static char findFirstUniqueChar(String s){
        boolean bool=true;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i != j && s.charAt(i)==s.charAt(j)){
                    bool=false;
                    // System.out.println(".");
                    // System.out.println(s.charAt(i));
                    break;
                }
                if(j==s.length()-1){return s.charAt(i);}
            }
            if(bool==true){return s.charAt(i);}
            bool=true;
            
        }return 0;
    }
    public static void main(String[] args) {
        String s="aabbccddeef";
        System.out.println("Output: "+ findFirstUniqueChar(s));
    }
    
}

/**
Input: aabbcddee
Output: c
 */