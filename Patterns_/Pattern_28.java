public class Pattern_28 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {   for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
        for(int i=1;i<=n-1;i++)
        {   
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
