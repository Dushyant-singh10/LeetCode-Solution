class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int price :prices){
            if(price<buyprice){
                buyprice = price;
            } else if ((price - buyprice) > maximumProfit){
            maximumProfit = price - buyprice;
            }
            
        }
        return maximumProfit;
        
    }
}