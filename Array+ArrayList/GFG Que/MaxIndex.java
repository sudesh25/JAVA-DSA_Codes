// https://www.geeksforgeeks.org/problems/maximum-index3307/1?page=2&category=Arrays&difficulty=Medium&status=unsolved&sortBy=submissions

public class MaxIndex {
    public static void main(String[] args) {
          
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
         System.out.println(maxIndexDiff(arr));
    } 

    static   int maxIndexDiff(int arr[]) { 
          
          int dif=0;
             for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr.length; j++) {
                     
                      if(i<=j && arr[i] <= arr[j]) 
                      {
                        if(dif<j-i) 
                        {
                             dif=j-i;
                        }
                      }

                  }
             } 
             return dif;
    }
}
