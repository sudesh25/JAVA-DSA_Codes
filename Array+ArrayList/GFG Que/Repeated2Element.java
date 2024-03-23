//https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

import java.util.*;
class Repeated2Element {
     public static void main(String[] args) {
         int arr[] = {5, 4, 7, 2, 8, 1, 3, 9, 6, 4, 3}; 
         System.out.println(Arrays.toString(twoRepeated(arr)));
     } 
   static   int[] twoRepeated(int arr[] )
    {   int index=0;
        int ans[]=new int [4];
        for (int i = 0; i < arr.length; i++) {
             
            for (int j = 0; j < arr.length; j++) {
                 if(j!=i)
                 {
                    if(arr[i]==arr[j])
                    {
                        ans[index]=arr[i]; 
                        index++; 
                        break;
                    }
                 }
            }
        }  
      
      

    }
} 
dfhfbdf