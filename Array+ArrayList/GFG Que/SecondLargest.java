// https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

public class SecondLargest {
    public static void main(String[] args) {
         int Arr[] = {12, 35, 1, 10, 34, 1};
         System.out.println(print2largest(Arr));
      
    }
   static  int print2largest(int arr[]) {
         
         int max=arr[0];
         for (int i = 0; i < arr.length; i++) {
               if(max<arr[i])
               {
                max=arr[i];
               } 
              
          } 
          int max2=0;  

          for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max  &&  max2<arr[i])
            {
             max2=arr[i];
            } 
          } 
          return max2;
    }
}
