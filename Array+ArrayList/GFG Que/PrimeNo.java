//https://www.geeksforgeeks.org/problems/prime-number2314/0

public class PrimeNo {
    public static void main(String[] args) {
         int n=1; 
         System.out.println(prime(n));
    } 
    static int prime(int n) 
    {  
        if(n==1)
         {
             return 0;
         }
 
     for (int i = 2; i*i <=n; i++) { 
         
            if(n%i==0)
            {
                return 0;
            } 
        } 
        return 1;
    }
}

