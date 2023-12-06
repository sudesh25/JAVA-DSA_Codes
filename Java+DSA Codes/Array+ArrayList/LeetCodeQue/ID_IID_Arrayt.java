//https://leetcode.com/problems/convert-1d-array-into-2d-array/submissions/
public class ID_IID_Arrayt { 
    static int[][] construct2DArray(int[] original, int m, int n) {
        
        if(m*n!=original.length)
        {
           int emptyarray[][]={{0}}; 
           return emptyarray;
        } else 
        {   
            int ans[][]=new int [m][n];
            int a=0;
            for (int i = 0; i < m; i++) { 
                for (int j = 0; j < n; j++) {
                    ans[i][j]=original[a];
                    a++;
                }
                
            } 
            return ans;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int m=2;
        int n=2; 
        int ans[][]=construct2DArray(arr,m,n);
        for (int i = 0; i < ans.length; i++) { 
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
