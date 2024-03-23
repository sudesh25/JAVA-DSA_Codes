//  https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

public class EquilibriumPoint {
    public static void main(String[] args) {
        long A[] = {1,3,5,2,2};
        System.out.println(equilibriumPoint(A));
    } 
    static int equilibriumPoint(long arr[]) {  
        if(arr.length==1)
        {
            return 1;
        } 
        if(arr.length==2)
        {
            if(arr[0]==0 || arr[1]==0)
             {
                if(arr[0]==0)
                {
                    return 2;
                }
                else{
                    return 1;
                }
             }
           
        }
        long sum=0;
         for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
         }  
         
         long sum2=0;     
         for (int i = 0; i < arr.length; i++) { 
            if(i==0) 
            {
                sum=sum-arr[i]; 
            } 
            else 
            {
             sum2=sum2+arr[i-1]; 
             sum=sum-arr[i]; 
             if(sum==sum2)
             {
                return i+1;
             } 
            }
         }

         return -1;
    }
}
