public class BinarySearch_1 {
    public static void main(String[] args) {
         
        int arr[]={5,4,3,2,1}; 
        int target=2; 
        System.out.println(BinarySearch(arr,target));
    } 
    static int BinarySearch(int []arr,int target)
    {   int start=0;
        int end =arr.length-1;
        boolean isasc= (arr[start]<arr[end]);  
        
        while(start<=end)
        {
           int mid=start+(end - start)/2; 

           if(arr[mid]==target) 
        {  
            return mid;
        } 
           
        else if(isasc) 
        {
            if(target > arr[mid]) 
            {
                start=mid+1;
            } 
            else 
            {
                end=mid-1;
            }
        }  
        else 
        {
            if(target < arr[mid]) 
            {
                start=mid+1;
            } 
            else 
            {
                end=mid-1; 
            }
        } 
        

        } 
        return -1;
       
    }
}
 