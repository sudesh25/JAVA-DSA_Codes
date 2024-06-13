// https://www.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1

public class SearchPosition {
    public static void main(String args[])
    {
        int N = 4;
      int []  Arr = {1, 3, 5, 6};
       int  k = 5; 
       System.out.print(searchInsertK(Arr,N,k));
    } 
    static int searchInsertK(int Arr[], int N, int k)
    {
          for (int i = 0; i < Arr.length; i++) {
              if(Arr[i]==k)
              {
                return i;
              } 
              if(Arr[i]>k)
              {
                return i;
              }
          }     
          return Arr.length;    
    }
}
