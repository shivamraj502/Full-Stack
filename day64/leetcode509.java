/**
Day 64 – Factorial and Fibonacci
Concept: Mathematical recursion.
Problem: Nth Fibonacci Number – LeetCode 509
Goal: Understand overlapping subproblems.
 */
public class leetcode509 {
    public static int fact(int n){
        if(n<0){
            System.out.println("invalid input");
            return -1;
        }

        if(n==0 || n == 1 ){
            return n;
        }

        return n*fact(n-1);
    }
    public static int fib(int n){//0 1 1 2 3 5 8
        if(n<0){
            System.out.println("invalid input");
            return -1;
        }

        if(n==0 || n == 1 ){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
    public static int leetcode509(int n){
        if(n<0){
            //System.out.println("invalid input");
            return -1;
        }

        if(n==0 || n == 1 ){
            return n;
        }

        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("output: "+leetcode509(n));
    }
}
