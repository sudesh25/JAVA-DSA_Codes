//  https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotetedSortedArray {
    public static void main(String[] args) {
         int arr[]={1,3};  
         int k= 1; 
         System.out.println(search(arr,k));
    } 
     static int search(int arr[],int k)
     {  
          if(arr.length==1)
        {
            if(arr[0]==k)
            {
                return 0;
            }  
            else 
            return -1;
        }
        int pivot=findpivot(arr); 
          
        if(pivot==-1)
        {   
             return firstfind(arr,k,0,arr.length-1); 
        }   
        if(arr[pivot]==k)
        {    
            return pivot;
        }  
       

        int firsttry=firstfind(arr,k,0,pivot-1);  
        if(firsttry!=-1)
        {   
            
             return firsttry;     
        } 

        return (firstfind(arr,k,pivot+1,arr.length-1));
     } 
     static int findpivot(int arr[])
     {
        int start=0;
        int end=arr.length-1; 
        while(start<end)
        {
            int mid=start+(end-start)/2;
                       
                  if(mid<end && arr[mid]>arr[mid+1]) {
                    return mid;
                  } 
                  if (mid>start && arr[mid]<arr[mid-1]){
                    return mid-1;
                  }  
                  if(arr[mid]<=arr[start]){
                    end=mid-1;
                  } 
                  else {
                    start=mid+1;
                  }
                     
        }  
       
        return -1;
         
     } 
     static int firstfind(int arr[],int k,int start,int end)
     {
              while(start<=end)
              {
                int mid=start+(end-start)/2;
                if(arr[mid]==k)
                {   
                   
                    return mid;
                } 
                 if(arr[mid]<k)
                {
                    start=mid+1;
                }  
                else 
                {
                   end=mid-1;
                }
              }   

              return -1;
     }
}
