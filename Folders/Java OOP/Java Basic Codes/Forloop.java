import java.util.*;
public class Forloop {
      public static void main(String []args) 
      {
        int sum=0; 
        
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in); 
        int num=sc.nextInt();
        for(int i=0;i<=num;i++) 
        {
            sum=sum+i;
           // System.out.print(sum+"\t");
        }
        System.out.print("The Sum of all number is "+sum);

      }
}
