//https://leetcode.com/problems/reshape-the-matrix/description/
public class Reshape_Matrix { 
    static int[][] matrixReshape(int[][] mat, int r, int c) { 
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c) 
        {
            return mat;
        }
    
        
         if(r==mat.length && c==mat[0].length)
         {
             return mat;
         }
         int arr[][]=new int [r][c];
        int Oc=0;
        int Or=0;
       for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
              
                 arr[Or][Oc]=mat[i][j];
                 Oc++;
                 if(Oc==c) 
                 {
                     Or++;
                     Oc=0;
                 }
                }
            } 
            
            return arr;
       }

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4}};
        int r=2; 
        int c=2; 
        int ans[][]=matrixReshape(arr,r,c);
        for (int i = 0; i < ans.length; i++) { 
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}