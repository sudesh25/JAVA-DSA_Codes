//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
import java.util.*;
public class MissingNo {
    public static void main(String[] args) {
         int arr[]={1,2,3,5};  
         int n=5;
         System.out.println(missingNumber(arr,n));
    }  
   static  int missingNumber(int array[], int n) { 
        Arrays.sort(array);
          
          for (int i = 0; i <n-1; i++) {
            if(array[i]!=i+1)
            {
               return i+1;
            }
          } 
          return  n;

      
}
}   