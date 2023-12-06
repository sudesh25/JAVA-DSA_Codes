//https://leetcode.com/problems/matrix-diagonal-sum/
public class Matrix_Diagonal_Sum {
    static int diagonalSum(int[][] mat) 
     {  
        int sum=0;
        int m=mat.length;
             for (int i = 0; i < m; i++)
              {
                 for (int j = 0; j < mat[i].length; j++)
                {
                    if(i==j || j==(mat[i].length-1)-i) 
                    {
                       sum=sum+mat[i][j];
                    }
                }
             }
        return sum;
    }
    public static void main(String[] args) 
    {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}  };  
   System.out.println(diagonalSum(arr));
      
}
}
