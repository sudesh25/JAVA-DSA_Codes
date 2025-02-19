import java.util.*; 
import java.util.Scanner.*;
 public class Function_3 { 
    public static int fact(int num)
    {
       int sum=1;
       for(int n=num;n>=1;n--)
       {
        sum=sum*n;
       }
       return sum;
    }
    public static void main(String args[]) 
    {
        System.out.print("Enter the value: ");
        Scanner sc= new Scanner(System.in); 
        int num=sc.nextInt(); 
      //  fact(num);
        System.out.print("The factorial of "+num+" is "+fact(num));
                 
    }
}
