// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/0 
import java.util.*;
public class MissingNumberInArray {
     public static void main(String[] args) {
      int   N = 2;
         int A[] = {2 ,3 ,4 ,1 ,6 ,7}; 
         System.out.println(missingNumber(A,N));
     }  
    static  int missingNumber(int array[], int n) {
        int ans=0;  
        Arrays.sort(array);  
       int  flag=0;
        for (int i = 0; i < array.length; i++) {
             if(array[i]!=i+1) 
             {
                return i+1; 
             } 
        }  
       return n;
    }

}


