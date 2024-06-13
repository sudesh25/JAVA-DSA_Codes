//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/0
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FindIndexesOfsubarray {
    public static void main(String[] args) { 
         int S = 0;
        int A[] = {1,2,3,7,5}; 
        System.out.println( (subarraySum(A,S)));
     } 
     static ArrayList<Integer> subarraySum(int[] arr, int s) 
        {   int flag=0;
            int count=0;  
            
            ArrayList<Integer> str = new ArrayList<Integer>();
            int ans=0;   
            int left=0; 
            int right=0; 
            while(right<arr.length)
            {     
                ans=ans+arr[right];  
                if(right==0 && ans>s) 
                {
                   for (int i = 0; i < arr.length; i++) {
                       if(arr[i]==0)
                       {
                        str.add(i+1); 
                        str.add(i+1);
                        return str;
                       }
                   } 
                   str.add(-1);
                   return str;
                }
                if(ans==s)
                {   
                    str.add(left+1);
                    str.add(right+1); 
                    return str;
                }  
                if(ans>s)
                {
                    while(ans>s && left<=right) 
                    {
                      ans=ans-arr[left++];  
                    }
                } 
                if(ans==s)
                {   
                    str.add(left+1);
                    str.add(right+1); 
                    return str;
                }  
                
                right++;
            }  

            str. add(-1);
            return str;
    } 
}

