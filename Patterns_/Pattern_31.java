public class Pattern_31 {    hgbhfghytd
    public static void main(String args[])
    {
        int n=4; 
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                 if(i==1 || i==n || j==1 || j==n)
                 {
                    System.out.print(n);
                 }
                 else if(i==2 || i==n-1 || j==2 || j==n-1)
                 {
                    System.out.print(n-1);
                 }
                  else if(i==3 || i==n-2 || j==3 || j==n-2)
                 {
                    System.out.print(n-2);
                 }
                  else if(i==4 || i==n-3 || j==4 || j==n-3)
                 {
                    System.out.print(n-3);
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
