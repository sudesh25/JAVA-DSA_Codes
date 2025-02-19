import java.util.*;
public class Switch { 
    public static void main(String [] args)
    { 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = Sc.nextInt();
        System.out.print("Enter the second: ");
        int num2 = Sc.nextInt();  
        System.out.print("Enter choice for operation\n1: Additon\n2: Substraction\n3: Multiplication\n4: Division\n");
        int choice=Sc.nextInt();

        switch(choice)
        {
            case 1:
            {
                System.out.print("The addtion of two numbers are: "+(num1+num2)); 
                break;
            } 
            case 2:
            {
                 System.out.print("The substraction of two number are: "+(num2-num1));
                 break;
            }
            case 3:
            {
                System.out.print("The multiplication of two number are:"+(num1*num2));
                break;
            } 
            case 4:
            {
                System.out.print("The division of two number are:"+(num1/num2));
                break;
            }
            default:
            {
                System.out.print("Enter the valid input");
            }
            
        }
    }
    
}
