public class LongestPalindromeSubseq {
    public static String longestPalSubseq(String s){
        int start=0,end=s.length()-1;
        char arr[] = s.toCharArray();
        for()
    }
    public static void main(String[] args) {
        String s="1234325";
        System.out.println("Output: "+longestPalSubseq(s));
    }
}


/**
Case,Input,LPS Length,Example LPS,Comment
1,BBABCBCAB,7,BABCBAB,Classic DP example
2,GEEKSFORGEEKS,6,GEEKEG,Repeated letters help
3,character,5,carac,Very frequent interview question
4,racecar,7,racecar,Whole string is palindrome
5,abcd,1,"a (or b,c,d)",Worst case — no repeats
 */