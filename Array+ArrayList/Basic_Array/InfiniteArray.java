public class InfiniteArray {
    public static void main(String[] args) {
         
     int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};  
     int k=8;
     System.out.println(Infinite(arr,k));
    } 
    static int Infinite(int arr[],int k) 
    { 
       int start=0;
       int end=1; 
       
       while(k>arr[end])
      {
          int tem =end+1; 
        end=end+(end-start+1)*2; 
        start=tem;
      }

      while(start<=end)
       {
        int mid=start+(end-start)/2; 
        if(arr[mid]==k)
        {
            return mid;
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
      return -1; 
    }
}
