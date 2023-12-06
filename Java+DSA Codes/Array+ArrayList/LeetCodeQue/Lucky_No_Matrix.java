import java.util.*;

public class Lucky_No_Matrix { 
    static int min(int matrix[][],int i)
    {    
        int n=matrix[i][0]; 
        for (int j = 0; j < matrix[i].length; j++) {
            
            if(matrix[i][j]>n) 
            {
                n=matrix[i][j];
            }
        } 
        return n;
    } 
   
    
    
    static List<Integer> luckyNumbers (int[][] matrix) {  
        ArrayList<Integer> list =new ArrayList<>(); 
        for (int i = 0; i < matrix.length; i++) { 
            int n=min(matrix,i);
            for (int j = 0; j < matrix[i].length; j++) {
                int m=matrix[j][i]; 
                if(
                    m>matrix[j][i]) 
                {
                   m=matrix[j][i];
                } 
                if(m==n) 
                {
                    list.add(matrix[i][j]);
                }
            }
        } 
        return list;
       
    }
    public static void main(String[] args) {
        int arr[][]={    
                      {3,7,8},
                      {9,11,13},
                      {15,16,17}
        };
        System.out.println(luckyNumbers(arr));

        
    } 
}
