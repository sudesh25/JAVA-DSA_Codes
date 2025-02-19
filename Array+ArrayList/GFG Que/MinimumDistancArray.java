// https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

public class MinimumDistancArray {
       public static void main(String args[])
       {
      
       int  A[] = {1,2,3,2};
       int  x = 1;
       int  y = 2; 
       System.out.println(minDist(A,x,y));
       } 
     static  int minDist(int a[],int x, int y) {
        int xcount=0; 
        int ycount;
        int flag = 0;
         for (int i = 0; i < a.length-1; i++) {
                
                if(a[i] == x){
                   xcount=i+1; 
                   flag = 1;
                }  
                if(flag == 1)
                {
                    if(a[i]==y)
                    {
                       ycount=i+1; 
                       return (ycount -xcount);
                    }
                } 
                if(a[i] == y){
                    xcount=i+1; 
                    flag = 1;
                 } 
                
                if(flag == 2)
                {
                    if(a[i]==x)
                    {
                       ycount=i+1; 
                       return (ycount -xcount);
                    }
                } 
                    
         }
         return -1;
    }
}
