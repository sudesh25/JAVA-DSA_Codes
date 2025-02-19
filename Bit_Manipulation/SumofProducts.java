//https://www.geeksforgeeks.org/problems/sum-of-products5049/0

public class SumofProducts {
    public static void main(String[] args) {

    long [] arr = {40,30}; 
       System.out.println(pairAndSum(arr));
    }
    static long pairAndSum(long arr[]) {
           
         long sum=0; 
        
        for (int i = 0; i < arr.length-1; i++)
        {
             for (int j = i+1; j < arr.length; j++) 
             {
                  sum=sum+(arr[i]&arr[j]);  
             }
        }

         return sum; 
    }
}
// need to optimize it 