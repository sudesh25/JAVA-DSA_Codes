//https://leetcode.com/problems/remove-element/
import java.util.*;
public class Remove_Element { 
    static int removeElement(int[] nums, int val) {   
        
        int count=0; 
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val) 
            { 
                     for (int j = i; j < nums.length; j++) { 

                     if(j!=nums.length-1) 
                     {
                        nums[j]=nums[j+1];
                     }
              }  
               count++;      
            }
         } 
          count=nums.length-count;
        System.out.println(Arrays.toString(nums));
        return count;
}  
    public static void main(String[] args) {
        int arr[]={4,5,3,5,2,3,2,2,3};
        int n=3;
        System.out.println(removeElement(arr,n));
    }

}
