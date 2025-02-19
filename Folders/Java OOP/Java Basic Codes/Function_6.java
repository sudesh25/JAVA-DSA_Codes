import java.util.*;
public class Function_6 {      
    public static void main(String args[])
    {   System.out.print("Enter the length of Fibbonachi: ");
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
        int n3,n1=0,n2=1; 
        System.out.print(n1+" ");
        for(int i=0;i<=n;i++)
        {
            n3=n1+n2;
            System.out.print(n2+" "); 
            n1=n2;
            n2=n3;
        }
    }
}
