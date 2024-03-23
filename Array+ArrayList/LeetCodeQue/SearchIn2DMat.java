// https://leetcode.com/problems/search-a-2d-matrix/description/

public class SearchIn2DMat {
    public static void main(String[] args) {
             int arr[][]=  { 
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
             }; 
             int k=3;   
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
