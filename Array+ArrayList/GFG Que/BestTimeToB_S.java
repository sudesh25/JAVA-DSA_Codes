// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToB_S {
       public static void main(String[] args) {
          int arr []={7,1,5,3,6,4}; 
          System.out.println(maxProfit(arr)); 
       } 
 public static int maxProfit(int[] prices) {   

     if(prices.length == 1 || prices.length==0)
     {
        return 0;
     }  
      int max=0;
      int min = 0; 
     for (int i = 0; i < prices.length; i++) {
          if(i == 0)
          {
            min = prices[i];
            max = prices[i];
          }  
          else 
          {
            if(min > prices[i] && i!=prices.length-1)
            {
                 min = prices[i] ;
                 max = prices[i];    
            }  
            else if(max<prices[i])
            {
                max = prices[i]; 
            }
          } 
     }
    return max-min ;
 }

}  