
import java.util.*;
public class BinarySearchIn2D {
    public static void main(String[] args) {
             
        int arr[][]={ 
                      {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16},
                      {17,18,19,20}
                      };   
                     
        int k=2;
       System.out.println(Arrays.toString(search2D(arr,k)));
        

    } 
         static int[] search2D(int arr[][],int k)  
         { 
                int r=0;
                int c=arr[r].length-1; 
               
                while(r<arr.length && c>=0)
                {
                     if(arr[r][c]==k)
                     {
                        return new int[]{r,c};
                     } 
                     if(arr[r][c]<k) 
                     {
                        r++;
                     } 
                     else {
                        c--;
                     }
                }  
                return new int[]{-1,-1};

         }
    
}
