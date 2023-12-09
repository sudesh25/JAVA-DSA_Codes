public class Pattern_22 {
    public static void main(String argfs[])
    {
        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               if((i+j)%2 == 0)
               {
                System.out.print("1 ");
               }
               else
               {
                System.out.print("0 ");
               }
            }
            System.out.print("\n");
        }
    }
}
