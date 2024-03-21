// https://www.geeksforgeeks.org/problems/rotation4723/1

public class Rotation {
    public static void main(String[] args) {
        int arr[]={5 ,6 ,7 ,8 ,9 , 1, 2, 3, 4};  
        System.out.println(findKRotation(arr));
        
    } 
   static  int findKRotation(int arr[] ) { 
        int pivot=findpivot(arr); 
        if(pivot==-1)
        {
            return 0;
        }  
        return (pivot+1);
         
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
}
