class Solution {
    public int maxProfit(int[] prices) {
    int buy = 0;
    int sell = 0;
    int profit = 0;
    int min = 0;

    for (int i = 0; i <= prices.length-1 ; i ++)  {
        if(prices[i] - prices[buy] > profit){
            sell = i;
            profit = prices[sell] - prices[buy];
            }

        if(profit == 0 && prices[buy] > prices[i]){
            buy = i;
            sell = i;
        }

        if(prices[i] < prices[min]){
            min = i;
        }
        if((prices[i] - prices[min] > profit)){
            sell = i;
            buy = min;
            profit = prices[sell] - prices[buy];
        }

       
    }
    return profit;

    }
    
}