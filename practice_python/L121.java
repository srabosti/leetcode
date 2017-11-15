class Solution {
    public int maxProfit(int[] prices) {
        int minValue= Integer.MAX_VALUE;
        int maxValue=0;
        for(int i=0;i<prices.length;i++){
            minValue = Math.min(prices[i],minValue);
            maxValue = Math.max(maxValue,prices[i]-minValue);
        }
        
        return maxValue;
        
    }
}