class Solution {
    public int maxProfit(int[] prices) {
         int ms=prices[0];
         int mi=0;
        
        int i=1;
        int mp=0;
        while(i<prices.length){
            if(prices[i]<prices[mi]){
                ms=prices[i];
                mi=i;
            }else{
                 int p=Math.abs(prices[i]-prices[mi]);
                 mp=Math.max(mp,p);
            }
           
            i++;

        }
        return mp;

    }
}