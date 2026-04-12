/**
 * Day 50 – Binary Search on Answer (Advanced Concept)
 * Concept: Use binary search to solve optimization problems.
 * Problem: Koko Eating Bananas – LeetCode875
 * Goal: Master problem-solving using binary search beyond arrays.
 */
public class LeetCode875 {
    public static int minEatingSpeed(int[] piles, int h) {

        int min=piles[0];
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]<min){min=piles[i];}
            if(piles[i]>max){max=piles[i];}
        }System.out.println("min: "+min+" ,max: "+max);

        for(int i=1;i<=max;i++){ 
            int sum=0;
            for(int j=0;j<piles.length;j++){
            if(piles[j]%i==0){
                // System.out.println("new: "+ (piles[j]/i));
                sum=sum+(piles[j]/i);
                // System.out.println("new sum: "+sum);
            }else{
                // System.out.println("else new: "+ ((piles[j]/i)+1));
                sum=sum+((piles[j]/i)+1);
                // System.out.println("else sum: "+sum);
            }
        }
            // System.out.println("sum: "+sum);
            if(sum==h){return i;}
        }
        return -1;   
    }

    public static void main(String[] args) {
        int[] piles = { 30,11,23,4,20 };
        int h = 6;
        System.out.println("speed: "+minEatingSpeed(piles, h));
    }
}

/**
 * Example 1:
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 * Example 2:
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 * Example 3:
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 */