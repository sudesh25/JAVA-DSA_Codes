// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays,Strings&sortBy=submissions

import java.util.ArrayList;

public class ArrayLeaders {
     public static void main(String args[]) {
        int arr[]={16,17,4,3,5,2};
        System.out.println(leaders(arr).toString());
     } 
      static ArrayList<Integer> leaders(int arr[]) {

            ArrayList<Integer> ans =new ArrayList<>();  
            ans.add(arr[arr.length-1]);
            
            int counter=arr.length-1;
            for (int i = arr.length-2; i >=0 ; i--) {
              
                    if(arr[i]>=counter)
                    {
                        ans.add(arr[i]);
                        counter=arr[i];
                    }
        } 
        return ans;
    }
}
