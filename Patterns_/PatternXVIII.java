public class PatternXVIII {
         public static void main(String args[]) 
         {
            for(int i=1;i<=5;i++) 
            {
                for(int j=4;j>=i;j--) 
                {
                    System.out.print(" "); 

                }    
                   System.out.print("1 "); 
                if(i==3) 
                {
                    System.out.print("2 ");
                }if(i==4) 
                {
                    System.out.print("3 3 ");
                } 
                if(i==5) 
                {
                    System.out.print("4 6 4 ");
                }
                if(i>1) 
                {
                    System.out.print("1 ");
                }
                System.out.print("\n\n");
            }
         }
}
