public class Pattern_14 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++) 
        {
            for(int j=1;j<=2*n-1;j++) 
            {
                if(i==1)
                {
                    System.out.print("*");
                }
                else 
                {
                    if(j==i || j==2*n-i) 
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                } 
               
            } 
             System.out.print("\n");
        }
    }
}
