 import java.util.*; 
 public class Function_5 { 
    public static int evenOdd(int num)
    {
        if(num%2==0)
        {
            return(1);
        }
        else{
            return(0);
        }
    }
    public static void main(String args[])
    {
        System.out.print(" Enter the number to be check: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        int flag=evenOdd(num);
        if(flag==1)
        {
            System.out.print("The Given no is even no: ");
        }
        else 
        {
            System.out.print("The Given no is odd no: ");
        }



    }
}
