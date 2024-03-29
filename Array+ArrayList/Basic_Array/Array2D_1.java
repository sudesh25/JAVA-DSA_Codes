import java.util.*;
public class Array2D_1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int marks[][]=new int[3][2]; 
         
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                marks[i][j]=sc.nextInt();
            }
        } 
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {  
                System.out.print(marks[i][j]+"\t");
            } 
        System.out.println();}

    }
}
