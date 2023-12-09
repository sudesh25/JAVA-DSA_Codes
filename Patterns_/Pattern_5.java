public class Pattern_5 {
    public static void main(String args[]) 
    {
       int n=4; 
       for(int i=1;i<=2*n-1;i++) 
       { int totalcol;
        if(i<=n) 
        {
             totalcol=i;
        }
        else{ 
            totalcol=2*n-i;

        }
        for(int j=1;j<=totalcol;j++) 
        {  
           System.out.print("* ");
        }
        System.out.print("\n");
       }
    }
}
