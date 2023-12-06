public class Reverse_Array {
    public static void main(String[] args) { 
        int temp;
        int arr[]={12,34,54,324,23,546,76};
        int n=arr.length-1;
        for(int i=0;i<n/2;i++) 
        {
           temp=arr[i];
           arr[i]=arr[n-i];
           arr[n-i]=temp;
        } 
         for(int i=0;i<arr.length;i++) 
         {
            System.out.print(arr[i]+" ");
         }
} 
}
    