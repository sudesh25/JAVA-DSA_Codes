public class SortedArray {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,9,8,9}; 
        Sorted (arr,0);
     } 
     public static void Sorted(int arr[],int index)
     {
           if(index==arr.length-1)
           { 
            System.out.println("Array is Sorted ");
            return ;
           }  
           if(arr[index]<arr[index+1])
           {
            Sorted(arr, index+1);
           }  
           else
           {
            System.out.println("Array is not Sorted "); 
            return ;
           } 


     }
}
