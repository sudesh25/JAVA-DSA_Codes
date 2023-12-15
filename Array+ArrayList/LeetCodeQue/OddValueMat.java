//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class OddValueMat {
    static int oddCells(int m, int n, int[][] indices) { 
       
       int ans[][]=new int[m][n]; 
       int x=0;
       int y=0;
       for (int i = 0; i < indices.length; i++) {
            int c=0;
            for (int j = 0; j < indices[i].length; j++) { 
                
                if(c==1)
                {
                    y=indices[i][j];
                } 
                else 
                {
                    x=indices[i][j];
                } 
                c++;
            } 
            for (int s = 0; s < ans[x].length; s++) {
                ans[x][s]++;
                
            } 
            for (int k = 0; k < ans.length; k++) {
                ans[k][y]++;
                
            }         
            
            
       }
        int oddnum=0;
           for (int i = 0; i < ans.length; i++) {
               for (int j = 0; j < ans[i].length; j++) { 
                 //System.out.print(ans[i][j]); 
                  int a=ans[i][j];
                    if(a%2==1) 
                    {
                        oddnum++;
                    }  
                   // System.out.println(oddnum);    
               } 
             //  System.out.println();
           }
       return oddnum;
    }
    public static void main(String[] args) {
        int arr[][]={{0,0},{0,0}};
        int m=1;
        int n=1;
        System.out.println(oddCells(m,n,arr));
    }
}
//dvfjhdgjhd