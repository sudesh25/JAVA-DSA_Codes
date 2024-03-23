//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions

import java.util.*;

public class DuplicateArr {
     public static void main(String[] args) {
        int a[] = {2 ,4 ,3 ,0 ,4};
        System.out.println(duplicates(a));
     } 
      static ArrayList<Integer> duplicates(int arr[]) { 
        Arrays.sort(arr);
        int flag=0; 
        int ele=arr[0]; 
        int count=-1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
                                                 //{0,2,3,4,4}
    for (int i = 1; i < arr.length; i++) {
     
         if(arr[i]==ele)
         {
             if(arr[i]!=count)
             {
                ans.add(arr[i]); 
                //count=arr[i];
                flag=1;
             }
         }  
         ele=arr[i]; 
         
}
      if(flag==0)
      {
        ans.add(-1); 
        return ans;
      } 

         return ans;
    }
}
