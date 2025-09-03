public class bestTimeToBuyAndSellStock {

    // From Starting to Ending - traversing
    public static int maxProfit(int[] prices){
        int n = prices.length;
        int cost = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            cost = Math.min(cost, prices[i]);
            profit = Math.max(profit, prices[i]-cost);
        }
        return profit;
    }

    // II Method 
    // From Ending to Starting - traversing
    // public static int maxProfit(int[] prices){
    //     int n = prices.length;
    //     int profit = 0;
    //     int max = prices[n-1];
    //     for(int i= n-2; i>=0; i--){
    //         if(prices[i] < max){
    //             profit = Math.max(profit, max-prices[i]);
    //         }
    //         max = Math.max(max, prices[i]);
    //     }
    //     return profit;
    // }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
