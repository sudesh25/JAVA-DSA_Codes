// https://www.geeksforgeeks.org/problems/maximize-arrii-of-an-array0026/1?page=2&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions
import java.util.*;
public class MaximizeSum {
    public static void main(String[] args) {
         int arr[]={5, 3, 2, 4, 1}; 
         System.out.println(Maximize(arr));
    }
   static  int Maximize(int arr[])
    {   long sum=0; 

        for (int i = 0; i < arr.length-1; i++) {
             int pos=i;
           
             for (int j = i+1; j < arr.length; j++) {
                    if(arr[pos]>arr[j])
                    {
                        pos=j;
                    }
             } 
           int temp=arr[pos];
           arr[pos]=arr[i];
           arr[i]=temp; 

          
        }    
        System.out.println(Arrays.toString(arr));
      
        for (int i = 0; i < arr.length; i++) {
           sum=sum+i*arr[i];
       }  

       
        return (int)sum ; 
        
    }
}
