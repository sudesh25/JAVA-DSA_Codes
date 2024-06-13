// https://www.geeksforgeeks.org/problems/nth-natural-number/0

public class NthNaturalNumber {
     public static void main(String[] args) {
        long N=9;
        System.out.println(findNth(N));
     } 
  static  long findNth(long N)
     {  long count=0;
        long i=1;
         while(true)
         {
            if(isnine(i)==false)  
            {
               count++;
            } 
           
            if(count==N)
            {
                return i;
            }
            i++; 
         }     
} 
static boolean isnine(long num) 
        {
           while(num>0) 
           {
              if(num%10==9)
              {
                return true;
              } 
              num=num/10;
           } 
           return false;
        }
} // not efficient code  

/*  
 
static long findNth(long N) {
        long result = 0;
        long place = 1;
        
        while (N > 0) {
            result =result + (N % 9) * place;
            N = N / 9;
            place =place * 10;
        }
        
        return result;
    }

 */
