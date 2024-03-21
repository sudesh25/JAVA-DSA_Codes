// https://www.geeksforgeeks.org/problems/rearrange-the-array5802/0
import java.util.*;
public class RearrangeArr {
    public static void main(String[] args) {
            int arr[]={1, 9, 2, 8, 3, 7, 4, 6, 5}; 
            int n=arr.length; 
            rearrangeArray(arr,n);
    } 
    static void rearrangeArray(int[] arr, int n) 
    {
          Arrays.sort(arr);  
          int a=0;
          int ans[]=new int [arr.length];
          for (int i = 0; i < arr.length; i++) {
              ans[i]=arr[i];
          }  
           
          for (int i = 0; i < ans.length/2; i++) {
               
              ans[a]=arr[i]; 
              a++;
              ans[a]=arr[n-i]; 
              a++;
          }

    }
}
ffdgffdgfx      