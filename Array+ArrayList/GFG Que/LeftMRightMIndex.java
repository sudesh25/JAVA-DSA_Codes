// https://www.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions
import java.util.*;
public class LeftMRightMIndex {
    public static void main(String[] args) {
        int v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int X = 7; 
        System.out.println(Arrays.toString(index(v,X)));
    } 
    static int [] index(int arr[],int x) 
    {
        int ans[]=new int [2];  
         ans[0] =findindex(arr,x,true);
         ans[1]=findindex(arr,x,false); 

        
        return ans; 
    } 
    static int findindex(int arr[],int k,boolean flag)
    {   int mid=-1;
        int start =0;
        int end =arr.length-1; 
        int ans=-1;
        while(start<end)
        {
            mid=start+(end-start)/2;  
           if(flag==true) 
           {
            if(arr[mid]==k)
            {
                end=mid-1;
                ans=mid;
            } 
            else if(arr[mid]>k)
            {
                end=mid-1;
            } 
            else 
            {
                start=mid+1;
            }
           } 
           else 
           {
            if(arr[mid]==k)
            {
                start=mid+1;
                ans=mid;
            } 
            else if(arr[mid]>k)
            {
                end=mid-1;
            } 
            else 
            {
                start=mid+1;
            }
           }
        } 
        return ans;
          
    }
}
