public class Pattern_25 {
    public static void main(String args [])
    {
        int n=9;
        for(int i=1;i<=n;i++) 
        {   for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(i==1 || i==n || k==1 || k==n)
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
