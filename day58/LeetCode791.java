/**
Day 58 – Sorting in Java & Comparators
Concept: Arrays.sort(), Collections.sort(), and custom comparators.
Problem: Custom Sort String – LeetCode791
Goal: Learn practical sorting in Java for objects.
 */
public class LeetCode791 {
    public static String sort(String s, String order){
        String str="";
        int tempCount=0;
        
        for(int i=0;i<order.length();i++){
            int count=0;

            for(int j=0;j<s.length();j++){
                if(order.charAt(i)==s.charAt(j)){
                    count++;
                    tempCount++;
                }
            }

            for(int k=0;k<count;k++){
                str+=order.charAt(i);
            }
        }
        // System.out.println(tempCount);

        for(int i=tempCount;i<s.length();i++){
            str += s.charAt(i);
        }

        // System.out.println("string: "+ str);

        return str;
    }
    public static void main(String[] args) {
            String s = "abcd";
            String order = "bcafg";
            String str =sort(s,order);
            System.out.println("result: "+str);
    }
}

/**
Example 1:

Input: order = "cba", s = "abcd"

Output: "cbad"

Example 2:

Input: order = "bcafg", s = "abcd"

Output: "bcad"
 */