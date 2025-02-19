import java.util.*;
public class Function_2 { 
    public static int sum(int a,int b) 
    {
        int sum; sum=a+b;
        return(sum);
    }
     public static void main(String args[]) 
     { 
        Scanner sc=new Scanner(System.in) ;
       System.out.print("Enter the first no: "); 
       int a=sc.nextInt(); 
       System.out.print("Enter the Second  no: "); 
       int b=sc.nextInt();
       System.out.print("The sum is: "+sum(a,b));

    }
}