// https://www.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1

public class SortedMatrixSearch {
     public static void main(String[] args) {
        int arr[][]={ 
            {3 ,30 ,38},
            {44 ,52 ,54},
            {57 ,60 ,69},
        } ;  
   
   int x=60;
   System.out.println(Search(arr,x));
     } 
     static boolean Search(int matrix[][],int X)
     {
        for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                  
                if(matrix[i][j]==X)
                {
                    return true;
                }
             }
        } 
        return false;
     }
}
