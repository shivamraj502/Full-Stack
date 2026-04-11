// 1. Jack And Jill: write a program to reverse words in given string
// Output: kcaj dna llij

public class JackAndJill {
    public static void reverseWord(StringBuilder s,StringBuilder result, StringBuilder temp){
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                temp.append(s.charAt(i));
            }else{
                temp =temp.reverse();
                result=result.append(temp);
                result.append(' ');
                temp.setLength(0);
            }
        }
        temp =temp.reverse();
        result=result.append(temp);
        System.out.println(result);
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("jack and jill");
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        reverseWord(str,result,temp);
    }
}


/**
 * append, reverse, append
 */