public class PatternXVII {
       public static void main(String args[]) 
       {
        for(int i=1;i<=4;i++) 
        {     
             for(int k=4;k>=i;k--) 
                {
                    System.out.print(" ");
                }
            for(int j=1;j<=4;j++) 
            {    
               
                if(j==1||j==4||i==1||i==4) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n\n");
        }
       }
} 
