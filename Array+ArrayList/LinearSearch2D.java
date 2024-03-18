import java.util.*;
public class LinearSearch2D {
       public static void main(String[] args) {
          int arr[][]=  {  
                  {1,2,3},
                  {4,5,6},
                  {7,8,9}
          }; 
          int target=8;  
          int ans[] =search2D(arr,target); 
          System.out.println(Arrays.toString(ans));
          

       } 
       static int [] search2D(int arr[][] , int target) 
       { 
        int ans []=new int[2];
        for (int i = 0; i < arr.length; i++) {
             
            for (int j = 0; j < arr[i].length; j++) {
                 if(arr[i][j]==target)
                 {
                    ans[0]=i;
                    ans[1]=j;
                 }
            }
        } 
        return ans;
       }
}
