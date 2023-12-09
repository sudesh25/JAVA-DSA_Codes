public class Pattern_23 {                   //only work on n=3;
    public static void main(String args[]) 
    {
        int n=3;               
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=3*n;j++) 
            {
                if( j==n-i+1 || j==n+i-1 || j==2*n-i+2 || j==2*n+i) 
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            } 
            System.out.print("\n");
        }
    }
}
