import java.util.*;
 public class WhileLoop {
     public static void main (String [] args) 
     { 
         System.out.print("Enter the value: ");
         Scanner sc=new Scanner(System.in); 
         int num=sc.nextInt(); 
         int i=0;
         while(num!=i) 
         { 
            System.out.print(i+"\t"); 
            i++;
         }
     }
}
