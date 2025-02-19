// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Strings&sortBy=submissions

public class MissingEleArray {
      public static void main(String[] args) {
       int  arr[] = {1,2,3,5} ;
       System.out.println(missingNumber(arr));
      } 

      static int missingNumber( int arr[]) {
        
        int  n=arr.length+1;
        int Exsum=n*(n+1)/2;
        int Acsum=0;
        for (int i = 0; i < arr.length; i++) {
            Acsum = Acsum + arr[i]; 
        }
       return Exsum-Acsum;
    }
}
