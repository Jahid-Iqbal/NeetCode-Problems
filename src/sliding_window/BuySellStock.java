package sliding_window;

/*
* Best Time to Buy and Sell Stock
You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.

Example 1:

Input: prices = [10,1,5,6,7,1]

Output: 6
* */

public class BuySellStock {

    public int maxProfit(int[] prices){
        int profit= 0;
        int left = 0, right =1;

        while (right<prices.length){
            if (prices[left]<prices[right]){
                profit = Math.max(profit,prices[right]-prices[left]);
            }
            else {
                left=right;
            }
            right++;
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr= {10,8,7,5,2};
        System.out.println(new BuySellStock().maxProfit(arr));

    }
}
