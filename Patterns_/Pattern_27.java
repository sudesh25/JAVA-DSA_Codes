public class Pattern_27 {
    public static void main(String args[])
    {
        int n=4,num=1;
        for(int i=1;i<=n;i++) 
        {   
            for(int j=1;j<= 2*n;j++)
            { 
                if(num<10)
                {
                    System.out.print(" ");
                }
                if(j>=i && j<=2*n-i+1)
                {
                    System.out.print(num+" ");
                    num++;
                }else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
