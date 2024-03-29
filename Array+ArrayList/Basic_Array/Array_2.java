import java.util.*;
public class Array_2 {
    public static void main(String args[])
    {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt(); 
        String name[]=new String[size];

        for(int i=0;i<size;i++)
        {
            name[i]=sc.next();
        }
        for(int i=0;i<size;i++) 
        {
            System.out.println(name[i]);
        }
    }
}
