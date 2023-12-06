//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;


public class Array_Form_Int { 
    static List<Integer> addToArrayForm(int[] num, int k) {
     
        int n=num.length-1;  
        int b;
        int  sum=0;
         for (int i = 0; i < num.length; i++) { 
            int a=(int) Math.pow(10,n);
            sum=sum+num[i]*a;
            n--;
         }
         sum=sum+k;   
         int count=0;  
         int num1=sum;
         while(sum!=0)
         {
            sum=sum/10; 
            count++;
         } 
         ArrayList<Integer> list=new ArrayList<>(num.length);    
         int m=num.length-1; 
         while(num1!=0)
         {
           
         }

         
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,0};
        int k=34; 
      //  ArrayList<Integer> list= new ArrayList<>();
      System.out.println( addToArrayForm(arr,k));

      
      //  System.out.println(list);
    }
}

       