public class PatternXV {
     public static void main(String args[]) 
     {  int i,j,k,l,m,n,p;
        for(i=1;i<=4;i++)
        {
            for(j=3;j>=i;j--) 
            {
               System.out.print(" ");
            }  
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            } 
            for(k=2;k<=i;k++) 
            {
                System.out.print("*");
            } 
            System.out.print("\n");
        } 
        for(m=1;m<=4;m++) 
        {   
            for(l=2;l<=m;l++) 
           {
            System.out.print(" ");
           }  
           for(n=4;n>=m;n--) 
           {
            System.out.print("*");
           }  
           for(p=3;p>=m;p--) 
           {
            System.out.print("*");
           }

            System.out.print("\n");
        }
     }
}
