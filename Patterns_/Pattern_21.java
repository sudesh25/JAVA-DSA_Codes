public class Pattern_21 {
    public static void main(String args[])
    {   
        int n=8,num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) 
            {
                if(num<10) 
                {
                    System.out.print(num+"  ");
                }
                else 
                {
                    System.out.print(num+" ");
                } 
                num++;
            }
            System.out.print("\n");
        }
    }
}
