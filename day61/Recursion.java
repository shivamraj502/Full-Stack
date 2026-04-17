/**
Day 61 – Introduction to Recursion
Concept: Base case, recursive case, stack memory visualization.
Task: Write printNumbers(n) recursively.
Problem: Print 1 to N using Recursion – GFG
Goal: Build mental model of recursive calls.
 */
public class Recursion {
    public static int recursion(int n){
        if(n==1){return n;}
        return recursion(n-1);
    }
    public static void recursion2(int n){
        int i=1;
        if(i==n){ System.out.println(i);return;}
        
        System.out.println(i);
        recursion2(i+1);
    }
    public static void recursion3(int n){
        int i=1;
        if(n==0){return;} 
        
        System.out.println(n);
        recursion3(n-1);
    }
    public static void recursion4(int n){
        int i=1;
        if(n==0){return;} 

        recursion4(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n=6;
        recursion4(n);
    }
}
