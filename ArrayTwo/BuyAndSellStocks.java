package ArrayTwo;

public class BuyAndSellStocks {

    // Time complexity: O(n)
    public static int maxProfit(int prices[]){
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        minBuyPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            if(minBuyPrice < prices[i]){ // profit
                int Profit = prices[i] - minBuyPrice; // today profit
                maxProfit = Math.max(maxProfit, Profit);  // max profit
            }else{
                minBuyPrice = prices[i]; // update buy price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.print("Max Profit: " + maxProfit(prices));
    }
}
