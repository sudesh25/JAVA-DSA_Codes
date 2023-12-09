public class Pattern_24 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {   
            for(int j=1;j<=2*n;j++)
            {
                if(j==1 || j==2*n)
                {
                    System.out.print("*");
                }
                else if(i==j || j==2*n-i+1)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        } 
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j==1 || j==2*n)
                {
                    System.out.print("*");
                }
                else if(i==j || j==2*n-i+1)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
