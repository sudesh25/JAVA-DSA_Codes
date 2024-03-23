// SearchIn2DMat

public class SearchIn2DMatII {
    public static void main(String[] args) {
        int arr[][]=  { 
                           {1,4,7,11,15},
                           {2,5,8,12,19},
                           {3,6,9,16,22},
                           {10,13,14,17,24},
                           {18,21,23,26,30},
                      }; 
        int k=90;   
        System.out.println(searchMatrix(arr,k));                  
} 
static boolean searchMatrix(int[][] matrix, int target) {
    
   int r=0;
   int c=matrix[r].length-1; 
    
   while(r<matrix.length && c>=0)
   {
       if(matrix[r][c]==target)
       {
            return true;
       }
       else if (matrix[r][c]>target)
       {
           c--;
       } 
       else
        {
           r++;
        }
   } 
   return false;
}
}
