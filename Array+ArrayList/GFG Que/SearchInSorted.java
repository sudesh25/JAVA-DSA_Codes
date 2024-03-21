// https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1

public class SearchInSorted {
    public static void main(String[] args) {
         int arr[]={1,2,3,4,6};
         int n=arr.length;  
         int k=12;
         System.out.println(searchInSorted(arr,n,k));
    } 
    static int searchInSorted(int arr[], int N, int K) 
    {
           for (int i = 0; i < N; i++) {
               
               if(arr[i]==K)
               {
                return 1;
               } 

           } 
           return -1;
    }
} 
