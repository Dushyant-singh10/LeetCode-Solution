class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int sellingprice :prices){
            if(sellingprice<buyprice){
                buyprice = sellingprice;
            } else if ((sellingprice - buyprice) > maximumProfit){
            maximumProfit = sellingprice - buyprice;
            }
            
        }
        return maximumProfit;
        
    }
}