// https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions
import java.util.*;
public class BitonicPoint {
     public static void main(String[] args) {
         int arr[] = {1,15,25,45,42,21,17,12,11};
          System.out.println(findMaximum(arr));
     } 
   static  int findMaximum(int[] arr) {
          Arrays.sort(arr);  
          if(arr[0]<arr[arr.length-1])
          {
            return arr[arr.length-1];
          } 
        return -1;
    }
}
