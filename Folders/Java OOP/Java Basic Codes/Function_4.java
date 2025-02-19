 import java.util.*;
 public class Function_4 { 
    public static void primeCheck(int num)
    {  
        int flag=1;
        for(int i=2;i<num;i++)
        {
           if(num%i==0) 
           {
            flag=1;
            break;
           } 
           else 
           {
            flag=0;
           }
        } 
        if(flag==1) 
        {
            System.out.print("The Given no. is not prime :");
        }
        else
        {
            System.out.print("The Given no. is prime:");
        }

    }
         public static void main(String args[])
         {
            System.out.print("Enter the num: ");
            Scanner sc=new Scanner(System.in);
            int num=  sc.nextInt();
            primeCheck(num);
         }
}
