// https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/0

public class RowWithMinimumNumberOfOnes {
      public static void main(String[] args) {
        int n = 4;
        int m = 4;
      int [][]  a = {{1, 1, 1, 1},
                     {1, 0, 0, 0}, 
                     {0, 0, 1, 1},
                     {0,0,0,0}} ;  
                     System.out.println(minRow(n,m,a));

      }  
    static  int minRow(int n, int m, int a[][]) {
           
         int ans2=0;
         int index=0;

         for ( int i = 0; i < a.length; i++) {  
            int ans=0; 
             for (int j = 0; j < a[i].length; j++) {
                  if(a[i][j]==1)
                  {
                     ans++;
                  }
             }  
             if(i==0) 
             {
                ans2=ans;
             }
             if(ans2>ans)
             {
                ans2=ans; 
                index=i;
             }
         } 
         return index+1;
    }
}

