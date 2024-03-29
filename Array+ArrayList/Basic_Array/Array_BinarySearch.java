public class Array_BinarySearch { 
     static int binarysearch(int arr[], int low, int high,int key)
    {
        if (high < low) 
        {
            return -1; }
 
        /*low + (high - low)/2;*/
        int mid = (low + high) / 2;
        if (key == arr[mid]){
            return mid;}
        if (key > arr[mid]){
            return binarysearch(arr, (mid + 1), high, key);}
            else {
        return binarysearch(arr, low, (mid - 1), key);}
    }
 
     public static void main(String args[])
     {
        int arr[]={12,13,22,35,45,56,78};
        int n=arr.length-1;
        int x=56; 
        int position=binarysearch(arr,0,n,x);
        if(position==-1)
        {
            System.out.println("Element not found ");
        } 
        else {
            System.out.println("Element found at position : "+(position+1));
        }

     }}

