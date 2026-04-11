public class leetcode309 {
    public static int maxProfit(int [] prices){
        int max=0;
        for(int i=0;i<prices.length;i++){
            // System.out.println(".");
            for(int j=i;j<prices.length;j++){
                // System.out.println("-");
                if(prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];
                    continue;
                }
            }
            // System.out.println();
        }

        return max;
    }
    public static void main(String[] args) {
        int []prices ={1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }
}

/**
Example 1:

Input: prices = [1,2,3,0,2]
Output: 3
Explanation: transactions = [buy, sell, cooldown, buy, sell]
Example 2:

Input: prices = [1]
Output: 0
 */