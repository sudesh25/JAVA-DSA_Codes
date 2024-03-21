//  https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,3,1};  
         int k=3;
         System.out.println(peakelement(arr,k));
    }   
     static int peakelement(int arr[],int k) 
     {  
        int peak=findpeak(arr); 
        int firsttry=firstfind(arr,k,0,peak); 
        if(firsttry!=-1)
        {
             return firsttry;     
        } 

        return (firstfind(arr,k,peak,arr.length-1));
     } 
     static int findpeak(int arr[]) 
     {
        int start=0;
        int end=arr.length-1; 

        while(start<end)
        {
            int mid=start+(end-start)/2; 
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            } 
            else 
            {
                start=mid+1;
            }
        }  
        return start;
     } 
     static int firstfind(int arr[],int k,int start,int end)
     {
              while(start<end)
              {
                int mid=start+(end-start);
                if(arr[mid]==k)
                {
                    return mid;
                } 
                 if(arr[mid]>k)
                {
                    end=mid-1;
                }  
                else 
                {
                    start=mid+1;
                }
              }  
              return -1;
     }
}
