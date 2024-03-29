import java.util.*;
public class Array_3 {
    public static void main(String args[])
    {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt(); 
        String name[]=new String[size];
       int number[]= new int[size];
       for(int i=0;i<size;i++)
       {
        number[i]=sc.nextInt();
       }
        
       int min=number[0];
       int max=number[size-1]; 
       for(int i=0;i<size;i++)
       {
        if(number[i]>max)
        {
            max=number[i];
        } 
        else if(number[i]<min)
        {
            min=number[i];
        } 
        
       }
       System.out.println("Length min:"+min);
        System.out.println("Length max:"+max);
    }
}
