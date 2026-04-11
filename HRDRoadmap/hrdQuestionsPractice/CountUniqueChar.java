// Count Unique Characters in a String
// Question: Count how many unique characters are in a string.

import java.util.HashSet;
import java.util.Set;
public class CountUniqueChar {
    public static int countUniqueChar(String s,Set set1){
    
        for(int i=0;i<s.length();i++){
            if(set1.contains(s.charAt(i))){
                continue;
            }else{
                // System.out.println(s.charAt(i));
                set1.add(s.charAt(i));
            } 
        }
        
        return set1.size();
    }
    public static void main(String[] args) {
        Set<String> set1= new HashSet<String>();

        String s="programming";
        System.out.println("Output: "+ countUniqueChar(s,set1));
    }
    
}


/**
Example:
Input: programming
Output: 8
 */



//                              MISTAKE
// public class CountUniqueChar {
    
//     public static int countUniqueChar(String s){
//     boolean bool=true;
//     int count = 0;

//         for(int i=0;i<s.length();i++){
//             for(int j=0;j<s.length();j++){
//                 if(i != j && s.charAt(i)==s.charAt(j)){
//                     bool=false;
//                     // System.out.println(".");
//                     // System.out.println(s.charAt(i));
//                     break;
//                 }
//                 if(j==s.length()-1){System.out.println(s.charAt(i)); count++;}
//                 bool=true;
//             }
            
//         }return count;
//     }
//     public static void main(String[] args) {
//         String s="programming";
//         System.out.println("Output: "+ countUniqueChar(s));
//     }
    
// }


// /**
// Count Unique Characters in a String
// Question: Count how many unique characters are in a string.

// Example:
// Input: programming
// Output: 8
//  */