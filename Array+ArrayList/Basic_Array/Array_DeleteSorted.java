public class Array_DeleteSorted {  
    static int delete(int arr[],int pos,int n) 
    {
        for(int i=pos;i<n;i++)
        {
            arr[i]=arr[i+1]; 

        } 
        return (n-1);
    }
    static int search( int arr[],int low,int high,int key)
    {
        if (high < low) 
        {
            return -1; }
 
        /*low + (high - low)/2;*/
        int mid = (low + high) / 2;
        if (key == arr[mid]){
            return mid;}
        if (key > arr[mid]){
            return search(arr, (mid + 1), high, key);}
            else {
        return search(arr, low, (mid - 1), key);}
    }
     public static void main(String args[])
     {
        int arr[]={11,22,34,54,67,78,89};
        int x=67;

        int n=arr.length-1; 
        for(int i=0;i<n;i++)
        {
            System.out.println("Element before deletion: "+arr[i]);
        }
        int pos=search(arr,0,n,x);  
        System.out.println(pos);
        if(pos==-1) 
        {
            System.out.println("Element not found :");
        } 
        n=delete(arr,pos,n); 
        for(int i=0;i<n;i++)
        {
            System.out.println("Element after deletion: "+arr[i]);
        }

     }
}
