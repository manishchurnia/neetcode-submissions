class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int minprice=price[0];
        int maxpro=0;
        for(int i=1;i<n;i++){
            if(price[i]<minprice)minprice=price[i];
            else if(price[i]-minprice>maxpro)maxpro=price[i]-minprice;
        }
        return maxpro;
    }
}
