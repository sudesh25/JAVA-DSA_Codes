// https://leetcode.com/problems/split-array-largest-sum/description/

import java.util.ArrayList;

public class SplitArray {
    public static void main(String[] args) {
        int arr[]={10,5,13,4,8,4,5,11,14,9,16,10,20,8}; 
        int k=8; 
         System.out.println(splitArray(arr,k));
    } 
    static int splitArray(int[] nums, int k) 
    {   
        int max=0; 
        int sum=0; 
       
        for (int i = 0; i < nums.length; i++) {
           
            sum=sum+nums[i]; 

            if(max<nums[i])
            {
                max=nums[i];
            }
        } 
         
        int start=max;
        int end=sum; 
         
        while (start<end)
        {
            int mid=start+(end-start)/2; 
            
            int ans=0;
            int pieces=1; 
            for (int i = 0; i < nums.length; i++) {
                  
                if(ans+nums[i]>mid)
                {
                    ans=nums[i];
                    pieces++;
                } 
                else
                 {
                     ans=ans+nums[i];
                 }

            } 
            if(pieces > k)
       {
           start=mid+1;
       } 
       else 
       {
            end=mid;
       }
 }
      return end; 
        
    }
}
