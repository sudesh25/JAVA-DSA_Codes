// 
 import java .util .*;

public class SumOfTwoNumbers 
{
    public static void main(String[] args) {
           String X = "25", Y = "23"; 
          System.out.println(findSum(X,Y));
    }  
   static  String findSum(String X, String Y) {
           
        String ans;  
        double a=0; 
        double b=0; 
    
         for (int i = X.length()-1; i >= 0; i--) {
               if(i==X.length()-1) 
               {
                a=X.charAt(i);  
                System.out.println(a);
                b++;
               }
               else 
               {
                a=a+(Math.pow(10,b))*X.charAt(i); 
                b++;
               } 
               
         }  
     //  System.out.println(a);
         return "fdsf";
    }

}