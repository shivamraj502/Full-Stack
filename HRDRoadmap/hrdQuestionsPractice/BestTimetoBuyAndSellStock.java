public class BestTimetoBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j>=0;j--){
                if((prices[i]-prices[j])>max){
                    max = prices[i]-prices[j];
                    // System.out.println(".");
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        // int arr[] = {7,1,5,3,6,4};
        int arr[] = {7,6,4,3,1};
        System.out.println("Max profit: "+maxProfit(arr));
    }
}


/**
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */