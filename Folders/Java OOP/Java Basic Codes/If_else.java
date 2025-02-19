import java.util.Scanner;

public class If_else {
        public static void main(String []args)
        {
           Scanner Sc =new Scanner(System.in);     // Scanner Sc =new Scanner(System.in); 
           System.out.print("Enter the First number: ");
            int a=Sc.nextInt(); 
            System.out.print("Enter the second number: ");
            int b=Sc.nextInt(); 
            
            if(a==b) 
            {
                System.out.print("Both Given number are equal");
            } 
            else if(a<b) 
            {
                 System.out.print("Second number are larger then first number");
            } 
            else {
                System.out.print("First number are larger than second number");
            }
        }
}
