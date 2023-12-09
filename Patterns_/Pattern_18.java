public class Pattern_18{
    public static void main(String args[])
    {
        {   int n=6;
            for(int i=1;i<=n;i++) 
            {
              for(int j=1;j<=2*n-1;j++) 
              {
                if(j>=n-i+2 && j<=n+i-2) 
                {
                    System.out.print(" ");
                }
                else 
                {
                    System.out.print("*");
                }
              }
              System.out.print("\n");  
        } 
        for(int i=1;i<=n;i++) 
            {
              for(int j=1;j<=2*n-1;j++) 
              {
                if(j>=i+1 && j<=2*n-i-1) 
                {
                    System.out.print(" ");
                }
                else 
                {
                    System.out.print("*");
                }
              }
              System.out.print("\n");
            }
    } 
    }
}