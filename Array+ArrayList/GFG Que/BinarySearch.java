// https://www.geeksforgeeks.org/problems/binary-search-1587115620/0

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2, 3 ,4 ,5};
        int n=5;
        int k=4; 
        System.out.println(binarysearch(arr,n,k));
    } 
    static int binarysearch(int arr[], int n, int k) 
    {
        int start=0;
        int end =arr.length-1; 
        while(start<end)
        {   int mid=start+(end-start)/2; 
            if(arr[mid]==k)
            {
                return mid;
            }
             else if(k<arr[mid])
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
