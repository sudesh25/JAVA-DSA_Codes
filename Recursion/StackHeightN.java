public class StackHeightN {
     public static void main(String[] args) {
        int x=2;
        int n=5;
      System.out.println(Pow(x, n));
     } 
     public static int  Pow(int x,int n)
     {  
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int xpownm1=Pow(x,n-1); 
        int xpown=x*xpownm1; 
        return xpown;

     }
}
