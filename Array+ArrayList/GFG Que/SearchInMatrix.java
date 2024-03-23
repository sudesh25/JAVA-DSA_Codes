//  https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1

public class SearchInMatrix {
       
     public static void main(String[] args) {
         int arr[][]={ 
                         {3 ,30 ,38},
                         {44 ,52 ,54},
                         {57 ,60 ,69},
                     } ;  
         int N=3;
         int M=3; 
         int x=6;
         System.out.println(matSearch(arr,N,M,x));

     } 
     static int matSearch(int mat[][],int N, int M, int X)
     {
        for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat[i].length; j++) {
                  
                if(mat[i][j]==X)
                {
                    return 1;
                }
             }
        } 
        return 0;
     }
}
