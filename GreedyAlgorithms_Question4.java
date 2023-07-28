public class GreedyAlgorithms_Question4 {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int buyingprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyingprice<prices[i]){
                int profit=prices[i]-buyingprice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyingprice=prices[i];
            }

        }
        System.out.println(maxProfit);
    }
    
}
