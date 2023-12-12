//https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1
public class SumElement{  
     static int Sumele(int arr[],int n) 
     {
         int sum=0; 
         for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
         } 
         return sum;
     }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int n=4; 
        System.out.println(Sumele(arr,n));
    }
}