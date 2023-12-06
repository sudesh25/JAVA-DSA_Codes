//https://leetcode.com/problems/transpose-matrix/submissions/
//import java.util.*;
public class Transpose_matrix { 
    static int[][] transpose(int[][] matrix) {
      
        
        int[][] answer = new int[matrix.length][matrix[0].length];
     for(int i=0; i < matrix.length; i++){
         for (int j = 0; j < matrix[0].length; j++){
             answer[j][i] = matrix[i][j];
         } 
     }
     return answer;
 }

    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        
         int ans[][]=transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            } 
            System.out.println();
        }
    } 
}

