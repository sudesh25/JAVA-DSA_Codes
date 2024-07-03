public class PossiblePaths {
    
     public static int countpath(int m,int n,int i,int j)
     {  
        if(i==m || j==n)
        {
            return 0; 
        }
        if(i==m-1 && j==n-1) 
        {
            return 1;
        }
       int downpath=countpath(m, n, i+1, j) ;
       int rightpath=countpath(m, n, i, j+1); 

        return downpath+rightpath;
     }
    public static void main(String[] args) {
       int m=3;
       int n=3; 
       System.out.println(countpath(m, n, 0, 0));
    }
}
