//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length; 
        System.out.println(largest(arr,n));
    } 
    static  int largest(int arr[], int n) 
    {
        int large=arr[0];
        for (int i = 0; i < arr.length; i++) {
             
            if(large<arr[i])
            {
                large=arr[i];
            } 

        } 
        return large;
    }
}   
