public class BinarySearch 
{
    public static void main(String[] args) {
               
        int arr[]={1,2,36,4,5,6,7,8,9}; 
        int target=10; 

        int start=0; 
        int end=arr.length-1;  
       
         
        while(start<=end) 
        {   
             int mid=start+(end-start)/2;

            if(arr[mid]==target) 
            {
                System.out.println(mid); 
                break;
            } 
            else if(target>arr[mid])
            {
                  start=mid+1;
            } 
            else
             {
                end=mid-1;
             }
 
        } 
        System.out.println("Not Found");
    }
}