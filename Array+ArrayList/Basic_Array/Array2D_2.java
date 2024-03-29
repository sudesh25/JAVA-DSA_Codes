import java.util.*;
public class Array2D_2 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the element of matrix"); 
        int matrix[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               matrix[i][j]=sc.nextInt();
            }
        }  
        System.out.println("Enter the element to be search");
        int n=sc.nextInt();

         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               if(matrix[i][j]==n)
               {
                System.out.println((i+1)+" "+(j+1));
                break;
               } 
               
            }
        } 

    }
}
