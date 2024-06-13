// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

public class RowWithMax1s {
    public static void main(String[] args) {
       int  N = 4 ;
       int  M = 4 ;
       int  Arr[][] = {{0, 1, 1, 1},
                   {0, 0, 1, 1},
                   {1, 1, 1, 1},
                   {0, 0, 0, 0}}; 
                   System.out.println(rowWithMax1s(Arr,N,M));
    } 
   static int rowWithMax1s(int arr[][], int n, int m) {
         
    int ans2=0;
    int index=-1;

    for ( int i = 0; i < arr.length; i++) {  
       int ans=0; 
        for (int j = 0; j < arr[i].length; j++) {
             if(arr[i][j]==1)
             {
                ans++;
             }
        }
        if(ans2<ans)
        {
           ans2=ans; 
           index=i;
        }
    } 
    return index;
    }
} 


