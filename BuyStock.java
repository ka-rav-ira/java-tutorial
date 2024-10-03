public class BuyStock {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        int value = BuyStockFnOptimal(arr);
        System.out.println(value);
    }
    
    public static int BuyStockFn(int[] prices){
        
        int i=0;
        int n = prices.length;
        int crMax = 0;
        int mAx = 0;
        while(i<n){
            int j = i+1;
            while(j<n){
                if(prices[j]>prices[i]){
                    int diff = prices[j] - prices[i];
                    crMax = Math.max(diff,crMax);
                    mAx = Math.max(crMax,mAx);
                    j++;
                }else{
                    j++;
                }
            }
            i++;
        }
        return mAx;
    }

    public static int BuyStockFnOptimal(int[] prices){

        //at the beginning the min price is first price
        int buyPrice = prices[0];

        //at the beginning the minimum profit is zero
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            //if the currentPrice is less update the buy price
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }else{
                int crProfit = prices[i] - buyPrice;
                profit = Math.max(crProfit,profit);
            }
        }
        return profit;
    }
}
